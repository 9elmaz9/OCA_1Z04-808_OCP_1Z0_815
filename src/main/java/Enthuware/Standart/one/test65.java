package Enthuware.Standart.one;

public class test65 {
}
//This is a Drag and Drop type question. Please click on 'Show DnD Screen' to see the question.

/**
 * i1 == i2 will return false because both are pointing to different object. i1 == i3 will return true because one operand is a primitive int and so the other will be unboxed and then the value will be compared. i1 == b1 will not even compile because type of i1 and b1 references are classes that are not in the same class hierarchy. So == knows at compile time itself that they can't point to the same object. i1.equals(i2) will return true because both are Integer objects and both have the value 1. i1.equals(b1) and i1.equals(g1) will return false because they are pointing to objects of different types.  Signature of equals method is : boolean equals(Object o); So it can take any object hence there will be no compilation error. Further, The equals methods of all wrapper classes first check if the two object are of same class or not. If not, they immediately return false.*/

/**
 * На этом изображении тестируется сравнение объектов разных типов в Java, используя операторы == и метод .equals(). Разберем каждое утверждение:
 *
 * Декларации:
 * Integer i1 = 1;
 *
 * Автоупаковка: число 1 (int) преобразуется в объект типа Integer.
 * Integer i2 = new Integer(1);
 *
 * Здесь явно создается новый объект типа Integer с тем же значением.
 * int i3 = 1;
 *
 * Обычная переменная примитивного типа int.
 * Byte b1 = 1;
 *
 * Автоупаковка: число 1 (int) преобразуется в объект типа Byte.
 * Long g1 = 1L;
 *
 * Автоупаковка: число 1L (long) преобразуется в объект типа Long.
 * Проверка утверждений:
 * i1 == i2
 *
 * Результат: false
 * == сравнивает ссылки на объекты. Поскольку i1 и i2 указывают на разные объекты, результат false.
 * i1 == i3
 *
 * Результат: true
 * Здесь происходит распаковка i1 (преобразование в int) для сравнения с i3. Значения совпадают, поэтому результат true.
 * i1 == b1
 *
 * Результат: Не компилируется
 * Компилятор не позволяет сравнивать объекты разных типов (Integer и Byte) с использованием ==.
 * i1.equals(i2)
 *
 * Результат: true
 * Метод .equals() в классе Integer сравнивает значения объектов, а не ссылки. Поскольку значения равны (оба равны 1), результат true.
 * i1.equals(g1)
 *
 * Результат: Исключение во время выполнения
 * Метод .equals() проверяет тип объекта перед сравнением. Так как g1 — это Long, а i1 — Integer, результат — ClassCastException.
 * i1.equals(b1)
 *
 * Результат: false
 * Типы объектов разные (Integer и Byte). Хотя оба значения равны 1, .equals() возвращает false, так как типы не совпадают.*/