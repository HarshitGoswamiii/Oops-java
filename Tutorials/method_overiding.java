class A{
   public void meth1(){
        System.out.println("This is Method 1 of Class A ! ");
    }
    public void meth2(){
        System.out.println("This is Method 2 of Class A ! ");
    }
}
class B extends A{
    public void meth12(){
        System.out.println("This is Method 1 of Class B ! ");
    }
    public void meth2(){
        System.out.println("This is Method 2 of Class B ! ");
    }
}
public class method_overiding {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
