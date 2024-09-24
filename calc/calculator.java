package calc;

class Calcul {
    public void print() {
        System.out.println("This is Calculator");
    }
}

class ScCalculator {
    public void print() {
        System.out.println("This is Sc Calculator");
    }
}

class HybridCalculator {
    public void print() {
        System.out.println("This is Hybrid Calculator");
    }
}

public class calculator {
    public static void main(String[] args) {
        System.out.println("This is Main Class ! ");
        Calcul ch = new Calcul();
        ch.print();
    }
}
