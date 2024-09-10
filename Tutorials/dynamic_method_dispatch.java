class Phone{
    public void Showtime(){
        System.out.println("The Time Is 18:44 ! ");
    }
    public void On(){
        System.out.println("Switching on Phone...... ! ");
    }
}

class SmartPhone extends Phone{
    public void On(){
        System.out.println("Switching on Phone...... ! ");
    }
    public void music(){
        System.out.println("Playing Music ! ");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args){

        Phone phn = new SmartPhone(); // Allowed 
        phn.Showtime(); //Allowed 
        // phn.music(); // Not Allowed ! 
        phn.On();

    }
}
