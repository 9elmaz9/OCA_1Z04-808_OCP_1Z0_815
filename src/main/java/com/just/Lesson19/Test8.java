package com.just.Lesson19;

public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[4];
        /*
        for (int i = 0; i < args.length; i++) {
            array[i] = i * 10;
        }*/

        // с помощью  foreach loop  мы не можем производить динамическую инициализаццию массива

        for (int b :array) {
         //   b=10; // nothing change
            
        }
        for (int a : array) {
            System.out.println(a + " "); //0 10 20 30 
        }
    }
}
