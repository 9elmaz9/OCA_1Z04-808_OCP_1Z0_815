package com.just.Lesson15;

public class Test5 {
    public static void main(String[] args) {

        int a = 5;

        //condition  (a==10)
        while (a == 10) {   // сравнение , не присвоение  , это false в тело оно не зашло
            System.out.println("Hey");
        }


        int b = 5;
        while (b < 10) ; // это ENDLESS LOOP
        System.out.println("hey2");  // этот мы не увидим никогжа
    }
}
