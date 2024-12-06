package com.just.Lesson16;

public class Test {

    public static void main(String[] args) {
        String s1 = new String("privet");

        // replace(char oldChar, char newChar)->String
        // replace(String oldString, String newString)->String

        String s2 = s1.replace('r', 'Z');
        System.out.println(s2); //pZivet  создается новый стринг с такими данными

        System.out.println(s1); //privet  наш первый оригинальный не меняется

        s2 = s2.replace('r', 'f');
        System.out.println(s2); //pZivet  этот уже новосозданый НЕЛЬЗЯ ИЗМЕНИТЬ ТОЖЕ

        String s3 = s1.replace('0', 'Z');
        System.out.println(s3); //privet   потому что у нас нет О чтобы ее менять на сто то
        // тут ничего не поменялось пожтому
        System.out.println(s3 == s1); //true потому что остался тем же приветом


        String s4 = s1.replace("vet", "vivka");
        // char and String can not work together
        // like  here         String s4=s1.replace("vet",'vivka');  1String / 2char NOOOO
        System.out.println(s4); //privivka

        //ALARM ИСКЛЮЧЕНИЕ
        String s8 = "poka";
        String s9 = s8.replace('k', 'k');  //метод возвращет тот же обьект , только если в меняем что то на тоже самое  то ,
        // в куче смотрит и у низ одинаковый адресс , они ссылаются в пуле на 1 и тот же обьект, новый не был создан
        System.out.println(s8 == s9); //  true
        //проверяем по адресам , работает только с char ,
        // со String  false

        //concat()-> String   всегда создает новый объект  и по сути это прибавление


    }
}
