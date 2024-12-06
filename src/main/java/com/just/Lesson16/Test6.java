package com.just.Lesson16;

public class Test6 {

    public static void main(String[] args) {

        String s = "PrIvEt:2!";

        // toLowerCase();
        String s2 = s.toLowerCase();
        System.out.println(s2);  //privet:2!

        // toUpperCase();
        String s3 = s.toUpperCase();
        System.out.println(s3);  // PRIVET:2!


        // contains(String str) -> boolean
        // ВОПРОС * СОДЕРЖИТ ЛИ В СЕБЕ s  :2 ? если да то TRUE , если нет то FALSE
        boolean b = s.contains(":2");
        System.out.println(b); //true

        boolean b1 = s.contains("T:2");
        System.out.println(b1); // false


    }
}
