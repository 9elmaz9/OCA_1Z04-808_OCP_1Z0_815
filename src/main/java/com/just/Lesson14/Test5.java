package com.just.Lesson14;

public class Test5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // не присваивание а РАВНО , проверка на равенство
            if (i == 7) {
                break;
            }
            System.out.print(i);  //123456

        }


        for (int a = 1; a <= 100; a++) {
            // не присваивание а РАВНО , проверка на равенство
            if (a == 87) {
                // когда оно видит что 87==87 то оно идет сразу дальше к update a++
                continue; // не заходим в тело for а идем сразу на update a++ и это пропускаем и выводим дальше 88
            }
            System.out.println(a);

        }


        System.out.println("HEY HEY HEY  HEY ");
        System.out.println(" ");

        for (int f = 1; f <= 100; f++) {
            if (f == 10) {
                continue;
            }
            // при делении на 55 остаток равен нулю
            if (f % 55 == 0) {
                break;   // остановится на 54
            }
            System.out.println(f);

        }
    }
}
