class patterns {
    public void pattern1() {
        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int b = 1; b <= (a - i - 1); b++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern3() {
        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int b = (a - i - 1); b > 1; b--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern11() {
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        patterns p = new patterns();
        // p.pattern2();
        // p.pattern11();
        // p.pattern1();
        p.pattern3();
    }
}
