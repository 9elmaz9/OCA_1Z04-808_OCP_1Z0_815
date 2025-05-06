package Enthuware.Standart.test6;

public class test41 {
}
/**What is the result of executing the following fragment of code:
 * boolean b1 = false;
 * boolean b2  = false;
 * if (b2 = b1 == false){
 * System.out.println("true");
 * } else{
 * System.out.println("false");
 * }
 * */

//
//It will print true

/**All that if() needs is a boolean, now b1 == false returns true, which is a boolean and since b2 = true is an expression
 *  and every expression has a return value (which is the Left Hand Side of the expression),
 * it returns true, which is again a boolean.
 * FYI: the return value of expression i = 10; is 10 (an int).*/