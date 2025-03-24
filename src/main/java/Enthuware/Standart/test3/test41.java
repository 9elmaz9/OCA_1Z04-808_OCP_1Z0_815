package Enthuware.Standart.test3;

public class test41 {
}
//    Which of the following statements will compile without any error?


//System.out.println("a"+'b'+63);
//Since the first operand is a String all others (one by one) will be converted to String."ab" + 63 => "ab63"


//System.out.println("a"+63);
//Since the first operand is a String all others (one by one) will be converted to String."a" + 63 => "a63"


//System.out.println('b'+new Integer(63));
//Since the first operand of + one is of numeric type, its numeric value of 98 will be used.
// Integer 63 will be unboxed and added to 98. Therefore, the final value will be int 161.


//    String s = 'b'+63+"a";
//Since the first one is numeric type so, 'b'+63 = 161, 161+"a" = 161a.

/**+ is overloaded such that if any one of its two operands is a String then it will convert the other operand to a String and create a new string by concatenating the two.
 Therefore, in 63+"a" and "a"+63, 63 is converted to "63" and 'b' +"a" and "a"+'b', 'b' is converted to "b".
 Note that in 'b'+ 63 , 'b' is promoted to an int i.e. 98 giving 161.
 */