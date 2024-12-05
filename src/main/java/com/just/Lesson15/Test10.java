package com.just.Lesson15;

public class Test10 {

    public static void main(String[] args) {

        OUTER:
        for (int chas = 0; chas < 24; chas++) {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }

        }
    }
}

/**   SAME LOGIC HERE
 *
 *         int chas = 0;
 *
 *         OUTER:
 *         do {
 *             int minuta = 0;
 *
 *
 *             INNER:
 *             while (minuta < 60) {
 *                 System.out.println(chas + " : " + minuta);
 *                 minuta++;
 *             }  // end INNER:
 *
 *
 *             // после INNER
 *             chas++;
 *
 *         } while (chas < 24);
 *
 *
 *     }*/