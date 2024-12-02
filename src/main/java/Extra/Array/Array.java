package Extra.Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        // наша переменная хранит в себе ссылку на этлт  обьект

        // var 1
        /**
         int[] array = new int[2];
         array[0] = x;
         array[1] = y;
         System.out.println(Arrays.toString(array));
         */

        // var 2
        /**
        int[] array = new int[]{x, y};
        System.out.println(Arrays.toString(array));
         */

        //var 3
        int[] array = {x, y};
        System.out.println(Arrays.toString(array));

        System.out.println("array 1'\t'= " +array[1]);  //array 1'	'= 10



    }
}
