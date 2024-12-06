package com.just.Lesson16;

public class Test7 {

    public static void main(String[] args) {

        String s1 = "Hello World"; // ЭТО НЕ МЕНЯЕТСЯ НИКОГДА В ЖИЗНИ
        String s2 = "Urrraaaaaa!!!";  // ЭТО НЕ МЕНЯЕТСЯ НИКОГДА В ЖИЗНИ
        String s3 = s1.concat(s2).trim().replace("Urrraaaaaa!!!", "Hyra!!!").substring(6, 10);
        /**
         *
         * chaning method
         * s1.concat(s2) Hello WorldUrrraaaaaa!!!   -> new ibj
         *
         * trim() пробелы не удаляет, и остается такой же обьект Hello WorldUrrraaaaaa!!!   ( in poll same )
         *                                         01234567891011121314151617
         * replace("Urrraaaaaa!!!","Hyra!!!")   -> Hello WorldHyra!!!   -> nex obj
         *
         * substring(6,10) ->  Worl -> new obj
         * */
        System.out.println(s3);//Worl


        System.out.println(s1.substring(s1.indexOf('W'))); //World
        /**
         *
         * substring  с какого инедкса выводить
         *
         * s1.substring(s1.indexOf('W'))
         * Hello World.substring(Hello World(6) то что в скобках ,это значит что нам надо выяснить какой индекс у W в Hello World
         *
         * Hello World.substring(6) теперь надо вывести с 6 индекса на экран наш  Hello World -> World
         *
         * * */
    }
}
