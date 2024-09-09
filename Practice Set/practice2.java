class cylinder {
    private int radius;
    private int height;

    public void setradius(int r) {
        radius = r;
    }

    public void getradius() {
        System.out.println("Radius : " + radius);
    }

    public void sethieght(int h) {
        height = h;
    }

    public void getheight() {
        System.out.println("Height : " + height);
    }
    public void surfacearea(){
        System.out.println("Surface area : "+2*3.14*radius*(radius*height));
    }
}

public class practice2 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setradius(7);
        cyl.getradius();
        cyl.sethieght(10);
        cyl.getheight();
        cyl.surfacearea();
    }
}
