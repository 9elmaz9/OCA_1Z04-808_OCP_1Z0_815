package Enthuware.Standart.one;

public class test32 {
}
//Which of the following are also known as "short circuiting logical operators"?

/**
 * || and && are called short circuiting operators because if, while evaluating a logical expression,
 * at any stage, the value of the whole expression can be determined without evaluating the rest of the expression,
 * then the remaining sub-expressions are not evaluated.  Consider this: boolean bool= true; int k = 10; if( bool == false && ( (k = 3) == 5 ))
 * { .....} System.out.println(k);
 * // this will print 10.  Because the value of the whole expression can be determined just by looking at bool == false. So k = 3 is never executed.
 * The big expression was short circuited by &&.  Had the expression been if( bool == false & ( (k = 3) == 5 )) { .....}/
 * notice single & instead of && /then it would have printed 3 because k = 3 will be executed. Even though the value of the expression
 *is known immediately after evaluating bool == false, the rest of the expression is still evaluated. Thus, & is not a short circuiting operator.
 *  Same thing happens with || and | as well.*/


/**
 * Вопрос:
 * Какие из перечисленных операторов также известны как "short-circuiting logical operators" (логические операторы с коротким замыканием)?
 *
 * Разбор:
 * & (битовое AND или логическое AND):
 *
 * Не является оператором с коротким замыканием.
 * Оператор & всегда вычисляет оба операнда, даже если результат можно определить по первому операнду. Например:
 * java
 * Copy code
 * boolean result = true & false; // Оба операнда вычисляются
 * || (логическое OR с коротким замыканием):
 *
 * Да, это оператор с коротким замыканием.
 * Если первый операнд равен true, второй операнд не вычисляется, так как результат уже известен. Например:
 * java
 * Copy code
 * boolean result = true || someMethod(); // someMethod() не будет вызван
 * && (логическое AND с коротким замыканием):
 *
 * Да, это оператор с коротким замыканием.
 * Если первый операнд равен false, второй операнд не вычисляется, так как результат уже известен. Например:
 * java
 * Copy code
 * boolean result = false && someMethod(); // someMethod() не будет вызван
 * | (битовое OR или логическое OR):
 *
 * Не является оператором с коротким замыканием.
 * Оператор | всегда вычисляет оба операнда, даже если результат можно определить по первому операнду. Например:
 * java
 * Copy code
 * boolean result = true | false; // Оба операнда вычисляются
 * Правильные ответы:
 * ||
 * &&*/