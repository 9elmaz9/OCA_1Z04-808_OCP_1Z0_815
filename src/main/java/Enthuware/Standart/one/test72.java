package Enthuware.Standart.one;

public class test72 {
}

/**
 * Consider the following method :
 * public void myMethod(int m, Object p, double d){
 * ... valid code here
 * }
 *
 * Assuming that there is no other method with the same name, which of the following options are correct regarding the above method?*/

//If this method is called with two parameters, the code will not compile.



/**To call myMethod(int m, Object p, double d), you must pass exactly three parameters.
 * If you try to pass less (or more) number of parameters, the code will not compile.
 * Note that method parameters are not assigned default values.
 * It is possible to declare a method that can take variable number of parameters.
 * For example:
 * public static void someMethod(Object... params){
 * System.out.println(params.length);
 * }  You can call this method by passing any number of parameters.
 * In this case, calling someMethod() without any parameter will print 0. i.e. the length of params array will be 0. params will NOT be null.*/


/*Рассмотрим метод:

java
Copy code
public void myMethod(int m, Object p, double d) {
    // valid code here
}
Ключевые моменты:
Метод принимает три параметра:

int m
Object p
double d
Если метод вызван с двумя параметрами, это не скомпилируется, так как отсутствует перегруженная версия метода, которая принимает два аргумента. Java требует точного соответствия количеству параметров при вызове метода.

Если метод вызван с одним параметром, произойдёт та же ошибка компиляции (нет метода с таким количеством параметров).

Значения по умолчанию в Java не подставляются автоматически для отсутствующих параметров.

Правильный ответ:
"If this method is called with two parameters, the code will not compile."*/

