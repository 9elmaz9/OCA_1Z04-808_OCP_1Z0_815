package Enthuware.Standart.one;

public class test36 {
}
/**Consider the following class...
 *
class MyString extends String{    MyString(){ super(); } }

The above code will not compile.*/

//True

/*
* This will not compile because String is a final class and final classes cannot be extended.
* There are questions on this aspect in the exam and so you should remember that StringBuffer and StringBuilder are also final.
*  All Primitive wrappers are also final (i.e. Boolean, Integer, Byte etc). java.lang.System is also final.*/

/**
 * Вопрос:
 * Код:
 *
 * java
 * Copy code
 * class MyString extends String {
 *    MyString() { super(); }
 * }
 * Скомпилируется ли данный код? Ответить "true" (не компилируется) или "false" (компилируется).
 *
 * Разбор:
 * Класс String в Java:
 *
 * В Java класс String является final.
 * Это означает, что нельзя наследовать от String. Попытка создать подкласс от String приведет к ошибке компиляции.
 * Конструктор super();:
 *
 * Даже если убрать вызов super();, проблема останется, так как невозможно наследовать от final класса.
 * Ответ:
 * true — код не скомпилируется, потому что класс String является final.
 *
 * Если что-то неясно, дай знать!*/