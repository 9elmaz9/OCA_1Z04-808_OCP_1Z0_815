package com.just.Lesson9;

public class Car {

    String color;
    String engine;

    static int count;

    int $£jkj = 10;

    //эта нужна для импорта в папку урок 10 А
    public static int  t = 10 ;

    public Car(String color2, String engine2) {
        int x = 5;
        int y = x + 10;
        count++;
        this.color = color2;
        this.engine = engine2;
    }

    public void showColor() {
        System.out.println("Auto color " + color);
        //  this.changeColor("red");
    }

    public void changeColor(String color3) {
        System.out.println("Auto color was changed");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }


    void changeColor2(String color) {
        //System.out.println(this.color);
        color = color;

    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        System.out.println(c.color);
        c.changeColor2("black");
        System.out.println(c.color);

    }

    void abc(int a, int b) {

        // так нельзя boolean a = true;   но
        boolean c = true;
    }

    void abcd(int a, int b) {
        boolean c = true;
    }
}
