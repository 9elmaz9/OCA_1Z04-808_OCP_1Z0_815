package com.just.Lesson14;

public class Test {
    public static void main(String[] args) {
        // вызываем тут метод который ниже  abc
        for (int r = 1; r < 11; r++, abc(10)) {
            System.out.println(r);

            // or i can do like this
            //abc(10);
        }
    }


    static void abc(int n) {
        System.out.println(n);
    }
}
