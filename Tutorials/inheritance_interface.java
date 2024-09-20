interface Sample {
    public void meth1();
}

interface Sample2 extends Sample {   //inherits methods from the sample interface
    public void meth2();
}

class MySample implements Sample2 {
    @Override
    public void meth1() {
        System.out.println("Meth 1");
    }
    @Override
    public void meth2() {
        System.out.println("Meth 2");
    }
}

public class inheritance_interface {
    public static void main(String[] args) {
        MySample sam = new MySample();
        sam.meth1();
        sam.meth2();
    }
}
