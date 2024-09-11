import java.util.Random;
import java.util.Scanner;

class Guessnum {
     int num; 
     int ran;
     int noofguesses = 0;

    public int guessnum(int maxnum) {
        Random R = new Random();
        ran = R.nextInt(maxnum) + 1;
        return ran;
    }

    public int takeuserinput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Guess The Number : ");
        num = s.nextInt();
        return num;
    }

    public void iscorrect(int number) {
        if (num == ran) {
            System.out.println("Your Guess is Right ! ");
        } else if (num < ran) {
            System.out.println("The Number Is Smaller ! ");
        } else if (num > ran) {
            System.out.println("The Number Is Greater ! ");
        }
        noofguesses++;
    }

    public void guesses() {
        System.out.println("No. of Guesses : "+noofguesses);
        if (noofguesses <= 3) {
            System.out.println("Pro Player ! ");
        } else if (noofguesses >= 3 && noofguesses <= 7) {
            System.out.println("Good Player ! ");
        } else {
            System.out.println("Bad Player ! ");
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Guessnum G = new Guessnum();
        int maxnum = 10;
        int random = G.guessnum(maxnum);
        int userinput ;
        do {
            userinput=G.takeuserinput();
            G.iscorrect(userinput);
        } while (userinput != random);
        G.guesses();
    }
}
