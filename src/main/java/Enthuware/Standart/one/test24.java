package Enthuware.Standart.one;

public class test24 {
}
//Which of the following statements is/are true?
//A class cannot override the super class's constructor.
/**
 * Какие из приведенных утверждений являются истинными?
 *
 * Разбор утверждений:
 * Subclasses must define all the abstract methods that the superclass defines.
 *
 * Неверно. Подкласс должен либо реализовать все абстрактные методы суперкласса, либо сам быть объявленным как abstract.
 * A class implementing an interface must define all the methods of that interface.
 *
 * Верно. Если класс реализует интерфейс, он обязан реализовать все его методы, кроме случаев, когда класс является abstract. Тогда реализация откладывается на подклассы.
 * A class cannot override the superclass's constructor.
 *
 * Верно. Конструкторы не наследуются и не могут быть переопределены. Подкласс может только вызвать конструктор суперкласса с помощью super.
 * It is possible for two classes to be the superclass of each other.
 *
 * Неверно. В Java один класс не может быть одновременно суперклассом другого, так как это привело бы к циклическому наследованию, что запрещено.
 * An interface can implement multiple interfaces.
 *
 * Неверно. Интерфейсы могут расширять (extends) несколько интерфейсов, но не могут их реализовывать (implements), так как реализация — это прерогатива класса.
 * Правильный ответ:
 * A class implementing an interface must define all the methods of that interface.
 * A class cannot override the superclass's constructor.*/