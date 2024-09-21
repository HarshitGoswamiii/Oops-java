// ------------------Q-1-------------------->

// abstract class Pen {
//     float nib = 0.3f;

//     abstract public void Write();

//     abstract public void Refill();

// // ----------Q-2---------------------->
//     public void changeNib(float num) {
//         float ch;
//         ch = nib + num;
//         System.out.println("Changing Nib From " + nib + " to " + ch);
//     }

// }

// -------------------Q-3-------------->
interface BasicAnimal {
    public void eat();

    public void sleep();
}

class Monkey {
    public void jump() {
        System.out.println("Jumping....");
    }

    public void bite() {
        System.out.println("Jumping....");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void eat(){
        System.out.println("Eating.....");
    }
    public void sleep(){
        System.out.println("Sleeping.....");
    }
}

// class Pen1 extends Pen { // Q-1 & 2
// public void Write() {
// {
// System.out.println("Writing.....");
// }
// }

// public void Refill() {
// System.out.println("Refilling.......");
// }
// }

public class practice4 {
    public static void main(String[] args) {

        // Q-1 & 2
        // Pen1 p = new Pen1();
        // p.Write();
        // p.Refill();
        // p.changeNib(0.2f);

        // Q-3
        Human h = new Human();
        h.sleep();
        h.eat();
        h.bite();
        h.jump();
    }
}
