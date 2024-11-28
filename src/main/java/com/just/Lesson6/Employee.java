package com.just.Lesson6;

public class Employee {

    //now I have 3 overloaded methods
    // потом 2й  начал работу . потом этот конструктор закончил свою  работу
    Employee(int id2, String surname2, int age2) {
        // id = id2;
        // surname = surname2;
        // age = age2;
        /**  Employee(surname2,age2);  внутри тела конструктора нельзя вызвать его оверлоадед  конструктоп по  имени класс , всемто этого используем this
         id=id2;
         surname=surname2;
         */
        this(surname2, age2); // это значит что мы вызываем конструктор а компилятор по параметрам ищет какой имено / этот идет смотреть в конструктор 3
        id = id2;
    }


    // 3 потом этот третий . поэтому  этот конструктор закончил свою  работу первым
    public Employee(String surname3, int age3) {   // должен біть паблик что б можно біло візвать его из другой папки
        // все посмотрел предыдущий конструтоор и ушел
        surname = surname3;
        age = age3;
    }


    // 1 сначала работу начал этот конструктор , а потом уже этот третим закончил свою работу
    Employee(int id4, String surname4, int age4, double salary4, String departament4) {
        this(id4, surname4, age4);  //идет смотреть в конструктор 2
        // id = id4;
        // surname = surname4;
        // age = age4;
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

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee(1, "Big", 66);
        System.out.println(emp.surname);

        Employee emp2 = new Employee("Rock", 56);
        System.out.println(emp2.surname);

        Employee emp3 = new Employee(2, "Brown", 40, 100.35, "IT");
        System.out.println(emp3.department);


    }
}