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


        //выводим длинну массива array
        System.out.println(array2.length);
        //lenght это не метод , это переменная класса , атрибут класса


        //ИНИЦИАЛИЗАЦИЯ СТАТИЧЕСКИМ МЕТОДОМ
        // String[] array2;
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";

        // double[][] array3; содержит 4 одномерных массива длина каждого равна двум
        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

// присваиваем 2.5 и 3.5 нашему  array3 его индексу 1
        array3[1] = array5;
        System.out.println(array3[1][0]); //2.5

        //
        double[] array7;
        array7 = new double[2];

        array7 = array5;  // это значит что   array7 будет ссылатсья на обьект array5



        //ДИНАМИЧЕСКАЯ ИНИЦИАЛИЗАЦИЯ В  КЛАССЕ Test2
    }
}
