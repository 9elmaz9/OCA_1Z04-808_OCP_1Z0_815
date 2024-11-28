package com.just.Lesson6;

public class Employee2 {

    // данный способ более корректный в использовании нескольких конструкторов ,
    // когда 1 конструкторр вызывает другой свой оверлоадед конструктор

    //now I have 3 overloaded methods
    // потом 2й  начал работу . потом этот конструктор закончил свою  работу
    Employee2(int id2, String surname2, int age2) {
        this(id2,surname2,age2,0.0,null);  // last two defaul of double 0.0 and String null

    }


    // 3 потом этот третий . поэтому  этот конструктор закончил свою  работу первым
    Employee2(String surname3, int age3) {
        this(0,surname3,age3,0.0,null);   // here id 0
    }


    // 1 сначала работу начал этот конструктор , а потом уже этот третим закончил свою работу
    Employee2(int id4, String surname4, int age4, double salary4, String departament4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = departament4;

    }

    //конструктор который последний начал свою работу будет завершен первым .

    int id;
    String surname;
    int age;
    double salary;
    String department;

}

class Employee2Test {

    public static void main(String[] args) {

        Employee2 emp = new Employee2(1, "Big", 66);
        System.out.println(emp.surname);

        Employee2 emp2 = new Employee2("Rock", 56);
        System.out.println(emp2.surname);

        Employee2 emp3 = new Employee2(2, "Brown", 40, 100.35, "IT");
        System.out.println(emp3.department);


    }
}