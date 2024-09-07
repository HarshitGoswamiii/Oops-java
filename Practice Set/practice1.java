import java.util.Scanner;

class Employee {
    String name;
    int salary;
    Scanner s = new Scanner(System.in);

    public void setname() {
        System.out.print("Enter Your Name : ");
        name = s.nextLine();
    }

    public void getsalary() {
        System.out.print("Enter Salary : ");
        salary = s.nextInt();
    }

    public void getname() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class practice1 {
    public static void main(String[] args) {
        Employee name = new Employee();
        name.setname();
        name.getsalary();
        name.getname();
    }
}
