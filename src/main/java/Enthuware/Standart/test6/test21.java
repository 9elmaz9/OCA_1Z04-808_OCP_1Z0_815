package Enthuware.Standart.test6;

public class test21 {
}
/**What will be the output of the following program when it is compiled and run with the command line:
 *  java TestClass 1 2 3
 *  public class TestClass {
 *  public static void main(String[] args) {
 *  System.out.println("Values : "+args[0]+args[1]);
 *  } }
 *  */

//Values : 12

/**In Java, command line arguments are passed into the program using the String[] parameter to the main method.
 * The String array contains actual parameters and does not include java and the name of the class.
 * Therefore, in this case, args will point to an array of Strings with 3 elements - "1", "2", and "3".
 * The program prints out only args[0] and args[1], which are 1 and 2.*/