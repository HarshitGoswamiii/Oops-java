package NewPackage;

import java.util.Scanner;

class Calculator {
    int a = 10;
    int b = 12;
    public void printing() {
        System.out.println("This is Simple Calculator ! ");
        System.out.println(a + b);
    }
}
class ScCalculator {
    int a = 10;
    int b = 3;
    public void printing() {
        System.out.println(a * b);
        System.out.println("This is Sc Calculator ! ");
    }
}
class HybridCalculator {
    int a = 10;
    int b = 2;
    public void printing() {
        System.out.println(a ^ b);
        System.out.println("This is Hybrid Calculator ! ");
    }
}
public class calc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                Calculator c1 = new Calculator();
                c1.printing();
            }
            case 2 -> {
                ScCalculator c2 = new ScCalculator();
                c2.printing();
            }
            case 3 -> {
                HybridCalculator c3 = new HybridCalculator();
                c3.printing();
            }
        }
    }
}