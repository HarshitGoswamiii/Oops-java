class Base {
    int x;

    public void Base() {
        System.out.println("This is Base Class ! ");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public void Derived() {
        System.out.println("This is Derived Class ! ");
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        Derived db = new Derived();
    }
}
