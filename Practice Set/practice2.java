class cylinder {
    private int radius;
    private int height;

    public void setradius(int r) {
        r = radius;
    }
    public void getraius(){
        System.out.println("Radius : "+radius);
    }
    public void sethieght(int h){
        h=height;
    }
    public void getheight(){
        System.out.println("Height : "+height);
    }
}

public class practice2 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setradius(7);
        cyl.getraius();
        cyl.sethieght(h);
    }
}
