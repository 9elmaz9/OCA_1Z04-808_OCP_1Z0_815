package com.just.Lesson1_3;

public class hw8 {
    public static void main(String[] args) {

        int a = 5;

        //           5       3    4      4   5
        int result = a-- - --a + ++a + a++ + a;
        //5-3 +4 +4 +5  = 2+8 +5
        //15
        System.out.println(result);


        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result2 = 0;
        result2 = i2 / d1 + d2 % i1 - l;
        System.out.println(result2);


        int b = 8;
                         // 9 - 9 +    11   - 10 = 2
        System.out.println( ++b - b++ + ++b - --b);
    }
}

