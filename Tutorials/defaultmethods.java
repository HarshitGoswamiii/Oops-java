interface camera {
    public void TakeSnap();

    public void RecordVideo();
}

interface Wifi {
    public void wifi(String Network);
}

class CellPhone {
    public void CallNumber(int number) {
        System.out.println("Calling .... " + number);
    }

    public void PickCall() {
        System.out.println("Picking Call.....!");
    }
}

public class defaultmethods {
    public static void main(String[] args) {

    }
}