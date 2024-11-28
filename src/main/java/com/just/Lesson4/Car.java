package com.just.Lesson4;

public class Car {

    String color = "red" ;
    String engine = "V6";
}

class CarTest{

    public static void main(String[] args) {

        Car car1 = new Car();   // The address of the object  where its data is stored has been  created
       // Car car2 = new Car();
        Car car2=car1; // Two variables refer to  the same (1) , object

        car1.color="black";
        car1.engine="v8";
  //  System.out.print("color: " );
  //  System.out.println(car1.color);
  //  System.out.print("engine: ");
  //  System.out.println(car1.engine);

        System.out.println("color: " + car1.color);
        System.out.println("engine: " + car1.engine);
        System.out.println();

    }
}