package com.just.Lesson14;

public class Test3 {
    public static void main(String[] args) {

        // выводит все цифры
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);

        }


        // выводит только четные  , начинается с двух и увеличивается на два
        for (int a = 2; a <= 30; a = a + 2) {
            System.out.println(a);
        }

        /**    // COMPILE TIME ERROR

         for (int z = 0; false; z++) {
         System.out.println(z);
         }

         */
 // JAVA DOES NOT ALLOW TO WRITE CODE WITH UNREACHABLE STATEMENT
        /**    // EXCEPTION FROM THE RULE

         if (false) {System.out.println(z);}

         */

    }


}
