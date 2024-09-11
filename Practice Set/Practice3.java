// <----------------------------------------Q-1--------------------------------------->

class Circle {
    public int radius;

    Circle(int rad) {
        this.radius = rad;
        System.out.println("This Is Parameterized Circle Constructor");
    }

    public void Area(int r) {
        this.radius = r;
        System.out.println("Area : " + 3.14 * r * r);
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int rad, int height) {
        super(rad);
        this.height = height;
        System.out.println("This Is Parameterized Constructor");
    }

    public void Volume() {
        System.out.println("Volume Of Cyinder : " + 3.14 * this.radius * this.radius * height);
    }
}

// <-----------------------------------------------Q-2------------------------------->
class Rectangle {
    int length;
    int breadth;
    int height1;

    void Rectanle() {
        System.out.println("It is Rectangle Class ! ");
    }

    public void setx(int len, int bre, int hei) {
        this.length = len;
        this.breadth = bre;
        this.height1 = hei;
    }

    public void area() {
        System.out.println("Area of Rectangle : " + length * breadth);
    }

    public void volume() {
        System.out.println("Volume of Rectangle : " + length * breadth * breadth);
    }
}

class Cuboid {
    void Cuboid() {
        System.out.println("It is Cuboid Class ! ");
    }

    public void area(int len, int bre, int hei) {
        System.out.println("Area of Cuboid : " + 2 * ((len * bre) + (bre * hei) + (hei * len)));
    }
}

public class Practice3 {
    public static void main(String[] args) {
        // Circle clr = new Circle();
        // clr.Area(4);
        Cylinder cyl = new Cylinder(4, 5);
    }
}
