package com.just.Lesson15;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;  // ++5 = 6 сразу

        //6>10 ?  no  поетому внутрь лупа мы не заходим ибо условие false
        while (++a > 10) {
            a++;
        }
        System.out.println(a);  //6


        //// 2

        int b = 5;  // ++5 = 6 сразу , дальше 7  и сразу дальше 8 , 9 и 10 . 10 меньше 10 ? нет , в тело лупа не заходим все окончен луп

        //6 меньше 10 ?   ДА ,   поетому внутрь лупа мы заходим ибо условие true
        while (++b < 10) {
            b++; //7 .9 .
        }
        System.out.println(b);  //6
    }
}