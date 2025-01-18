package Enthuware.Standart.one;

public class test61 {
}
//Under what situations does a class get a default constructor?
//If the class does not define any constructors explicitly.
//In this case, the compiler will add a no args constructor for this class.

/**
 * На вопрос: "При каких условиях класс получает конструктор по умолчанию?"
 *
 * Объяснение вариантов:
 * "All classes in Java get a default constructor."
 *
 * Неверно. Конструктор по умолчанию создаётся только в том случае, если класс не определяет никаких конструкторов явно.
 * "You have to define at least one constructor to get the default constructor."
 *
 * Неверно. Как только вы определяете хотя бы один конструктор, компилятор не создаёт конструктор по умолчанию.
 * "If the class does not define any constructors explicitly."
 *
 * Верно. Конструктор по умолчанию создаётся только если в классе отсутствуют явно определённые конструкторы.
 * "All classes get default constructor from Object class."
 *
 * Неверно. Класс Object предоставляет конструктор без аргументов, но это не означает, что все классы получают его. Конструктор по умолчанию создаётся компилятором для вашего класса, если вы ничего не определили.
 * "None of the above."
 *
 * Неверно, так как правильный ответ есть.
 * Правильный ответ:
 * "If the class does not define any constructors explicitly."
 *
 * Компилятор создаёт конструктор по умолчанию только если вы сами не добавили никаких конструкторов в класс.*/