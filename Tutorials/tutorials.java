abstract class Shape {
    abstract public void area();

    abstract public void perimeter();

    // abstract public void volume();
}

class Square extends Shape {
    int a = 4;
    public void area() {
        System.out.println("Area of Square : " + a * a);
    }

    public void perimeter() {
        System.out.println("Perimeter of Sqaure : " + 4 * a);
    }
}

public class tutorials {
    public static void main(String[] args) {
        Square s = new Square();
        s.area();
        s.perimeter();
    }
}
