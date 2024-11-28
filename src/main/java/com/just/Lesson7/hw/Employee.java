package com.just.Lesson7.hw;

public class Employee {

    int id;
   public String surname;
    int age;
    private double salary;
    String department;

    // constructors

   public Employee(int id2 ) {
        id = id2;
    }

    Employee(String surname2) { // dafault access
        surname = surname2;
    }

    private Employee(double salary2){
       salary=salary2;

    }

    double uvelichenieZarplati(){
       salary*=2;
       return salary;
    }

    //3 public methods
    public void getId(){
        System.out.println("ID = "+id);
    }

    public void getSurname(){
        System.out.println("Surname = "+surname);
    }
    public void getSalary(){
        System.out.println("Salary = "+salary);
    }



}

