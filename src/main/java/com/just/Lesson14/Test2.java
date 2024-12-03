package com.just.Lesson14;

public class Test2 {
    public static void main(String[] args) {
        // но если раньше инициализировать  то тогда нельзя использовать ее в лупе  :  int i= 10;


        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

/**      can be like this also
 int i = 1;
 for (; i < 11; i++) {
 System.out.println(i);
 }
 */
        //  int a = i; doesnt work
        int i = 10; // ok   this i have nothing with  i above in for loop


        for (int a = 1, j = 2, k = 10; a < 11; a++, j++, k = k + 20) {
            System.out.println(a + j);
        }


        // если обявляем инт заранее, то в лупе можно поменять его значение , но ток в цикле
        // можно вызвать метод внутри
        int e = 1;
        for (e = 1; e < 11 && e > -3 || e > 4 & e == 5; e++, abc(10)) {
            System.out.println(e);
        }

        // вызываем тут метод который ниже  abc
        for (int r = 1; r < 11; r++, abc(10)) {
            System.out.println(r);
        }

        //  update можно писать в теле  и ничего не будет меняться и будет работать абсолютно одинаково
        for (int q = 1; q < 11; ) {
            System.out.println(q);
            q++;
        }

    }


    static void abc(int n) {
        System.out.println(n);
    }
}
