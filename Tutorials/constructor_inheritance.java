class Base1 {
    public int x;

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
    public int y;

    public void Derived1() {
        System.out.println("This is Derived Class ! ");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        // Derived1 db =new Derived1();
    }
}
