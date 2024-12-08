package com.just.Lesson18;

//INTRODUCTION TO EXCEPTION
public class Test3 {
   static String s;

    public static void main(String[] args) {

        // int[] array = new int[-3]; //Exception in thread "main" java.lang.NegativeArraySizeException: -3

        // ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //array[3]=5; // у нас такого нет поэтому мы получаем
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //это когда выходишь за границы массива


        // NullPointerException
        int[][] array2 = new int[3][];
        //  System.out.println(array2[0][1]);  // Exception in thread "main" java.lang.NullPointerException
        //мы пока что еще не задали значение нашим элементам, они пока null

        //extra example NullPointerException
        // static String s; // вне метода меин отправляю ее
       // System.out.println(s.length()); // какая будет длинна этого String ? String= null , длинны у ничто быть не может поэтому  Exception in thread "main" java.lang.NullPointerException


    }
}
