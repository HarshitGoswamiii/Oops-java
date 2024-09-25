public class Cylinder extends shapes {
    Cylinder(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void Area() {
        System.out.println((2 * (22 / 7) * this.dim1 * this.dim2) + (2 * (22 / 7) * this.dim1 * this.dim2));
    }
}
