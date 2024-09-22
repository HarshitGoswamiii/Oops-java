import problem.java.Rectangle;

abstract class Shape {
    abstract public void area(); // abstract class for calculating area

    abstract public void perimeter(); // abstract class for calculating perimeter

}

class Square extends Shape {
    int a = 3;

    // Constructor of Square
    Square() {
        System.out.println("Square ! ");
    }

    // Calculates Area
    @Override
    public void area() {
        System.out.println("Area of Square : " + a * a);
    }

    // Calcultes Perimeter
    @Override
    public void perimeter() {
        System.out.println("Perimeter of Sqaure : " + 4 * a);
    }
}

class Rectangle extends Shape {
    int length = 4;
    int breadth = 6;

    // Constructor of Rectangle
    Rectangle() {
        System.out.println("Rectangle !");
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle : " + length * breadth);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle : " + (length + breadth) * 2);
    }
}

public class tutorials {
    public static void main(String[] args) {
        // Shape sh = new Shape(); ---> it throws error bcz it is abstract classs ,So it
        // cannot be instantiated;
        Square s = new Square();
        s.area();
        s.perimeter();

        Rectangle rec = new Rectangle();
        rec.area();
        rec.perimeter();
    }
}
