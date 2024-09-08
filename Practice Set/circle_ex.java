class circle {
    private int r;
    private float area;
    private float para;

    public void setradius(int radius) {
        r = radius;
    }

    public void checkarea(int a) {
        area = 3.14f * r * r;
        if(area==a){

        }
    }

}

public class circle_ex {
    public static void main(String[] args) {
        circle clr = new circle();
        clr.setradius(23);

    }
}
