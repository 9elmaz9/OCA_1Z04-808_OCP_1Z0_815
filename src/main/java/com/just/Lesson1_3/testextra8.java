package com.just.Lesson1_3;

public class testextra8 {
    public static void main(String[] args) {

        char c = 'a';
        int i = 10;
        System.out.println(i+c);
        // so here
        //10 +a
        // a= 97 serial number in unicode  ( unique num for every char ) [0;65535] short NOT
        // even
        int i2=c; // it means i2=97 not 'a' symbhol

        short s= 500;
        //char z = s ; can't
        char z = (char) s; // cast expression

        boolean b1 = false;
        boolean b2=        b1 ==true; // its comparing and  NOT making b1true         false ==true = false
        System.out.println(b2); // false

        //AND HERE  we go, assign velue
        boolean b11 = false;
        boolean b22=        b11 =true; // false change to true
        // so b2=true;
        System.out.println(b22); // true

    }
}
