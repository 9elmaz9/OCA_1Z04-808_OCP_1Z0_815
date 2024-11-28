package com.just.Lesson7;

public class Employee {

    public double salary;

    public void dvoynayaZP() {

        double result = salary*2;  // не инстанс переменная, принадлежит не классу емплои а методу / созданы внутри метода работают только тут
        // создается живет и умирает только в методе , вне метода нигде нельзя увидеть эту переменную  и у них нет access modifier
        System.out.println("New salary =" +result);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}


class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();

    }

}
