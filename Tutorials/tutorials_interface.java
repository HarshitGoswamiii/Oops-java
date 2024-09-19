interface Bicycle {  //interface for Bicycle
    void SpeedUp(int increment);

    void ApplyBrake(int decrement);
}

interface Car { //interface for Car
    void Suzuki();

    void Honda();
}

class Vehicle implements Bicycle {
    int Speed = 10;

    public void SpeedUp(int increment) {
        Speed = Speed + increment;
        System.out.println(Speed);
    }

}

public class tutorials_interface {
    public static void main(String[] args) {

    }
}
