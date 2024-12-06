package com.just.Lesson16;

public class Test5 {

    public static void main(String[] args) {
        String s = null; //  не ссылается ни на какой объект
        s += "ok";
        System.out.println(s); // nullok
        // да да null, это тоже значение

        /**
        ТАК НЕ РАБОТАЕТ , ОШИКА КОМПИЛЯЦИИ
        System.out.println(null+true);
        System.out.println(null+false);
         **/
    }
}
