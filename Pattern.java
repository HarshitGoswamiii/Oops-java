class patterns {
    public void pattern1() {
        for (int i = 4; i > 0; i++) {
            for (int j = i; j > 0; j++) {
                System.out.print("*");
            }
            System.out.println("");
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
        p.pattern1();
    }
}
