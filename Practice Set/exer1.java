import java.util.Random;
import java.util.Scanner;

class Guessnum {
    int num;
    int ran;
    int noofguesses=0;
    public int guessnum() {
        Random R = new Random();
        ran = R.nextInt();
        return ran;
    }

    public int takeuserinput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Guess The Number : ");
        num = s.nextInt();
        return num;
    }

    public void iscorrect() {
        while(num==ran){
            if (num == ran) {
                System.out.println("Your Guess is Right ! ");
            } else if (num<ran) {
                System.out.println("The Number Is Smaller ! ");
            }
            else if(num>ran){
                System.out.println("The Number Is Greater ! ");
            }
            noofguesses++;
        }
    }
    public void guesses(){
        if(noofguesses<=3){
            System.out.println("Pro Player ! ");
        }
        else if(noofguesses>=3 && noofguesses<=7){
            System.out.println("Good Player ! ");
        }
        else{
            System.out.println("Bad Player ! ");
        }
    }
}

public class exer1 {
    public static void main(String[] args) {
        Guessnum G = new Guessnum();
        G.guessnum();
        G.takeuserinput();
        G.iscorrect();
        G.guesses();
    }
}
