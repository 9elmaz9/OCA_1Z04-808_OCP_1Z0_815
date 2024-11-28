package com.just.Lesson5;

public class Human {

    String name;
    Car7 car;
    BankAccount bA;

    void info() {

        System.out.println("Name : " + name + " , the auto color is : " + car.color + " . Balance account :" + bA.balance);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h =new Human();
        h.name="David";   // obj was created
        h.car=new Car7("red","V8");  // auto
        h.bA=new BankAccount(18,200.5);
        h.info();

    }

}


class Car7 {
    Car7(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}