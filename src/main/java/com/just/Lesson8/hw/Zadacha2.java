package com.just.Lesson8.hw;

/**
 * В ПЕРВОМ КЛАССЕ СОЗДАЙТЕ STATIC FINAL  ПЕРЕМЕННУЮ ПИ=3,14.
 * ИСПОЛЬЗУЙТЕ ДАННУБ КОНСТАНТУ В  NON-STATIC МЕТОДЕ, КОТОРУЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И
 * ВЫЧИСЛЯЕТ ПЛОЩАТЬ КРУГА ПО ФОРМУЛЕ : ПЛОЩАДЬ * РАДИУС * РАДИУС.
 * ТАКЖЕ ИСПОЛЬЗУЙТЕ ДАННУЮ КОНСТАНТУ В STATIC МЕТОДЕ . КОТОРЫЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И ВЫЧИСЛЯЕТ ДЛИНУ ОКРУЖНОСТИ
 * ПО ФОРМУЛЕ : ПЛОЩАДЬ = 2 * ПИ * РАДИУС.
 * СОЗДАЙТЕ ЕЩЕ ОДИН NON-STATIC МЕТОД . КОТОРЫЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И ВЫВОДИТ НА ЭКРАН ИНФОРМАЦИЮ О РАДИУСЕ,
 * ПЛОЩАДИ КРУГА И ДЛИНЕ ОКРУЖНОСТИ. ИСПОЛЬЗУЙТЕ ВСЕ 3 МЕТОДА ВО ВТОРОМ КЛАССЕ
 */
public class Zadacha2 {

    public final static double PI = 3.14;


    // находим площадь круга NON-STATIC МЕТОДЕ, КОТОРУЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И
    // * ВЫЧИСЛЯЕТ ПЛОЩАТЬ КРУГА ПО ФОРМУЛЕ : ПЛОЩАДЬ * РАДИУС * РАДИУС.
    public double area(double radius) {
        double ar = PI * radius * radius;
        return ar;
    }

    //В STATIC МЕТОДЕ . КОТОРЫЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И ВЫЧИСЛЯЕТ ДЛИНУ ОКРУЖНОСТИ
    // * ПО ФОРМУЛЕ : ПЛОЩАДЬ = 2 * ПИ * РАДИУС.
    public static double length(double radius2) {
        double le = 2 * PI * radius2;
        return le;
    }

    //NON-STATIC МЕТОД . КОТОРЫЙ ПРИНИМАЕТ В ПАРАМЕТРЕ ЗНАЧЕНИЕ РАДИУСА И ВЫВОДИТ НА ЭКРАН ИНФОРМАЦИЮ О РАДИУСЕ,
    // * ПЛОЩАДИ КРУГА И ДЛИНЕ ОКРУЖНОСТИ. ИСПОЛЬЗУЙТЕ ВСЕ 3 МЕТОДА ВО ВТОРОМ КЛАССЕ
    public void info(double radius3) {
        System.out.println("Radius" + radius3);
        System.out.println("Area of a circle " + area(radius3));
        System.out.println("Circumference " + length(radius3));
    }

}

class Zadacha2Test{

    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.area(5);
        Zadacha2.length(7.5);
        z.info(3);

    }

}