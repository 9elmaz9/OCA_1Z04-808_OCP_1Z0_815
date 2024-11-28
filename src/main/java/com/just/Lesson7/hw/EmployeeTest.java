package com.just.Lesson7.hw;

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Rock");
       // double - private thats why - Employee emp3 = new Employee(100.3);


        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);   private double salary  не видно из другой папки . поетому ошибка


        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();



    }
}