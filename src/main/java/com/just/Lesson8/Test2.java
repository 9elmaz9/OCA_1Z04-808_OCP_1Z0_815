package com.just.Lesson8;

public class Test2 {

    public final int a;  // now it works but if our constant STATIC THAN - NO
    // потому что не выполняется конструктор  ниже, а конструктор ниже может быть только если есть обьект в меин


    public static final double PI = 3.14;

    public static int multiple(int i, int b, int c) {

        return i * b * c;
    }

    public static void divideTwoNum(int nun, int dom) {
        if (dom != 0) {
            int quotient = nun / dom;
            int remainder = nun % dom;
            System.out.println(" Cselaya chast " + quotient);
            System.out.println(" Ostatok " + remainder);
        }else{
            System.out.println("Cant div by 0");

            }
        }


   Test2() {
       a = 10;
   }



    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.a);

        // так я могу вызвать просто а без конструктора
        // System.out.println(a);   поэтому мы должны определять нашу консатнту при создании  , дать ей знаечние


        int product = multiple(2,4,5);
        System.out.println(" Result  = " +product);

        divideTwoNum(10,3);

    }
}