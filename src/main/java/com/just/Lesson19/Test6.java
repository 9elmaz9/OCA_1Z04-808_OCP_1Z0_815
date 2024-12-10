package com.just.Lesson19;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}}; // элементами двумерного массива являются одномерные массивы , а их элементами является int
      /*  for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

      }*/
        for (int[] array2 : array) { // элементами одномерного массива array является array2
            // array2 сначала будет равен {3, 7, 8}, потом  {4, 5},   потом {9, 4, 4, 6, 8, 3}
            for (int a : array2) {
                // a =3,7,8 then  a=4,5 then a =9,4,4,6,8,3
                System.out.print(a + " ");
            }

        }
    }
}
