package com.just.Lesson14;

public class Test4 {
    public static void main(String[] args) {

        int a = 5;
        if (a > 10) {
            System.out.println(a);  // к относится ток эта строка, след уже нет
            a = a + 10;
        }


        int q = 15;
        if (q > 10)    //есди q больше 10 тогда запускается этот луп for  и МОЖНО ВЕЗДЕ УБРАТЬ СКОБКИ , ПОТОМУ ЧТО ОНО ВСЕ ОТНОСИТСЯ К IF STATEMENT
            for (int i = 1; i <= 10; i++)
                System.out.println(i);
        // ЭТО УЖЕ ОТДЕЛЬНОЕ
        System.out.println("hey ");


        // єто то же самое только со скобочками
        int e = 15;
        if (e > 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        // ЭТО УЖЕ ОТДЕЛЬНОЕ
        System.out.println("hey ");


    }
}
