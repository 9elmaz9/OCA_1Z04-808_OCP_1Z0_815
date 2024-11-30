package com.just.Lesson12;

public class Test10 {

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            // можно поиграть с локальной переменной
            int a = 5;  // виден и живет этот а только внутри жтиз скобок и метода
            System.out.println("Maximum -" + i1);
        } else if (i2 > i1 && i2 > i3) {
            //   а=10; тут не видно ее
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }


    void abc() {
        String str;  // default value does not exist дефолтное значение не существует
        int a = 10;
        if (a >= 10) {
            str = "Hey";
        }
        if (a < 10) {
            str = "Bye";
        } else {
            str = null; // надо ей хоть где то задать значение , например если выше не примет какое то из значений то найдет его тут
        }
        System.out.println(str);
    }


    public static void main(String[] args) {

        Test10 t = new Test10();
        t.maximum(4, 7, 10);



        int a=10;
        int b= 20;
        int maximum = (a>b) ? a:b;   // если да то  а , если нет то b
        System.out.println(maximum);

    }
}
