package com.just.Lesson16;

public class Test2 {
    public static void main(String[] args) {


        String s1 = new String("abcdefgabcd"); //  0a 1b 2c 3d 4e 5f 6g 7a 8b 9c 10d

        // когда указываем начало
        String s10 = s1.substring(3); //  мы присвоили String s10 кусок String начиная с индекса 3
        System.out.println(s10);  //defgabcd
        System.out.println(s1); // этот не изменился ,он immutable

        // когда указываем начало  и конец
        String s11 = s1.substring(3, 7); //  мы присвоили String s10 кусок String начиная с индекса 3 ИМЕННО С НЕГО  по 7 НО ВАЖНО ЧТО САМ 7Й НЕ ВКЛЮЧЕН
        System.out.println(s11);  //defg   3d 4e 5f 6g 7a


        //trim()->String
        //убирает все пробелы по бокам, которые внутри не трогает
        String s2 = new String("   abcdef   gabcd   ");
        String s12 = s2.trim();  //  trim() создаем новый String
        System.out.println(s12); //abcdef   gabcd

        String s13 = s1.substring(3, 10); // НО ЧТО БЫ ВЫВЕСТИ С ПОСЛЕДНИМ СИМВОЛОМ d, надо вписать (3,11).ХОТЯ ЭЛЕМЕНТА С ИНДЕКСОМ 11 У НАС НЕТ
        System.out.println(s13); //defgabc
        String s14 = s1.substring(3, 11); // ТУТ С ПОСЛЕНИМ СИМВОЛОМ ВЫВОД //  0a 1b 2c 3d 4e 5f 6g 7a 8b 9c 10d , 11 индекса нет
        System.out.println(s14); //defgabcd



    }
}