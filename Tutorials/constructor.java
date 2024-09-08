class Employee{
    private String name;
    private int salary;
    public Employee(){
        salary=12000;
        name="Harish";
    }
    public Employee(String name){
        this.name=name;
        salary=14000;
    }
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public void printdetails(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
public class constructor{
    public static void main(String[] args){
        Employee Harshit = new Employee("Harshit Goswami");
        Harshit.printdetails();

        Employee Harry = new Employee("Harry",13000);
        Harry.printdetails();

        Employee Harish = new Employee();
        Harish.printdetails();
        
    }
}