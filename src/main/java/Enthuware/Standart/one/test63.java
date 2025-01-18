package Enthuware.Standart.one;

public class test63 {
}
//Which of these statements concerning interfaces are true?

//An interface may extend an interface.
//Unlike a class, an interface can extend from multiple interfaces.


//A class can implement an interface and extend a class.

/**The keyword implements is used when a class inherits method prototypes from an interface. The keyword extends is used when an interface inherits from another interface, or a class inherits from another class.*/


/**
 * В этом вопросе спрашивается о свойствах интерфейсов в Java. Давай разберём каждый вариант:
 *
 * An interface may extend an interface.
 * Правильно.
 * Интерфейс в Java может наследовать (extend) другой интерфейс. Например:
 *
 * java
 * Copy code
 * interface A {
 *     void methodA();
 * }
 *
 * interface B extends A {
 *     void methodB();
 * }
 * An interface may extend a class and may implement an interface.
 * Неправильно.
 * Интерфейс не может наследовать класс (extend class) и не может реализовывать другой интерфейс (implement). Он может только наследовать другой интерфейс.
 *
 * A class can implement an interface and extend a class.
 * Правильно.
 * Класс может одновременно наследовать (extend) другой класс и реализовывать (implement) интерфейсы. Например:
 *
 * java
 * Copy code
 * class MyClass extends SomeClass implements MyInterface {
 *     // Реализация методов интерфейса
 * }
 * A class can extend an interface and can implement a class.
 * Неправильно.
 * Класс не может наследовать интерфейс. Он может только реализовывать интерфейсы и наследовать другие классы.
 *
 * An interface can only be implemented and cannot be extended.
 * Неправильно.
 * Интерфейсы могут быть наследованы (extended) другими интерфейсами.
 *
 * Правильные ответы:
 * An interface may extend an interface.
 * A class can implement an interface and extend a class.*/