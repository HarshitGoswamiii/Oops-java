
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

// -------------------Q-3 & 5-------------->
// interface BasicAnimal {
//     public void eat();

//     public void sleep();
// }

// class Monkey {
//     public void jump() {
//         System.out.println("Jumping....");
//     }

//     public void bite() {
//         System.out.println("Biting....");
//     }
// }

// class Human extends Monkey implements BasicAnimal {
//     public void eat() {
//         System.out.println("Eating.....");
//     }

//     public void sleep() {
//         System.out.println("Sleeping.....");
//     }
// }

// ----------------------------------Q-6----------------->
interface TVremote {
    public void Buttons();

    public void Commands();
}

interface SmartTVRemote extends TVremote {
    public void Assistant();
}

class SmartTv implements SmartTVRemote {
    public void Buttons() {
        System.out.println("Press Button.....");
    }

    public void Commands() {
        System.out.println("Give Commands.....");
    }

    public void Assistant() {
        System.out.println("Tap to Speak !");
    }
}

public class practice4 {
    public static void main(String[] args) {

        // Q-1 & 2
        // Pen1 p = new Pen1();
        // p.Write();
        // p.Refill();
        // p.changeNib(0.2f);

        // Q-3
        // Human h = new Human();
        // h.sleep();
        // h.eat();
        // h.bite();
        // h.jump();

        // Q - 5 ---> Performing POLYMORPHISM
        // BasicAnimal bs = new Human();
        // bs.sleep();
        // bs.jump(); ---Throws an Error Because it only use basic Animal functions not
        // other

        // Q - 6 & 7
        SmartTv sm = new SmartTv();
        sm.Assistant();
        sm.Commands();
        sm.Buttons();

        
    }
}
