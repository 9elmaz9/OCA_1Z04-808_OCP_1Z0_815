package Enthuware.Standart.one;

public class test49 {
}
//What class of objects can be declared by the throws clause?
//Exception
//Error
//RuntimeException


//You can declare anything that is a Throwable or a subclass of Throwable, in the throws clause.


/**
 * В этом вопросе нужно определить, какие классы объектов могут быть объявлены с помощью throws.
 *
 * Объяснение:
 * throws:
 *
 * Используется для указания, что метод может выбрасывать исключения.
 * Могут быть объявлены объекты, которые являются подклассами класса Throwable.
 * Основные подклассы Throwable:
 * Exception: Проверяемые исключения (Checked Exceptions), такие как IOException или SQLException.
 * Error: Исключения, указывающие на ошибки, которые не рекомендуется обрабатывать, такие как OutOfMemoryError.
 * Какие классы могут быть объявлены в throws:
 *
 * Exception: Да, это подкласс Throwable.
 * Error: Да, это подкласс Throwable.
 * RuntimeException: Да, это подкласс Exception, а значит, также наследуется от Throwable.
 * Какие классы не могут быть объявлены в throws:
 *
 * Object: Нет, так как он не наследуется от Throwable.
 * Event: Нет, так как он не относится к иерархии исключений.
 * Ответ:
 * Выберите следующие варианты:
 *
 * Exception
 * Error
 * RuntimeException*/