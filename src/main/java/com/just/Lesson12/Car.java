package com.just.Lesson12;

public class Car {

    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}


class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);


        if (c1.engine > c2.engine) {  // внешний иф
            if (c1.doorCount > c2.doorCount) {  // внутренний иф NESTED IF вложенный
                System.out.println("Moshnost motora i kol-vo dverey u pervoy maschini bolshe");
            } // не выполняется  FALSE
            else {
                System.out.println("Moshnost motora u pervoy mashini bolshe , a kol-vo dverey menshe");
            }
        } // выполнятеся этот TRUE
        else {
            System.out.println("Moshnost motora u pervoy mashini menshe ");  // этот нет ибо выше TRUE
        }
    }

}
