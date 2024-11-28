package com.just.Lesson5;


public class Car3 {
    // in empty default can be body
    //Car3(){
    //    System.out.println("Object is created");
    //}
    // public static void main(String[] args) {
    //        Car3 car3 = new Car3();  then here without parameters

    Car3(String cvet, String motor) {
      //color=cvet;
      //engine=motor;
      //  System.out.println("Object is created");
        // 2 var
        color="blue";
        engine="V12";

    }

    String color;
    String engine;

}

class Car3Test {
    public static void main(String[] args) {
        Car3 car3 = new Car3("yellow","V4");
        System.out.println(car3.color);
        System.out.println(car3.engine);


    }
}