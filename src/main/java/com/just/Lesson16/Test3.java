package com.just.Lesson16;

public class Test3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println(a + b + s); // сначала прибавляет 5+11 а потом ок 11ok  но что б оно не суммировало a+b можно сделать атк как ниже
        System.out.println(" " + a + b + s); //56ok   , оно считает типа String + int + int +String    но даже  в таком можно сделать сто б a+b складывались , ниже покажу как
        System.out.println(" " + (a + b) + s);//11ok


     /**   //пример как для теста   ,          String s2 = a + 8; тут сломался String  нельзя присвоить int
        int a2 = 5;
        String s1 = "hello";
        String s2 = a2 + 8;
        System.out.println(s2);
      **/
    }

}
