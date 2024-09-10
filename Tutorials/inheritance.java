class Animal{
    public void Speak(){
        System.out.println("Speaking.......! ");
    }
    public void walking(){
        System.out.println("Walking.......! ");
    }
    public void Sniff(){
        System.out.println("Sniffing.......! ");
    }
}

class Dog extends Animal{
    public void Bark(){
        System.out.println("Barking.......! ");
    }
}

public class inheritance {
    public static void main(String[] args){
        Animal A = new Animal();
        A.Speak();
        Dog dg = new Dog();
        dg.Bark();
    }
}
