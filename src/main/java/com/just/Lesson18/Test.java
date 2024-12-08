package com.just.Lesson18;

public class Test {
    public static void main(String[] args) {

        //  A. int[][] array1 = new int[10][];

        // B. Car[][] array2 = new Car[1][0][7];

        // C. String array3[] = new array[9]; NOT CORRECT -> надо так String array3[] = new String[9];

        // D.java.lang.String[] array4 = new java.lang.String[5][];

        // E. int[][] array5 = new int[];  тут не может быть так , надо так   int[][] array5 = new int[][] ;

        // F.int[][] array6 = new int[][]; NOT CORRECT , надо так  int[][] array6 = new int[4][];   , первый всегда должен быть


        // TEST 2

      //  a.
        int[] array1 = {3, 5, 6, 0};

       // b.
        int[] array2 = new int[1];

        // c.
        int[] array3 = new int[]{};

        //d.
     //   int[] array4 = new int[2] {};  NOT CORRECT  нельзя дважды указывать длину массива , явно [2]  и {} неявно ,достаточно 1 раз не явно {}

        //e.
       //  int[] array5 = new int[3] {0, 1, 2} ;NOT CORRECT тут как и выше


    }
}

