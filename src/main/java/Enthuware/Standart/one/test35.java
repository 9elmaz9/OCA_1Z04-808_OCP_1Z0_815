package Enthuware.Standart.one;

public class test35 {
}
//Which of these combinations of switch expression types and case label value types are legal within a switch statement?

//switch expression of type int and case label value of type char.
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
The default label is optional and at most one default label may be associated with the same switch statement.
*/

/**Вопрос:
 Какие комбинации типов выражений switch и значений меток case являются допустимыми в выражении switch?

 Разбор:
 В Java выражение switch поддерживает следующие типы данных:

 int и любые типы, которые автоматически приводятся к int:

 byte
 short
 char
 String (с Java 7 и выше).

 enum.

 Integer, Byte, Short, Character (их обертки).

 boolean и метки case для true и false недопустимы.

 Анализ вариантов:
 switch expression of type int and case label value of type char.

 Верно. Тип char может быть автоматически приведен к int. Это допустимо.
 switch expression of type float and case label value of type int.

 Неверно. Тип float не поддерживается в выражении switch.
 switch expression of type byte and case label value of type float.

 Неверно. Тип float не поддерживается в выражении switch.
 switch expression of type char and case label value of type byte.

 Неверно. Тип byte не может быть приведен к char.
 switch expression of type boolean and case label value of type boolean.

 Неверно. Тип boolean не поддерживается в выражении switch.
 Правильный ответ:
 switch expression of type int and case label value of type char.





 Хорошо, давай разберём проще:

 Что можно использовать в switch?
 В Java в выражении switch можно использовать только определённые типы данных:

 int, а также те типы, которые можно автоматически превратить в int:
 byte
 short
 char
 String (начиная с Java 7).
 enum (перечисления).
 Типы вроде float, double, boolean нельзя использовать в switch.

 Теперь про варианты:
 int и char:

 char можно превратить в int, потому что символы в Java представляют числа (например, 'A' — это 65).
 Это допустимо. ✅
 float и int:

 float нельзя использовать в switch, так что это недопустимо. ❌
 byte и float:

 float нельзя использовать в case, так что это недопустимо. ❌
 char и byte:

 byte нельзя превратить в char напрямую, так что это недопустимо. ❌
 boolean и boolean:

 boolean нельзя использовать в switch, так что это недопустимо. ❌
 Итог:
 Только int и char — это правильный ответ.
 * */
