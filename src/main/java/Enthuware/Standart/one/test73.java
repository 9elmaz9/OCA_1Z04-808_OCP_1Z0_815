package Enthuware.Standart.one;

public class test73 {
}
/**
 * Given that OurClass is a MyClass and OurClass has a YourClass object.
 * Which of the following options are correct?  (Assume that OurClass, MyClass, and YourClass are valid java classes.)*/

//OurClass contains a reference to YourClass

//OurClass inherits from MyClass


/*Visualize the hierarchy like this: OurClass is a MyClass => OurClass extends( for inherits from) MyClass.
Thus, option 5 is correct. OurClass has a YourClass => OurClass refers to (or contains a reference to )
YourClass object. Thus, option 4 is correct.*/

/**
 * Давайте разберем:
 *
 * Условие:
 * OurClass является MyClass: Это говорит о том, что OurClass наследуется от MyClass.
 * OurClass содержит объект YourClass: Это означает, что в классе OurClass есть поле, которое является ссылкой на объект YourClass.
 * Варианты ответа:
 * MyClass содержит ссылку на OurClass: Неверно, так как в условии не сказано, что MyClass имеет ссылку на объект OurClass. Наследование работает в другом направлении: OurClass наследует от MyClass.
 *
 * OurClass содержит ссылку на MyClass: Неверно, поскольку OurClass не содержит ссылок на MyClass, но наследует его. Наследование — это не ссылка.
 *
 * MyClass содержит ссылку на YourClass: Неверно, в условии ничего не указано о связи между MyClass и YourClass.
 *
 * OurClass содержит ссылку на YourClass: Верно, это прямо указано в условии.
 *
 * OurClass наследуется от MyClass: Верно, так как условие говорит, что OurClass является MyClass.
 *
 * Правильные ответы:
 * OurClass содержит ссылку на YourClass
 * OurClass наследуется от MyClass*/

