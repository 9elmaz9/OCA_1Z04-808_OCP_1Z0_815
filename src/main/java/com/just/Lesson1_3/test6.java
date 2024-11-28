package com.just.Lesson1_3;

public class test6 {
    public static void main(String[] args) {


        int a = 3;
        int b = 5;
        int c = 5;
        //  3>5 false
        // 5>3 true

        boolean b1 = a >= b;
        boolean b2 = b <= c;
        boolean b3 = a == b; //  even
        //System.out.println(a>b);
        // = operator prisvoenia  c=b - now b is =c
        // == operator ravenstva  a==b  check is it real   true oe false
        System.out.println(b1);
        System.out.println(b2);

        boolean x = true;
        boolean y = false;  // ig here true then is true
        boolean z = true;

        boolean result = x && y && z;
        System.out.println(result);


        boolean x1 = true;
        boolean y1 = false;  // ig here true then is true
        boolean z1 = true;

        boolean result1 = x1 || y1 || z1;
        System.out.println(result1);

        boolean q = true;
        boolean s = !q; // false
        // not !true = false
        // not !false = true

    }
}
