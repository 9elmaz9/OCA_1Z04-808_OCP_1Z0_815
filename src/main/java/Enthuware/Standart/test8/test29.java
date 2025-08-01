package Enthuware.Standart.test8;

public class test29 {
}
/**Consider the following lines of code:
 * System.out.println(null + true); //1
 * System.out.println(true + null); //2
 * System.out.println(null + null); //3
 *
 * Which of the following statements are correct?*/

//None of the 3 lines will compile.

/**Note that none of the parameters is a String so conversion to String will not happen. The following are the error messages given by the compiler.

 C:\works\nbtestproject\src\TestClass.java:46: operator + cannot be applied to <nulltype>,boolean
 System.out.println(null + true); //1
 C:\works\nbtestproject\src\TestClass.java:46: reference to println is ambiguous, both method println(char[]) in java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
 System.out.println(null + true); //1
 C:\works\nbtestproject\src\TestClass.java:47: operator + cannot be applied to boolean,<nulltype>
 System.out.println(true + null); //2
 C:\works\nbtestproject\src\TestClass.java:47: reference to println is ambiguous, both method println(char[]) in java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
 System.out.println(true + null); //2
 C:\works\nbtestproject\src\TestClass.java:48: operator + cannot be applied to <nulltype>,<nulltype>
 System.out.println(null + null); //3
 C:\works\nbtestproject\src\TestClass.java:48: reference to println is ambiguous, both method println(char[]) in java.io.PrintStream and method println(java.lang.String) in java.io.PrintStream match
 System.out.println(null + null); //3
 6 errors

 If one operand expression is of type String, then string conversion is performed on the other operand to produce a String at run time. The result is a reference to a newly created String object that is the concatenation of the two Strings. The characters of the left-hand operand precede the characters of the right-hand operand in the newly created string.
 Any type may be converted to type String by string conversion.
 A value x of primitive type T is first converted to a reference value as if by giving it as an argument to an appropriate class instance creation expression e.g. if T is boolean, then use new Boolean(x) .
 toString() is defined by the primordial class Object; many classes override it, notably Boolean, Character, Integer, Long, Float, Double, and String.

 Note that had there been a method like String getString() { return null; }, println( getString() + true ) etc. would have compiled fine and would have printed "nulltrue".
 */

