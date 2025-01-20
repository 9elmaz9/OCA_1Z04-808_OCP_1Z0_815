package Enthuware.Standart.one;

public class test68 {
}

//        In Java, Strings are immutable. A direct implication of this is...

//you cannot call methods like "1234".replace('1', '9'); and expect to change the original String.   calling such methods do not change this object. They create a new String object.

//you cannot change a String object, once it is created.

/**
 * Вопрос о неизменяемости строк в Java (Strings are immutable)
 * Что означает неизменяемость строк?
 * Неизменяемость строк в Java означает, что как только объект строки создан, его содержимое не может быть изменено. Любое изменение строки (например, метод replace, substring и т.д.) приводит к созданию нового объекта String, а исходный объект остается неизменным.
 *
 * Ответы:
 * "You cannot call methods like "1234".replace('1', '9'); and expect to change the original String."
 * Верно. Метод replace вернет новую строку с изменениями, но исходная строка "1234" останется неизменной.
 *
 * "You cannot change a String object, once it is created."
 * Верно. Это ключевое свойство неизменяемости строк.
 *
 * "You cannot extend String class."
 * Неверно. Хотя класс String объявлен как final, что не позволяет наследование, это не связано с понятием неизменяемости.
 *
 * "You cannot compare String objects."
 * Неверно. Строки можно сравнивать как с помощью оператора ==, так и с помощью метода equals.
 *
 * Правильные варианты:
 * "You cannot call methods like "1234".replace('1', '9'); and expect to change the original String."
 * "You cannot change a String object, once it is created."*/