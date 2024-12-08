package com.just.Lesson18;

public class Test1 {
    public static void main(String[] args) {


        //DECLARATION
        int[] array1; // объявлен массив типа int с именем array1
        String[] array2;
        double[][] array3;
        int[][] array10;

        // can't do  int [5] array;


        //ALLOCATION

        array1 = new int[8];  // так нельзя    array1[8] =new int;
        // array1 =new int[ -3];  компилятор пропустит эту ошибку , НО призапуске  Exception in thread "main" java.lang.NegativeArraySizeException

        array2 = new String[3]; // 3 длинна, не элементов

        array3 = new double[4][2];  // двумерный массив типа данных double. будет содержать в себе 4 элемента ,то есть 4 одномерных массива ,длинны коотрых будут равны двум 2
        // то есть четыре одномерных массива длинны которых будут равны двум  * получается это 8 элементов

        // LIKE THIS OK
        array10 = new int[3][];
        //LIKE THIS NOT OKEY
        //array10 = new int[][3];

    }
}
