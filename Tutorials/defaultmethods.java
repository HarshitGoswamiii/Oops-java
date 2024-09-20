
interface camera {
    public void TakeSnap();

    public void RecordVideo();
}

interface Wifi {
    public void wifi();
}

class CellPhone {
    public void CallNumber(int number) {
        System.out.println("Calling .... " + number);
    }

    public void PickCall() {
        System.out.println("Picking Call.....!");
    }
}

class SmartPhone extends CellPhone implements camera, Wifi {
    public void TakeSnap() {
        System.out.println("Taking Snap....");
    }

    public void RecordVideo() {
        System.out.println("Recording Video....");
    }

    public void wifi() {
        System.out.println("Connecting......");
    }
}

public class defaultmethods {
    public static void main(String[] args) {

    }
}