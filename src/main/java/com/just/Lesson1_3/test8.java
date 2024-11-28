package com.just.Lesson1_3;

public class test8 {
    public static void main(String[] args) {

        int a = 10;
        int b =3;

        int c = ++a - b*2; // 11 - 6  first one ++a then *
        // but we can  change the queue
       //  int c1 =( ++a - b)*2; // (11-3) *2= 14
         int c1 =( a-- - b)*2; // (10-3) *2= 14
        System.out.println(c); // 5



    }
}
