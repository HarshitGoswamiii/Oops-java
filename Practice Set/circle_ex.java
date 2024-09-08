class circle {
    private int r;
    private float area;
    private float para;

    public void setradius(int radius) {
        r = radius;
        System.out.println(r);
    }

    public void checkarea(float a) {
        area = 3.14f * r * r;
        if (area == a) {
            System.out.println("Area is Right ! ");
        } else {
            System.out.println("Area is Wrong ! ");
        }
    }

    public void checkpara(float p) {
        para = 2 * 3.14f * r;
        if (para == p) {
            System.out.println("Perimeter is Right ! ");
        } else {
            System.out.println("Perimeter is Wrong ! ");
        }
    }
}

public class circle_ex {
    public static void main(String[] args) {
        circle clr = new circle();
        clr.setradius(2);
        clr.checkpara(12f);
        clr.checkarea(12.56f);

    }
}
