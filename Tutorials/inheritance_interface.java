interface Sample {
    public void meth1();
}

interface Sample2 extends Sample {
    public void meth2();
}

class MySample implements Sample2 {
    public void meth2() {
        System.out.println("Meth 2");
    }
}

public class inheritance_interface {
    public static void main(String[] args) {

    }
}
