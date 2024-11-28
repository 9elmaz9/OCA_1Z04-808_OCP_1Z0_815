package com.just.Lesson6.hw;

/**
 * Создайте класс , в котором будут 5 verloaded методов , которые вычисляют сумму нуля ,
 * одного , двух, трех и четрырех целых чисел соответственно ,  передают эту сумм в output  и выводят ее  на экран.
 * В случае , когда слагаемые отсутствуют 5 т.у когда параметров нет) сумма пусть равняется 0.
 */

//This class has five overloaded methods named sum. Each method calculates the sum of a different number of integers (from zero up to four integers). Each method then prints and returns the result.
//Overloading means that there are multiple methods with the same name (sum) but with different parameters (different numbers of integers in this case).
public class Summirovanie {

    int sum() {  // параметры не нужны там ноль
        int result = 0;
        System.out.println("Summa vsex chisel :" + result);
        return result;
    }

    int sum(int a) {   // суммированние не происходит  потому что 1 параметр и все
        int result1 = a;
        System.out.println("Summa vsex chisel :" + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;    //тут два параметра , тут уже происходит сумирование
        System.out.println("Summa vsex chisel :" + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Summa vsex chisel :" + result3);
        return result3;

    }

    int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Summa vsex chisel :" + result4);
        return result4;
    }

}

class SummirovanieTest {

    public static void main(String[] args) {
        Summirovanie s = new Summirovanie();
        s.sum();
        s.sum(3);
        s.sum(3, 5);
        s.sum(3, 5, 7);
        s.sum(3, 5, 7, 11);


    }
}

