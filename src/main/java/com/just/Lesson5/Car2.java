package com.just.Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {     // if my speed 10  -> 10+5 =15
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {     // if my speed 10  -> 10+5 =15
        speed -= skorost;
        return speed;
    }

    void showInfo() { // void - emptiness  / method without OUTPUT -   doesn't  need ещ  return  anything
        System.out.println("color :" + color + " ,engine :" + engine + " ,speed :" + + speed);

    }

}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color="white";
        c1.engine="v6";
        c1.speed = 60;

       c1.showInfo(); //color :white ,engine :v6 ,speed :60
        c1.gaz(20);  // if 120 -> -40 , not correct
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();

    }
}
