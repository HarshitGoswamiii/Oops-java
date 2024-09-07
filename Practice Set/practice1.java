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

// <---------------------------------------------------Question
// 2------------------------------------------------->

class cellphone {
    public void ringing() {
        System.out.println("Ringing.......");
    }

    public void vibrate() {
        System.out.println("Vibraing.......");

    }

    public void calling() {
        System.out.println("Calling.......");

    }
}
    // <---------------------------------------------------Question
    // 3------------------------------------------------->
    class square {
        int side;

        public void area() {
            System.out.println("Area : "+side * side);
        }

        public void parameter() {
            System.out.println("Parameter : "+4 * side);
        }
    }

    public class practice1 {
        public static void main(String[] args) {
            // ----------------- Q - 1 ---------------->
            // Employee name = new Employee();
            // name.setname();
            // name.getsalary();
            // name.getname();

            // ----------------- Q - 2 ---------------->
            // cellphone phone = new cellphone();
            // phone.calling();
            // phone.ringing();
            // phone.vibrate();

            // ------------------ Q - 3 -------------->
            square sq = new square();
            sq.side = 3;
            sq.area();
            sq.parameter();
        }
    }
