package Enthuware.Standart.test2;

public class test9 {
}
/**Given:

 class OverloadingTest{

 void m1(int x){
 System.out.println("m1 int");
 }

 void m1(double x){
 System.out.println("m1 double");
 }

 void m1(String x){
 System.out.println("m1 String");
 }

 }

 public class TestClass {
 public static void main(String[] args) throws Exception {
 OverloadingTest ot = new OverloadingTest();
 ot.m1(1.0);
 }
 }
 What will be the output?*/

//m1 double

//Here, m1() is overloading for three different argument types. So when you call ot.m1(1.0), the one with argument of type double will be invoked.

/**Анализ кода:
 Класс OverloadingTest:

 Содержит три перегруженные версии метода m1:
 void m1(int x): Принимает int.
 void m1(double x): Принимает double.
 void m1(String x): Принимает String.
 Метод main в классе TestClass:

 java
 Copy code
 OverloadingTest ot = new OverloadingTest();
 ot.m1(1.0);
 Объект класса OverloadingTest вызывает метод m1 с аргументом 1.0.
 Что происходит?
 Аргумент вызова:

 Значение 1.0 — это double по умолчанию в Java.
 Выбор метода:

 Компилятор ищет перегруженный метод, который принимает double:
 Находит void m1(double x), который идеально подходит.
 Компилятор не рассматривает методы с другими типами, так как есть точное соответствие.
 Результат выполнения:
 Вызывается метод:

 java
 Copy code
 void m1(double x) {
 System.out.println("m1 double");
 }
 Правильный ответ:
 m1 double*/