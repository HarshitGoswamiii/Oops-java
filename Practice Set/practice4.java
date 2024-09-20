// ------------------Q-1-------------------->

abstract class Pen {
    float nib = 0.3f;

    abstract public void Write();

    abstract public void Refill();

    public void changeNib(float num) {
        float ch;
        ch = nib + num;
        System.out.println("Changing Nib From " + nib + " to " + ch);
    }

}

class Pen1 extends Pen {
    public void Write() {
        {
            System.out.println("Writing.....");
        }
    }

    public void Refill() {
        System.out.println("Refilling.......");
    }
}

public class practice4 {
    public static void main(String[] args) {

        // Q-1
        Pen1 p = new Pen1();
        p.Write();
        p.Refill();
        p.changeNib(0.2f);
    }
}
