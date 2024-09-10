// <----------------------------------------Q-1--------------------------------------->
class Circle {
    public int radius;

    public void setRad(int rad) {
        this.radius = rad;
    }

    public void Area(int r) {
        this.radius = r;
        System.out.println("Area : " + 3.14 * r * r);
    }
}

class Cylinder extends Circle {
    public int height;

    public void Volume(int h, int rad) {
        System.out.println("Volume Of Cyinder : " + 3.14 * rad * rad * h);
    }
}

// <-----------------------------------------------Q-2------------------------------->


public class Practice3 {
    public static void main(String[] args) {
        // Circle clr = new Circle();
        // clr.Area(4);
        Cylinder cyl = new Cylinder();
        cyl.Volume(4, 5);
    }
}
