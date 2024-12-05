package com.just.Lesson15;

public class Test9 {

    public static void main(String[] args) {


        int chas = 0;

        OUTER:
        do {
            chas++;
            int minuta = 0;

            INNER:
            while (minuta < 60) {

                    if(minuta==20){
                        // break
                        continue OUTER; // это значит заканчивай с данным иттератионом лупа и перезоди в следуюзий
                }
                System.out.println(chas + " : " + minuta);  // выводит с 24 часами
                minuta++;
            }  // end INNER:



        } while (chas < 24);
    }

}


/**
 * SAME LOGIC HERE
 * <p>
 * OUTER:
 * for (int chas = 0; chas < 24; chas++) {
 * int minuta = 0;
 * INNER:
 * while (minuta < 60) {
 * System.out.println(chas + ":" + minuta);
 * minuta++;
 * }
 * <p>
 * }
 */
