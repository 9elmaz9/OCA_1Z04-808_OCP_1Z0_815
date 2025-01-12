package Enthuware.Standart.one;

public class test38 {
}
//Which of the following statements are true?
//synchronized keyword can never be applied to a class.
//A final variable can be hidden in a subclass.

/*final keyword when applied to a class means the class cannot be subclassed, when applied to a method means the method cannot be overridden
 (it can be overloaded though) and when applied to a variable means that the variable is a constant.*/

/**
 * Вопрос:
 * Какие из следующих утверждений являются истинными?
 *
 * Разбор вариантов:
 * private keyword can never be applied to a class.
 *
 * Неверно. Модификатор private может быть применен к вложенному (inner) классу, но не к внешнему классу. Например:
 * java
 * Copy code
 * class Outer {
 *     private class Inner {
 *         // Вложенный класс может быть private
 *     }
 * }
 * Однако внешний класс не может быть private.
 * synchronized keyword can never be applied to a class.
 *
 * Верно. Модификатор synchronized не может применяться к классу, он применяется только к методам или блокам кода. Пример:
 * java
 * Copy code
 * synchronized void syncMethod() {
 *     // Метод синхронизирован
 * }
 * synchronized keyword may be applied to a non-primitive variable.
 *
 * Неверно. Модификатор synchronized применяется только к методам или блокам кода, а не к переменным, независимо от их типа.
 * final keyword can never be applied to a class.
 *
 * Неверно. Модификатор final может быть применен к классу, чтобы запретить наследование. Например:
 * java
 * Copy code
 * final class FinalClass {
 *     // Этот класс нельзя наследовать
 * }
 * A final variable can be hidden in a subclass.
 *
 * Неверно. final переменная не может быть скрыта в подклассе, так как она неизменяемая. Например:
 * java
 * Copy code
 * class Parent {
 *     final int value = 10;
 * }
 * class Child extends Parent {
 *     // Нельзя переопределить value
 * }
 * Правильные ответы:
 * synchronized keyword can never be applied to a class.
 * private keyword can never be applied to a class.*/