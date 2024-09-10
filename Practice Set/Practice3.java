// <----------------------------------------Q-1--------------------------------------->

class Circle {
    public int radius;

    Circle(int rad) {
        this.radius = rad;
        System.out.println("This Is Parameterized Constructor");
    }

    public void Area(int r) {
        this.radius = r;
        System.out.println("Area : " + 3.14 * r * r);
    }
}

class Cylinder extends Circle {
    public int height;
    Cylinder(int rad,int height){
        super(rad);
        this.height=height;
        System.out.println("This Is Parameterized Constructor");
    }

    public void Volume() {
        System.out.println("Volume Of Cyinder : " + 3.14 *this.radius*this.radius*height);
    }
}

// <-----------------------------------------------Q-2------------------------------->


public class Practice3 {
    public static void main(String[] args) {
        // Circle clr = new Circle();
        // clr.Area(4);
        Cylinder cyl = new Cylinder(4,5);
    }
}
