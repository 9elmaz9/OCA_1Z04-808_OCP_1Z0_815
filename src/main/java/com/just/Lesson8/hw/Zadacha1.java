package com.just.Lesson8.hw;
/**
 * В первом классе создайте 2 static метода. 1-й пусть умножает 3 числа из параметро метода и возвразает их произведение.
 * 2-ой делит первое число на второе и ничего не возвращает , лишь выводит на дисплей в читабельном виде целое частное и остаток.
 * Во втором классе по два раза используйте данные методы
 * */
public class Zadacha1 {

    static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    static  void division (int a, int b){
        System.out.println("Integer private number : " + a/b+ "; Remainder = " +a%b);
    }
}
class ZadachaTest{

    public static void main(String[] args) {
        System.out.println("Multiplication = "+Zadacha1.multiplication(2,3,4));
        Zadacha1.division(9,2);

        System.out.println("Multiplication = "+Zadacha1.multiplication(2.5,3.5,4));
       Zadacha1.division(15,4);
    }
}