import java.util.Random;
import java.util.Scanner;

class guessnum {
    int num;
    int ran;

    public guessnum(int ran) {
        Random R = new Random();
        ran = R.nextInt();
    }

    public void takeuserinput(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number");
        num = s.nextInt();
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
