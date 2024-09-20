// ------------------Q-1-------------------->

abstract class Pen {
    abstract public void Write();
    public void Refill() {
        System.out.println("Refilling.......");
    }
}

class Pen1 extends Pen {
    public void Write() {
        {
            System.out.println("Writing.....");
        }
    }
}

public class practice4 {
    public static void main(String[] args) {

    }
}
