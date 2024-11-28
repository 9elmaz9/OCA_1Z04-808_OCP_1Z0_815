package com.just.Lesson5;

public class Car5 {
    Car5() {
        // for every object
        color = "blue";
        engine = "V12";
    }
    String color;
    String engine;
}

class Car5Test {
    public static void main(String[] args) {
        Car5 car5 = new Car5();
        System.out.println(car5.color);
        System.out.println(car5.engine);

        Car5 car6=new Car5();
        car6.color="red";  // i can change
        System.out.println(car6.color);
        System.out.println(car6.engine);

    }

}
