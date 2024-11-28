package com.just.Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {
    String name = "Bob";
    Car c = new Car();
    // if Car  final then
   // final Car c1 = new Car();   я не могу изменить его адресс

    public static void main(String[] args) {
        Human h1 = new Human();
     //  h1.c = new Car(); с final  нельзя создать новый обьект  но можно изменять его внутренность на видим ниже
     //  h1.c = new Car();
        h1.c.engine = "V8";
    }
}
