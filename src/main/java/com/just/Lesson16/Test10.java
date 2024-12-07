package com.just.Lesson16;

public class Test10 {

    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();// trim не поменяло ничего тут , поэтому не создаем новый обьект, а возвращает нот же самый из пула
        System.out.println(x == y); // ссылаются на один и тот же обьект true

        //НО
        String a = "privet";
        String b= "   privet  ".trim();// trim удалило тут пробелы , поэтому  создался  новый обьект, а не  же самый из пула
        System.out.println(a == b); //false

    }
}
