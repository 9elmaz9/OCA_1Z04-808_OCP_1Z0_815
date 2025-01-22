package Enthuware.Standart.one;

public class tets78 {
}
//Which of these statements are true?

//A constructor can be declared private.  This feature is used for implementing Singleton Classes.

//A constructor can access the non-static members of a class.
//A constructor is non-static, and so it can access directly both the static and non-static members of the class.


//Constructors need not initialize *all* the member variables of the class. A non-final member(i.e. an instance) variable will be assigned a default value if not explicitly initialized.

/**
 * Для данного вопроса нужно выбрать два утверждения, которые верны.
 *
 * "All classes must explicitly define a constructor."
 *
 * Неверно.
 * Если класс не определяет явно конструктор, компилятор автоматически добавляет конструктор по умолчанию (default constructor).
 * "A constructor can be declared private."
 *
 * Верно.
 * Конструкторы могут быть объявлены с любым модификатором доступа, включая private. Это часто используется, например, в паттерне Singleton.
 * "A constructor can declare a return value."
 *
 * Неверно.
 * Конструкторы не могут возвращать значения, включая void. Они не имеют возвращаемого типа.
 * "A constructor must initialize all the member variables of a class."
 *
 * Неверно.
 * Конструктор не обязан явно инициализировать все переменные. Если переменные не инициализированы, они получают значения по умолчанию.
 * "A constructor can access the non-static members of a class."
 *
 * Верно.
 * Конструктор имеет доступ к нестатическим членам класса, так как он вызывается в контексте объекта.
 * Ответ:
 * "A constructor can be declared private."
 * "A constructor can access the non-static members of a class."*/
