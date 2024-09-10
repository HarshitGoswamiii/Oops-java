class Base1 {
    public int x;

    Base1() {
        System.out.println("This is Base Class ! ");
    }
    Base1(int a) {
        System.out.println("This is Base Class to print a : "+a);
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

    Derived1() {
        System.out.println("This is Derived Class ! ");
    }
    Derived1(int a,int b) {
        super(a);
        System.out.println("This is Derived Class to print b : "+b);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Child extends Derived1{
    Child(){
        System.out.println("This is Child Class ! ");
    }
    Child(int a, int b,int c) {
        super(a,b);
        System.out.println("This is Child Class to print c : "+c);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 db =new Derived1(4);
        Child ch = new Child(12,13,14);
    }
}
