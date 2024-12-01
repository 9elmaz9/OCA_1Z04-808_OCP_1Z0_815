package com.just.Lesson1_3.MATH;

public class MathOperations {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        //прибавление
        int sum = x + y;
        System.out.println(sum);

        //вычитание
        int diff = x - y;
        System.out.println(sum);

        //Умножение
        int multiply = x * y;
        System.out.println(multiply);

        //Деление , мы можем сделать х дабл и приделении числа с точкой на обычое, ответ будет тоже с точкой
        y = 3;
        double divide = (double) x / y;
        System.out.println(divide);

        //Возведение в степень
        int extension = x * x;  // возвели в степень
        System.out.println(extension);


        //Инкремент
        // x = x + 10;
        x++;
        System.out.println(x);

        // Сокращенная форма записи
        x += 10;
        x *= 10;
        x /= 2;

        //Декремент
        x = x - 1;
        System.out.println(x);
        x--; // same


        //Остаток от деления
        int number = 4;
        // 4 - 2 - 2 = 0    остаток .0 значит чисто четное
        // 5 - 2 - 2 = 1   остаток 1 , значит чисто нечетное
        // 7 - 3 - 3 = 1
        int modulus = 4 % 2;  // 0 четное
        int modulus1 = 7 % 3; // 3 3 1 остаток

        //Скобок
        int z = 2 + 2 * 2;   //сначала умножение потом +
        int zz = (2 + 2) * 2; // тут сначала скобки приоритет потом умножение
        System.out.println(z);

//Задача : Находим индекс массы тела.
//Создать переменные с ростом (! в метрах ), весом.
//Произвести расчет индекса массы тела (вес)/( рост* рост) используя переменные , вывести на экран.


        double height = 1.68;
        int weight = 52;
        double index = weight / (height * height);
        System.out.println(index);



    }
}