import java.util.Random;
import java.util.Scanner;

class guessnum {
    int num;
    int ran;
    int noofguesses;
    public int guessnum(int ran) {
        Random R = new Random();
        ran = R.nextInt(100);
        return ran;
    }

    public int takeuserinput(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess The Number : ");
        num = s.nextInt(100);
        return num;
    }

    public void iscorrect() {
        if (num == ran) {
            System.out.println("Your Guess is Right ! ");
        } else if (num<ran) {
            System.out.println("The Number Is Smaller ! ");
        }
        else if(num>ran){
            System.out.println("The Number Is Greater ! ");
        }
    }
}

public class exer1 {
    public static void main(String[] args) {

    }
}
