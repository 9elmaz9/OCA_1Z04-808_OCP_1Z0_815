package Enthuware.Standart.one;

public class test30 {
}

//Which of the following statements are true?

//The extends keyword is used to specify inheritance.

//subclass of an abstract class can be declared abstract.


/**
 * The extends clause is used to specify that a class extends another class and thereby inherits all non-private instance members of that class.
 * A subclass can be declared abstract regardless of whether the superclass was declared abstract.
 * A class cannot be declared abstract and final at the same time. This restriction makes sense because abstract classes need to be subclassed to be useful and final forbids subclasses.
 * The visibility of the class is not limited by the visibility of its members.
 * A class with all the members declared private can still be declared public or a class having all public members may be declared private. */


/**
 * Вопрос:
 * Какие из приведенных утверждений являются истинными?
 *
 * Разбор:
 * The extends keyword is used to specify inheritance.
 *
 * Верно. Ключевое слово extends используется для указания наследования одного класса от другого. Например:
 * java
 * Copy code
 * class A { }
 * class B extends A { }
 * Subclass of a non-abstract class cannot be declared abstract.
 *
 * Неверно. Подкласс неабстрактного класса может быть объявлен как abstract. Например:
 * java
 * Copy code
 * class A { }
 * abstract class B extends A { }
 * Subclass of an abstract class can be declared abstract.
 *
 * Верно. Если суперкласс является абстрактным, его подкласс также может быть объявлен абстрактным, если он не реализует все абстрактные методы суперкласса.
 * Subclass of a final class can be abstract.
 *
 * Неверно. Класс, объявленный как final, не может быть унаследован, поэтому невозможно создать его подкласс.
 * A class, in which all the members are declared private, cannot be declared public.
 *
 * Неверно. Уровень доступа класса (например, public) не зависит от уровня доступа его членов. Например:
 * java
 * Copy code
 * public class A {
 *     private int x;
 * }
 * Правильные ответы:
 * The extends keyword is used to specify inheritance.
 * Subclass of an abstract class can be declared abstract.*/