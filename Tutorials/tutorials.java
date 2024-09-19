abstract class Shape {
    abstract public void area();

    abstract public void perimeter();

    abstract public void volume();
}

class Sqaure extends Shape {
    public void area(int a) {
        System.out.println("Area of Square : " + a * a);
    }

    public void perimeter(int a) {
        System.out.println("Perimeter of Sqaure : " + 4 * a);
    }
}

public class tutorials {
    public static void main(String[] args) {

    }
}
