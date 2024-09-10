class Circle {
    public int radius;

    public void Area(int r) {
        this.radius = r;
        System.out.println("Area : " + 3.14 * r * r);
    }
}

class Cylinder extends Circle {
    public int height;

    public void Area(int h) {
        System.out.println("Area Of Cyinder : " + 2 * 3.14f * radius * (radius + h));
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Circle clr = new Circle();
        clr.Area(4);
        Cylinder cyl = new Cylinder();
        cyl.Area(5);
    }
}
