package Enthuware.Standart.one;

public class test77 {
}
//This is a Drag and Drop type question. Please click on 'Show DnD Screen' to see the question.

/*Please read ExceptionClassSummary document in the "Study References" section.
Note that the question is not asking what exception you need to put in the catch(...) part or throws clause. It is just asking what exceptions will be thrown by the code fragments when they are executed.*/


/**
 * В данном задании нужно сопоставить кодовые фрагменты с исключениями, которые будут выброшены при выполнении.
 *
 * String s = null; System.out.println(s.length());
 *
 * Исключение: NullPointerException
 * Причина: Переменная s равна null, вызов метода length() на null вызывает NullPointerException.
 * int[] ia = new int[]{1, 2, 3}; System.out.println(ia[3]);
 *
 * Исключение: ArrayIndexOutOfBoundsException
 * Причина: Индекс 3 выходит за пределы массива (доступны индексы 0, 1, 2).
 * Class.forName("java.lang.String");
 *
 * Исключение: No Exception Will Be Thrown
 * Причина: Класс java.lang.String существует в стандартной библиотеке, исключения выброшено не будет.
 * public class X { static { throw new NullPointerException(); } }
 *
 * Исключение: ExceptionInInitializerError
 * Причина: Исключение NullPointerException выбрасывается внутри статического блока и оборачивается в ExceptionInInitializerError.
 * Итоговые ответы:
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * No Exception Will Be Thrown
 * ExceptionInInitializerError*/

