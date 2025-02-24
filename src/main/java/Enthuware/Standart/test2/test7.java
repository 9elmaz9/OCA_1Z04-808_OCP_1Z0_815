package Enthuware.Standart.test2;

public class test7 {
}
/**Consider the following code:

 class A{
 public XXX m1(int a){
 return a*10/4-30;
 }
 }
 class A2 extends A{
 public YYY m1(int a){
 return a*10/4.0;
 }
 }
 What can be substituted for XXX and YYY so that it can compile without any problems?*/


//double, double
//a*10/4-30; generates an int which can be returned as a double without any cast.


/*Note that when a method returns objects (as opposed to primitives, like in this question), the principle of covariant returns applies.
 Meaning, the overriding method is allowed to return a subclass of the return type defined in the overridden method.
 Thus, if a base class's method is: public A m(); then a subclass is free to override it with: public A1 m(); if A1 extends A.*/


/*Разбор кода:
Вам нужно заменить XXX и YYY, чтобы код компилировался без ошибок. Давайте разберёмся, что происходит:

Метод m1 в классе A:

java
Copy code
public XXX m1(int a) {
    return a * 10 / 4 - 30;
}
Здесь возвращается значение, которое результат арифметических операций: a * 10 / 4 - 30.
Если все операнды — целые (int), то результат будет тоже int.
Метод m1 в классе A2 (переопределение):

java
Copy code
public YYY m1(int a) {
    return a * 10 / 4.0;
}
Здесь результат деления 4.0 приводит к тому, что итоговый тип выражения будет double.
Требования к переопределению метода:

Переопределённый метод должен иметь тот же тип параметров, что и метод в родительском классе.
Возвращаемый тип может быть ковариантным (например, более узким, если это объектные типы), но для примитивов он должен точно совпадать.
Что можно подставить для XXX и YYY:
Условие компиляции: типы возвращаемых значений должны быть одинаковыми в обоих методах, потому что int и double несовместимы в переопределении.
Варианты:
int, int:

Подходит для родительского метода (A) и дочернего (A2), если изменить формулу a * 10 / 4.0 в классе A2 на целочисленные операции.
Пример:
java
Copy code
return (int)(a * 10 / 4.0);
double, double:

Подходит, если оба метода возвращают double, и формулу в родительском классе тоже привести к double:
java
Copy code
return a * 10 / 4.0;
int, double или double, int:

Невозможно, так как типы возвращаемых значений должны совпадать.
"Nothing, they are simply not compatible":

Неверно, так как решение существует.
Правильный ответ:
double, double

Почему:
Изменение возвращаемого типа на double решает проблему для обоих методов, так как результат вычислений в обоих случаях может быть приведён к double.


*/