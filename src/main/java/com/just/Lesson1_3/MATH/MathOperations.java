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

    }
}
