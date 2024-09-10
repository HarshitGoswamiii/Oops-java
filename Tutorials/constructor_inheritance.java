class Base1 {
    int x;

    public void Base1() {
        System.out.println("This is Base Class ! ");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    int y;

    public void Derived1() {
        System.out.println("This is Derived Class ! ");
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        Derived1 db = new Derived1();
    }
}
