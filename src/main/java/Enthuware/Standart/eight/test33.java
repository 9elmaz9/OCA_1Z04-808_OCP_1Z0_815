package Enthuware.Standart.eight;

public class test33 {
}
/**What will the following code print when run?
 *  public class TestClass {
 *  public static void main(String[] args) throws Exception {
 *  boolean flag  = true;
 *  switch (flag){
 *  case true : System.out.println("true");
 *  default: System.out.println("false");
 *  }
 *  } }*/


//It will not compile.

//A boolean cannot be used for a switch statement. It needs an integral type, an enum, or a String.

/**Rules for a switch statement
 Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. String is allowed since Java 7.
 The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
 The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535. For example, the following will not compile because 200 cannot be assigned to the variable b, which can only hold values from -128 to 127.
 byte b = 10;
 switch(b){
 case 100 : System.out.print(100); //OK
 case 200 :  System.out.print(200); //will not compile
 }
 All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals such as 'a', 5, 10, or a final variable, the value of which is computed at compile time such as int I = 2*3; For example, the following is valid:
 int x = 10;
 final int I = 2*3;
 switch(x){
 case I : System.out.println(x); //this is valid because I is a compile time constant
 }
 No two of the case constant expressions associated with a switch statement may have the same value.
 The default label is optional and at most one default label may be associated with the same switch statement.*/


/**
 * Copy code
 public class TestClass {
 public static void main(String[] args) throws Exception {
 boolean flag = true;
 switch (flag) {
 case true:
 System.out.println("true");
 break;
 default:
 System.out.println("false");
 }
 }
 }
 Причина ошибки:
 Тип переменной в switch:

 В Java switch можно использовать только типы, которые могут быть перечислены в case. Это могут быть byte, short, char, int, String или перечисления (enum).
 boolean не является допустимым типом для switch. Это означает, что компилятор сразу поймает ошибку еще до выполнения программы.
 Компиляция:

 Когда вы пытаетесь скомпилировать этот код, компилятор не позволяет использовать boolean в switch, потому что это некорректно. Компилятор сообщает об ошибке на этапе компиляции, и программа не скомпилируется.
 Исключения во время выполнения (runtime exceptions):

 Исключения во время выполнения происходят, когда код компилируется, но в ходе исполнения программы встречаются ошибки (например, деление на ноль, неправильный индекс массива и т.д.).
 В данном случае проблема не во время выполнения, а на этапе компиляции, так как компилятор не может обработать switch с типом boolean.
 Итог:
 Ошибка не возникнет во время выполнения (runtime error), потому что код не пройдет компиляцию.
 Ошибка компиляции возникает из-за некорректного использования boolean в switch.
 Правильный ответ:
 It will not compile.







 Ошибка компиляции (It will not compile):
 Ошибка компиляции возникает до запуска программы, когда компилятор проверяет код на наличие синтаксических ошибок или несоответствий типам данных, как в случае с использованием boolean в switch.
 Когда код не компилируется, программа не запускается вообще, потому что компилятор не может создать исполнимый файл (например, .class файл в Java).
 Пример: В вашем случае компилятор сразу сообщит, что тип boolean недопустим для switch, и программа не будет скомпилирована.
 Исключение во время выполнения (Runtime Exception):
 Исключения во время выполнения происходят после того, как программа уже скомпилирована и запущена, когда во время исполнения возникают ошибки (например, деление на ноль, обращение к несуществующему индексу массива и т.д.).
 Программа запустится, но когда она достигнет ошибочной точки, будет выброшено исключение, и программа прекратит выполнение на этом этапе.
 Пример: Если бы в вашем коде был корректный switch с ошибочными значениями в case, программа бы скомпилировалась, но могла бы выбросить исключение во время выполнения.
 Итог:
 Ошибка компиляции: Программа не запускается из-за синтаксической ошибки, выявленной компилятором (в вашем случае, boolean в switch).
 Исключение во время выполнения: Программа запускается, но в процессе выполнения возникает ошибка, которая выбрасывает исключение.
 В вашем примере будет ошибка компиляции, а не исключение во время выполнения.*/
