interface Bicycle { // interface for Bicycle
    void SpeedUp(int increment);

    void ApplyBrake(int decrement);
}

interface PlayRing { // interface for Ring
    void Ring();
}

class AvonCycle implements Bicycle {
    int Speed = 10;

    public void SpeedUp(int increment) {
        Speed = Speed + increment;
        System.out.println(Speed);
    }
    public void ApplyBrake(int decrement){
        Speed = Speed - decrement;
        System.out.println(Speed);
    }

}

public class tutorials_interface {
    public static void main(String[] args) {

        AvonCycle cycle = new AvonCycle();
        cycle.SpeedUp(8);
        cycle.ApplyBrake(4);
    }
}
