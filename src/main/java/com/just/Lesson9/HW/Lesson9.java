package com.just.Lesson9.HW;
// напишите программу , в которой будет созданнно 8 обьектов , но к последней строке метода main останется всего 2.

public class Lesson9 {
    //static method
    public static void abc() {
        // переменные s1 s2 являются локальными
        String s1 = new String("ABC");
        String s2 = new String("DEF");

    }

    public static void main(String[] args) {
        Lesson9 l9 = new Lesson9();
        abc(); // cоздает по 2 обьекта .
        // вызван дважды  и на этом метоже прекращабт свою работу эти обьеты потому что существуют только в методе abc

        abc(); // тут тоже самое как выше
        String s1 = new String("ABC");
        abc(); // дохнялк тоже обьекты существуют только внутри метода

        //получается что в итоге в меин методе только 2 обьекта остались живы  l9  и s1
    }
}
