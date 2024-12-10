package com.just.Lesson19;

public class Test1 {

    // метод сум можно вызвать с любым количеством параметров типа int , от нуля до бесконечности
    static void summa(String s, int... a) { // можно и так  (int [] a) и к нему в psvm  summa(new int []{3,5});
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }


    // overloaded methods
    static void summa(int a, int b) {
        System.out.println(a + b);
    }

    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    // command line
    public static void main(String[] args) {              //javac Test1.java
        args = new String[]{"Hello", "14", "true "};   //java Test1 Hello 14 true
        System.out.println("Nulevoy element massiva :" + args[0]);
        System.out.println("Dlina massiva:" + args.length);


        summa(6, 3, 9);
        summa("ok", 1, 2, 3);
        summa("ok", new int[]{1, 2, 3});
        // summa("ok",null); NullPointerException

        //в конце после компиляции varargs превращается в  массив


    }
}

//TEST

//a.    abc(2, new int[2]); work ok
//b.    abc(2, {0,1}); NO
//b.    abc(1, {2}); NO
//b.    abc(0, 1,2 ); work ok
//b.    abc(3); work ok
//b.    abc(); NO , хотя бы 1 цифра нужна
