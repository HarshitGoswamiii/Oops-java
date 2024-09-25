public class Circle extends shapes {
    Circle(int dim1) {
        super(dim1, -1);
    }

    public void Area() {
        System.out.println((22 / 4) * this.dim1 * this.dim1);
    }
}
