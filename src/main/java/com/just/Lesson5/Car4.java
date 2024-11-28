package com.just.Lesson5;

public class Car4 {
    Car4(String cvet , String motor ) {  // () takes 2 parameters
        color = cvet;
        engine=motor;
        System.out.println(" The car is: "+color +" , engine :" +engine);
    }

        String color;
        String engine;
    }

    class Car4Test {
        public static void main(String[] args) {
           Car4 car1=new Car4("black","V8");

           Car4 car2 = new Car4("white","V6");


        }

    }



