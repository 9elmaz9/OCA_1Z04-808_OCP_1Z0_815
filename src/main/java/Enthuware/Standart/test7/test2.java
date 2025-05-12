package Enthuware.Standart.test7;

public class test2 {
}
/**What will the following code snippet print when compiled and run?
 * byte starting = 3;
 * short firstValue = 5;
 * int secondValue = 7;
 * int functionValue =
 *  (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
 *  System.out.println(functionValue); */

//7

/**Remember that whenever both the operands of a mathematical operator (such as / and *)
 * are integral types except long (i.e. byte, char, short, and int), the result is always
 * the integer value that remains after truncating the fractional value. For example, 5/3 is 1.6666
 * but the result will be 1 after removing the fractional part. Observe that there is no "rounding off" here.
 * In the expression given in this question, starting, firstValue, and secondValue are of type byte,
 * short, and int respectively. Thus, the above rule is applicable here. Therefore, starting/2 will result in 1,
 * firstValue/2 will result in 2, firstValue/3 will result in 1, and secondValue/2 will result in 3.
 * The expression will therefore be equivalent to:        (int) ( 1 + 2 + 1 ) + 3 => (int)(4) + 3 => 7
 * Although not important for this question, you should remember that the type of the result will be int even if
 * both the operands are of a type that is smaller than an int.
 * Thus, the following will not compile - byte b1 = 1; byte b2 = 2; byte b = b1 + b2;
 * //result is of type int, which cannot be assigned directly to a byte  You have to use
 * a cast: byte b = (byte) (b1 + b2); //OK now  Similarly, when one of the operands is of type long,
 * float, or double and the other operand is of a smaller size,
 * the result will be a long, float, or double respectively. */