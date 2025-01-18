package Enthuware.Standart.one;

public class test55 {
}

//This is a Drag and Drop type question. Please click on 'Show DnD Screen' to see the question.
/**
 * На этом изображении представлены четыре фрагмента кода, каждый из которых вызывает исключение. Давайте рассмотрим, какое исключение будет выброшено для каждого случая.
 *
 * 1. Фрагмент кода:
 * java
 * Copy code
 * int[] ia = new int[]{1, 2, 3};
 * System.out.println(ia[-1]);
 * Исключение: ArrayIndexOutOfBoundsException
 *
 * Здесь мы пытаемся получить элемент массива с отрицательным индексом [-1], что недопустимо. В результате выбрасывается исключение ArrayIndexOutOfBoundsException.
 * 2. Фрагмент кода:
 * java
 * Copy code
 * public class X {
 *     static int k = 0;
 *     static {
 *         k = 10 / 0;
 *     }
 * }
 * Исключение: ExceptionInInitializerError
 *
 * Статический блок инициализации (static) выполняется при загрузке класса. В данном случае внутри статического блока происходит деление на 0, что приводит к ArithmeticException. Однако, поскольку это происходит в статическом контексте, исключение оборачивается в ExceptionInInitializerError.
 * 3. Фрагмент кода:
 * java
 * Copy code
 * SomeClass sc = new SomeClass();
 * // Assume that SomeClass is not available in runtime classpath.
 * Исключение: NoClassDefFoundError
 *
 * Исключение NoClassDefFoundError выбрасывается, если JVM не может найти указанный класс во время выполнения, несмотря на его наличие во время компиляции. Здесь SomeClass отсутствует в classpath.
 * 4. Фрагмент кода:
 * java
 * Copy code
 * public class X {
 *     static {
 *         if (true) throw new NullPointerException();
 *     }
 * }
 * Исключение: NullPointerException
 *
 * Исключение NullPointerException явно выбрасывается в статическом блоке. JVM выбрасывает это исключение напрямую, так как это указано в коде.
 * Соответствие:
 * ArrayIndexOutOfBoundsException
 * ExceptionInInitializerError
 * NoClassDefFoundError
 * NullPointerException*/