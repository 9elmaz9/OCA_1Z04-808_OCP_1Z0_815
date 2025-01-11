package Enthuware.Standart.one;

public class Test34 {
}
//Which of these combinations of switch expression types and case label value types are legal within a switch statement?

//switch expression of type int and case label value of type char.

/**
 *
 * switch expression of type int and case label value of type char.
 * Note that the following is invalid though because
 * a char cannot be assigned to an Integer: Integer x = 1;
 * // int x = 1; is valid. switch(x){
 * case 'a' : System.out.println("a"); }*/

/**
 * Rules for a switch statement
 * Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. String is allowed since Java 7.
 * The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
 * The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535. For example, the following will not compile because 200 cannot be assigned to the variable b, which can only hold values from -128 to 127.
 * byte b = 10;
 * switch(b){
 *     case 100 : System.out.print(100); //OK
 *     case 200 :  System.out.print(200); //will not compile
 * }
 * All case labels should be COMPILE TIME CONSTANTS. This means, you can have literals such as 'a', 5, 10, or a final variable, the value of which is computed at compile time such as int I = 2*3; For example, the following is valid:
 * int x = 10;
 * final int I = 2*3;
 * switch(x){
 *    case I : System.out.println(x); //this is valid because I is a compile time constant
 * }
 * No two of the case constant expressions associated with a switch statement may have the same value.
 * The default label is optional and at most one default label may be associated with the same switch statement.*/



