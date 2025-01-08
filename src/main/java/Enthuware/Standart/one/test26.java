package Enthuware.Standart.one;

public class test26 {
}
//Objects of which of the following classes can be thrown using a throw statement?
//Throwable
//Exception
//RuntimeException

/*
* You can only throw a java.lang.Throwable object (i.e. an instance of Throwable or any of its direct or indirect subclasses) using a throws clause.
*  Remember that java.lang.Exception and java.lang.Error are the only two direct subclasses of Throwable. All other exception classes inherit directly or indirectly from one of these two.*/

/**
 * Вопрос:
 * Какие из приведенных классов могут быть выброшены с помощью оператора throw?
 *
 * Разбор:
 * В Java можно выбрасывать только объекты классов, которые являются наследниками класса Throwable. Это базовый класс для всех объектов, которые могут быть выброшены как исключения. Он делится на два основных подкласса:
 *
 * Error (для серьезных ошибок системы).
 * Exception (для проверяемых исключений, связанных с логикой программы).
 * Рассмотрим каждый вариант:
 * Event:
 *
 * Неверно.
 * Класс Event (или похожие пользовательские классы) не является наследником Throwable и не может быть выброшен.
 * Object:
 *
 * Неверно.
 * Класс Object является базовым для всех объектов в Java, но он не является наследником Throwable.
 * Throwable:
 *
 * Верно.
 * Throwable и его подклассы могут быть выброшены.
 * Exception:
 *
 * Верно.
 * Exception — это подкласс Throwable, и его экземпляры могут быть выброшены.
 * RuntimeException:
 *
 * Верно.
 * RuntimeException — это подкласс Exception, который также может быть выброшен.
 * Правильные ответы:
 * Throwable
 * Exception
 * RuntimeException*/