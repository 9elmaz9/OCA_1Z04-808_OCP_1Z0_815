package Enthuware.Standart.one;

public class test16 {
}
//Which operators will always evaluate all the operands?

//|

//%

/**
 * || and && are also known as short circuit operators since they do not evaluate the rest of the expression
 * if the value of the expression can be determined by just evaluating part of the expression for example ( true || (bool = false))
 * will not assign false to bool because the value of the expression can be told just by seeing the first part i.e. true.
 * But ( true | (bool = false)) will assign false to bool.*/

/**
 * Вопрос:
 * Какие операторы всегда вычисляют все операнды?
 *
 * && (логическое AND с коротким замыканием):
 *
 * Не вычисляет все операнды.
 * Если первый операнд равен false, второй операнд не вычисляется.
 * Пример:
 * java
 * Copy code
 * boolean result = false && someMethod(); // someMethod() не вызовется.
 * | (побитовое OR):
 *
 * Всегда вычисляет все операнды.
 * Побитовое OR вычисляет оба операнда, независимо от их значения.
 * Пример:
 * java
 * Copy code
 * int result = 5 | 3; // Оба операнда вычисляются.
 * || (логическое OR с коротким замыканием):
 *
 * Не вычисляет все операнды.
 * Если первый операнд равен true, второй операнд не вычисляется.
 * Пример:
 * java
 * Copy code
 * boolean result = true || someMethod(); // someMethod() не вызовется.
 * ? : (тернарный оператор):
 *
 * Не вычисляет все операнды.
 * Вычисляется только одно из двух выражений в зависимости от условия.
 * Пример:
 * java
 * Copy code
 * int result = (true) ? 10 : someMethod(); // someMethod() не вызовется.
 * % (остаток от деления):
 *
 * Всегда вычисляет оба операнда.
 * Остаток от деления требует вычисления обоих операндов.
 * Пример:
 * java
 * Copy code
 * int result = 10 % 3; // Оба операнда вычисляются.
 *
 * Правильные ответы:
 * | (побитовое OR)
 * % (остаток от деления)*/