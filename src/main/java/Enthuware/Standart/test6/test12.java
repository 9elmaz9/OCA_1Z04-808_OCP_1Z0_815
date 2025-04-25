package Enthuware.Standart.test6;

public class test12 {
}

/**Assuming that a valid integer will be passed in the command line as first argument,
 *  which statements regarding the following code are correct?
 *  public class TestClass{    public static void main(String args[]){
 *  int x = Integer.parseInt(args[0]);
 *  switch(x){
 *  case x < 5 :
 *  System.out.println("BIG");
 *  break;
 *  case x > 5 :
 *  System.out.println("SMALL");
 *  default :
 *  System.out.println("CORRECT"); break;
 *  }
 *  } } */

//It will not compile.

/**It will say the following when compiled:
 * TestClass.java: incompatible types
 * found: boolean
 * required: int
 * case x < 5 :
 * System.out.println("BIG"); break;
 *
 * TestClass.java: incompatible types
 * found: boolean
 * required: int case x > 5 :
 * System.out.println("SMALL");
 *
 * This is because the type of the case labels must be consistent with the type of the switch condition.
 * Here, switch condition is an int, so the case label values must be assignable to the switch condition variable.
 * The expression x<5 is of type boolean, which cannot be assigned it x (since it is an int).
 * Further, the expression in a switch statement must be of the type char, byte, short, int, Character, Byte,
 * Short, Integer, String, or an enum. It cannot be a boolean. This is another reason the given code will not compile.
 * Further more, the expression in case must generate a constant value. Here, the value of the expression x<5 is not constant.
 * It is variable. So it is invalid.*/