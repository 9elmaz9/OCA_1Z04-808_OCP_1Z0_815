package unique_test_1;

public class test54 {
        }
/**Given the following code:
 *  public class TestClass {
 *  public static void main(String[] args) {
 *  //INSERT CODE HERE
 *  System.out.println(x);
 *  } }
 *  What can be inserted in the above code so that it will compile and run without any problem?*/


//double x = 0xb10_000;

//0x implies the following digits must be interpreted as Hexadecimal digits and b is a valid Hexadecimal digit.


//float x = 0b10_000;

/**A number starting with 0b (or 0B) implies that it is written in binary.
 * Since 10000 can fit into a float, an explicit cast is not required.
 * Note that when you specify the bit pattern using binary or hex,
 * an explicit cast is not required even if the number specified using the bit pattern is larger than what a float can hold.
 */


//long x = 0b10000L;

//The real exam contains a few questions that test you on how to write numbers in binary. You might want to go through Section 3.10.1 and 3.10.2 of Java Language Specification to understand how this works.

