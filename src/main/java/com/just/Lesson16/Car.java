package com.just.Lesson16;

public class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "v4");
        return c10;
    }

    public static void main(String[] args) {
        // не могу менять значение final     a = 10;

        Car c = new Car("red", "V6");
        Car c2 = c.abc("black");   // с моим обьектом с никаких изменений не произошло
        System.out.println(c.color); // anyway red
        // а вот с2 black

    }

}


//
//class TestCar {
//    final static Car c = new Car("red", "V8");
//
//    // i can't do it + because c is final   c=new Car("white","v5");
//    public static void main(String[] args) {
//        System.out.println(c.color+c.engine);
//
//        //BUT
//        c.color = "black";
//        System.out.println(" ");
//        System.out.println(c.color+c.engine);
//    }
//}