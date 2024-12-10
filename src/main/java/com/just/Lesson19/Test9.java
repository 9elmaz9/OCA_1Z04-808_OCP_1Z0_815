package com.just.Lesson19;

public class Test9 {
    public static void main(String[] args) {
        int[] array1 = {3, 1, -2, 0};  // now all of them are 12
        int[] array2 = {-9, 1, 5, 2}; // now all of them are 3
        for (int i = 0; i < array1.length && i < array2.length; i++) { //in case two different length
            //change all arrays element
            array1[i]=12;
            array1[i]=3;

        }

    }
}
