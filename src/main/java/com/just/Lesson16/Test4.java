package com.just.Lesson16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        //   System.out.println(emp.isManager+emp.salary);    boolean и double сложить невозможно но хитирее
        System.out.println("On manager? " + emp.isManager + " ! His salary " + emp.salary);  //On manager? true ! His salary 100.5

    }

}