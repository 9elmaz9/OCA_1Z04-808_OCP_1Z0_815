package Enthuware.Standart.one;

public class test43 {
}
//Which of these methods are not a part of the String class?
//reverse

/**
 * Ответ:
 * Метод reverse не является частью класса String. Он принадлежит классу StringBuilder.
 *
 * Разбор:
 * trim: Метод из класса String, удаляет начальные и конечные пробелы.
 *
 * java
 * Copy code
 * String str = "  hello  ";
 * System.out.println(str.trim()); // "hello"
 * length: Метод из класса String, возвращает длину строки.
 *
 * java
 * Copy code
 * String str = "hello";
 * System.out.println(str.length()); // 5
 * concat: Метод из класса String, объединяет строки.
 *
 * java
 * Copy code
 * String str1 = "hello";
 * String str2 = "world";
 * System.out.println(str1.concat(str2)); // "helloworld"
 * hashCode: Метод из класса String, возвращает хэш-код строки.
 *
 * java
 * Copy code
 * String str = "hello";
 * System.out.println(str.hashCode());
 * reverse: Это метод из класса StringBuilder, который меняет порядок символов строки.
 *
 * java
 * Copy code
 * StringBuilder sb = new StringBuilder("hello");
 * System.out.println(sb.reverse()); // "olleh"
 * Итог:
 * Правильный ответ: reverse.*/