package com.just.Lesson5.homework5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    public Employee(int id2, String surname2, int age2, double salary2, String department2) { // для того щоб зробити нового співробітника
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double increaseSalary() {
        salary *= 2;
        return salary;


    }
}


class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Kobein", 32, 2000.58, "IT");  // той конструктор для цього
        Employee emp2 = new Employee(2, "Ora", 22, 2500, "Accounting");


        emp1.increaseSalary();
        System.out.println("New emplotee salary is : " + emp1.salary);

        emp2.increaseSalary();
        System.out.println("New emplotee salary is : " + emp2.salary);

    }


}