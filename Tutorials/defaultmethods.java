
interface camera { // For Camera Funcationalty
    public void TakeSnap();

    public void RecordVideo();
}

interface Wifi { // For Nertworks
    String[] GetNetwork();

    public void wifi();
}

class CellPhone { // Base or Parent Class of Phone
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

    public String[] GetNetwork() {
        System.out.println("Getting Lists Of Networks - > ");
        String[] NetworkList = { "Harshit 5G", "Jio Fiber", "DavCC" };
        return null;
    }

    public void wifi(String Network) {
        System.out.println("Connecting......" + Network);
    }
}

public class defaultmethods {
    public static void main(String[] args) {
        SmartPhone oppo = new SmartPhone();
        oppo.CallNumber(99909090);
        oppo.PickCall();
        oppo.GetNetwork();
        oppo.wifi();

    }
}