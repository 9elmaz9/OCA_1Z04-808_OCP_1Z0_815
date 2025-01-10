package Enthuware.Standart.one;

public class test29 {
}
/**
 *
 * Consider the following variable declaration within the definition of an interface:
 *   int i = 10;
 * Which of the following declarations defined in a non-abstract class, is equivalent to the above?*/

//
//public static final int i = 10;

//Fields in an interface are implicitly public, static and final. Although you can put these words in the interface definition but it is not a good practice to do so.

/**
 * Вопрос:
 * Какое из следующих объявлений, определенных в неабстрактном классе, эквивалентно следующему объявлению переменной внутри интерфейса?
 *
 * java
 * Copy code
 * int i = 10;
 * Разбор:
 * В интерфейсах все переменные по умолчанию:
 * public: Доступны всем.
 * static: Связаны с интерфейсом, а не с экземпляром.
 * final: Их значение не может быть изменено после инициализации.
 * Таким образом, объявление int i = 10; внутри интерфейса на самом деле эквивалентно:
 * java
 * Copy code
 * public static final int i = 10;
 * Варианты:
 * public static int i = 10;
 *
 * Неверно. Не хватает модификатора final.
 * public final int i = 10;
 *
 * Неверно. Не хватает модификатора static.
 * public static final int i = 10;
 *
 * Верно. Это полностью эквивалентно объявлению внутри интерфейса.
 * public int i = 10;
 *
 * Неверно. Не хватает модификаторов static и final.
 * final int i = 10;
 *
 * Неверно. Не хватает модификаторов public и static.
 * Правильный ответ:
 * public static final int i = 10;*/