package com.just.Lesson10;

//это импорт для всех классов
import com.just.Lesson9.*;
//import com.just.Lesson9.Car;  это импорт класса а выше импорт пакета / папки
//import com.just.Lesson9.Student;
import static com.just.Lesson9.Car.t;

public class A {

    public static void main(String[] args) {

        // java.lang.*; импортируется всегда дефолтно
        String st1= new String("hello");


        com.just.Lesson9.Car c = new Car("blue", "v8");
        Car c1 = new Car("red", "v6");

        com.just.Lesson9.Student st = new Student();
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c); //c статическая, но можно вывести ее через обьект . она не пренадлежит обьекту ,
        // желательно использовать имя класса Student  если  используем статичную переменную в другом классе

        //static import : import static com.just.Lesson9.Car.t;
        System.out.println(t);
    }
}

class B{

    Student st3 = new Student();

}