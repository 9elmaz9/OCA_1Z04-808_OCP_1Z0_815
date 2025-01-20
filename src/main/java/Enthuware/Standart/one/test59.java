package Enthuware.Standart.one;

public class test59 {
}
//This is a Drag and Drop type question. Please click on 'Show DnD Screen' to see the question.

/**
 * You need to understand how append, insert, delete, and substring methods of StringBuilder/StringBuffer work.
 * Please go through JavaDoc API for these methods. This is very important for the exam.
 * Observe that substring() does not modify the object it is invoked on but append, insert and delete do.
 * In the exam, you will find questions that use such quirky syntax, where multiple calls are chained together.
 * For example: sb.append("a").append("asdf").insert(2, "asdf"). Make yourself familiar with this technique.
 * If in doubt, just break it down into multiple calls.
 * For example, the aforementioned statement can be thought of as:  sb.append("a"); sb.append("asdf"); sb.insert(2, "asdf")
 * Note that the method substring() in StringBuilder/StringBuffer returns a String (and not a reference to itself,
 * unlike append, insert, and delete). So another StringBuilder method cannot be chained to it. For example,
 * the following is not valid: sb.append("a").substring(0, 4).insert(2, "asdf");  The following is valid though:String str = sb.append("a").insert(2, "asdf").substring(0, 4);*/

/**
 В этом вопросе нужно определить изменения содержимого объектов StringBuilder после выполнения определенных операций. Давайте разберем каждое действие:

 Задано:
 java
 Copy code
 StringBuilder b1 = new StringBuilder("snorker");
 StringBuilder b2 = new StringBuilder("yoodler");
 Разбор операций:
 1.
 java
 Copy code
 b1.append(b2.substring(2, 5).toUpperCase());
 b2.substring(2, 5) возвращает "odl" (символы с индексами 2 по 4 включительно).
 .toUpperCase() преобразует "odl" в "ODL".
 b1.append("ODL") добавляет "ODL" в конец b1.
 Результат:

 b1 = "snorkerODL"
 b2 = "yoodler"
 2.
 java
 Copy code
 b2.insert(3, b1.append("a"));
 b1.append("a") добавляет "a" к b1, результат: b1 = "snorkera".
 b2.insert(3, "snorkera") вставляет строку "snorkera" в b2 на позицию 3.
 Результат:

 b1 = "snorkera"
 b2 = "yoosnorkeradler"








 Разберём этот код строка за строкой и объясним, что произойдёт.

 Код:
 java
 Copy code
 b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
 Входные данные:
 b1: StringBuilder b1 = new StringBuilder("snorHer");
 b2: StringBuilder b2 = new StringBuilder("yoodler");
 Шаг 1: Вызов b2.append(false)
 b2.append(false) добавляет строковое представление false в конец b2.
 До вызова: b2 = "yoodler"
 После вызова: b2 = "yoodlerfalse"
 Шаг 2: Вызов b2.substring(4)
 b2.substring(4) возвращает подстроку из b2, начиная с индекса 4.
 На данном этапе b2 = "yoodlerfalse", а b2.substring(4) вернёт строку "lerfalse".
 Шаг 3: Вызов b1.replace(3, 4, b2.substring(4))
 b1.replace(3, 4, b2.substring(4)) заменяет часть строки b1 с индекса 3 (включительно) по индекс 4 (исключительно) строкой "lerfalse".
 До вызова: b1 = "snorHer"
 Индексы в строке b1:
 Copy code
 0   1   2   3   4   5   6
 s   n   o   r   H   e   r
 Замена символа по индексу 3 ("r") на "lerfalse".
 После вызова: b1 = "snolerfalseHer"
 Шаг 4: Вызов .append(b2)
 После замены, к строке b1 добавляется результат вызова b2.append(false).
 На данном этапе b2 = "yoodlerfalsefalse" (после второго вызова append(false)).
 b1.append(b2) добавляет всю строку b2 к концу b1.
 Итоговые значения:
 b1: "snolerfalseHeryoodlerfalsefalse"
 b2: "yoodlerfalsefalse"
 Вывод:
 Этот код корректно скомпилируется и выполнится. Итоговые строки b1 и b2 показаны выше.*/