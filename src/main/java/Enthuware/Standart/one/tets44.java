package Enthuware.Standart.one;

public class tets44 {
}
//Identify the valid members of Boolean class.

//parseBoolean(String )
//valueOf(boolean )
//FALSE TRUE and FALSE are valid static members of Boolean class.

/**
 * You need to remember the following points about Boolean:
 * 1. Boolean class has two constructors - Boolean(String) and Boolean(boolean) The String constructor allocates a Boolean object representing
 * the value true if the string argument is not null and is equal, ignoring case, to the string "true". Otherwise,
 * allocate a Boolean object representing the value false. Examples: new Boolean("True") produces a Boolean object
 * that represents true. new Boolean("yes") produces a Boolean object that represents false.  The boolean constructor is self explanatory.
 * 2. Boolean class has two static helper methods for creating booleans - parseBoolean and valueOf. Boolean.parseBoolean(String ) method returns
 * a primitive boolean and not a Boolean object (Note - Same is with the case with other parseXXX methods such as Integer.parseInt - they return primitives and not objects).
 * The boolean returned represents the value true if the string argument is not null and is equal, ignoring case, to the string "true".  Boolean.valueOf(String )
 * and its overloaded Boolean.valueOf(boolean ) version, on the other hand, work similarly but return a reference to either Boolean.TRUE or Boolean.FALSE wrapper objects.
 * Observe that they dont create a new Boolean object but just return the static constants TRUE or FALSE defined in Boolean class.
 * 3. When you use the equality operator ( == ) with booleans, if exactly one of the operands is a Boolean wrapper,
 * it is first unboxed into a boolean primitive and then the two are compared (JLS 15.21.2). If both are Boolean wrappers,
 * then their references are compared just like in the case of other objects.
 * Thus, new Boolean("true") == new Boolean("true") is false, but new Boolean("true") == Boolean.parseBoolean("true") is true.*/


/**
 * Ответ:
 * Правильные члены класса Boolean:
 *
 * parseBoolean(String)
 * valueOf(boolean)
 * Boolean(Boolean) (Конструктор)
 * Объяснение:
 * parseBoolean(String):
 *
 * Статический метод, который преобразует строку в значение boolean. Если строка равна "true" (регистр не имеет значения), возвращает true, иначе false.
 * java
 * Copy code
 * System.out.println(Boolean.parseBoolean("true")); // true
 * System.out.println(Boolean.parseBoolean("false")); // false
 * valueOf(boolean):
 *
 * Возвращает объект типа Boolean, представляющий указанное значение boolean.
 * java
 * Copy code
 * Boolean b = Boolean.valueOf(true);
 * System.out.println(b); // true
 * Boolean(Boolean):
 *
 * Конструктор, который создает объект Boolean из значения типа boolean.
 * java
 * Copy code
 * Boolean b = new Boolean(true);
 * System.out.println(b); // true
 * Неверные члены:
 * parseBoolean(boolean): Такого метода нет, метод работает только с String.
 * FALSE: В классе Boolean есть статическая константа Boolean.FALSE, но она должна быть написана как Boolean.FALSE, а не просто FALSE.
 * Итог:
 * Выберите:
 *
 * parseBoolean(String)
 * valueOf(boolean)
 * Boolean(Boolean)*/
