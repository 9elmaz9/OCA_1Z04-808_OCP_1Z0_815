package com.just.Lesson1_3;

public class les3 {

    public static void main(String[] args) {
        int x2 = 1, y3 = 3, w = 3;

        int x1 = 1;


        int a = 5;
        int b = 10;
        int c = a + b;
        // System.out.println(a+b);
        System.out.println(c);

        int x = 5;
        int y = 3;
        int z = x - ++y;
        System.out.println(z); //2 with prefiw - with postfix 1
        //System.out.println(y); //4 y++ prefix
        System.out.println(y);  // ++y  postfix4


        int u = 5;
        int s = ++u - --u - u-- + u++;  // 6 - 5 - 4 - 5
        // 6-5 = 1 -5 =  - 4 + 4 = 0
        System.out.println(s); // 0


        int e = 4;
        int r = 5;
        e += 45;
        System.out.println(e); //49  e= e+45  ->  e = 4+45


        int aaa = 3;
        int bbb = 50;
        int ccc = 0;

        //the count starts  from the right  c=18->  b = 18 ->a =18
        aaa = bbb = ccc = 18;  // 18


        // doesnt work
        //  long aa =100L;
        //  int bb=aa;
        //  System.out.println(aa);

        long q = 100L;

        int f = 10;
        short g = 50;

        long h = g;

        float f1 = 3.14F;
        double d1 = 1.23;
        float f2 = q;
        double d2 = q;
        System.out.println(q);


    }
}
