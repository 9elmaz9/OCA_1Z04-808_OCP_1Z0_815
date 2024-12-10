package com.just.Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};

       /* for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }*/

        for( int a:array){
            a=3; // элементы не поменяли свои значения
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        for( String st:students){
            st= new String("ESCOBAR"); // элементы не поменяли свои значения
        }
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();


        StringBuilder sb1 =new StringBuilder("privet");
        StringBuilder sb2 =new StringBuilder("poka");
        StringBuilder sb3 =new StringBuilder("ok");
        StringBuilder [] array2 = {sb1,sb2,sb3};
        for (StringBuilder sb:array2){
            sb=new StringBuilder("HO HO");
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " "); // элементы не поменяли свои значения
        }
        System.out.println();

    }
}
