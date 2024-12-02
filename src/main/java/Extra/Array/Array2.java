package Extra.Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        /**   в памяти есть  x = 5  и y = x */
         int x = 5;
         int y = x;
         x=10;
         System.out.println(x);
         System.out.println(y);

        /** в данном случае будет  то что два данных array будут ссылаться на  1 обьект и если что то  поменять в одном то второй поменяетс ятак же ,  ссылка то у низ на 1 обьект
         int x = 5;
         int y = 10;
         int[] array = {x, y};
         int[] array2 = array;
         array2[0] = 13;
         System.out.println(Arrays.toString(array));   //[13, 10]

         System.out.println(Arrays.toString(array2));    //[13, 10]
         */

        // тут мы создали два раззных array  и они никак не связаны, меняю как хочу
        // создалось два разных обьекта в heap
        int[] array = {x, y};   //[10, 5]

        int[] array2 = new  int[2];
        array2[0] = array[0];  //10
        array2[1] = array[1];  //5
        array2[0]=13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));


        //Практическое задание
        //Ответить на вопрос "Столица Катара?" и записать в массив (какого типа)
        char  []  answer = new char[4];
        answer[0]='D';
        answer[1]='o';
        answer[2]='h';
        answer[3]='a';
        System.out.println(Arrays.toString(answer));

        char  []  answer2 = {'d','o','h','a'};
        System.out.println(answer2);




    }

}
