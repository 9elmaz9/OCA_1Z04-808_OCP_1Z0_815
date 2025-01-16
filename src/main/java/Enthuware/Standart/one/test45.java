package Enthuware.Standart.one;

public class test45 {
}
//Which of the following statements are true?

//Private methods cannot be overridden in subclasses.     Only methods that are inherited can be overridden and private methods are not inherited.

//The overriding method may opt not to declare any throws clause even if the original method has a throws clause.    No exception (i.e. an empty set of exceptions) is a valid subset of the set of exceptions thrown by the original method so an overriding method can choose to not have any throws clause.

/**
 * A method can be overridden by defining a method with the same signature(i.e. name and parameter list) and return type as the method in a superclass. The return type can also be a subclass of the original method's return type.
 *
 * Only methods that are accessible can be overridden. A private method cannot, therefore, be overridden in subclasses, but the subclasses are allowed to define a new method with exactly the same signature.
 *
 * A final method cannot be overridden.
 *
 * An overriding method cannot exhibit behavior that contradicts the declaration of the original method. An overriding method therefore cannot return a different type (except a subtype) or throw a wider spectrum of exceptions than the original method in the superclass. This, of course, applies only to checked exceptions because unchecked exceptions are not required to be declared at all.
 *
 * A subclass may have a static method with the same signature as a static method in the base class but it is not called overriding. It is called hiding because the concept of polymorphism doesn't apply to static members.*/

/**
 * Ответ:
 * Правильные варианты:
 *
 * Private methods cannot be overridden in subclasses.
 * The overriding method may opt not to declare any throws clause even if the original method has a throws clause.
 * Объяснение:
 * Private methods cannot be overridden in subclasses:
 *
 * Методы с модификатором private доступны только в классе, где они объявлены, и не наследуются. Соответственно, их нельзя переопределить.
 * The overriding method may opt not to declare any throws clause even if the original method has a throws clause:
 *
 * Переопределённый метод может не объявлять throws, даже если исходный метод это делал. Однако, если переопределённый метод выберет объявить исключение, оно должно быть того же типа или подкласса объявленного в исходном методе.
 * Неверные варианты:
 * A subclass can override any method in a non-final superclass:
 * Неправильно, так как методы, объявленные как final или static, нельзя переопределить.
 *
 * An overriding method can declare that it throws a wider spectrum of checked exceptions than the method it is overriding:
 * Неправильно, потому что переопределённый метод не может выбрасывать больше проверяемых исключений, чем метод суперкласса.
 *
 * The parameter list of an overriding method must be a subset of the parameter list of the method that it is overriding:
 * Неправильно, поскольку переопределённый метод должен иметь точно такой же список параметров (по типу и порядку), чтобы соответствовать контракту переопределения.*/
