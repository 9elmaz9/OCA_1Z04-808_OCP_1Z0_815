package Enthuware.Standart.test5;

public class test5 {
}
/**What will be the result of attempting to compile and run the following program?
 * public class TestClass{   public static void main(String args[ ] ){
 *  Object a, b, c ;
 *  a = new String("A");
 *  b = new String("B");
 *  c = a;
 *  a = b;
 *  System.out.println(""+c);
 *  } }*/


//The program will print A

/**The variables a, b and c contain references to actual objects. Assigning to a reference only changes the
 *  reference value, and not the object pointed to by the reference. So, when c = a is executed c starts pointing
 *  to the string object containing A. and when a = b is executed, a starts pointing to the string object
 *  containing B but the object containing A still remains same and c still points to it. So the program prints A and not B.
 *  The Object class's toString generates a string using:getClass().getName() + '@' + Integer.toHexString(hashCode()) But in this case,
 *  String class overrides the toString() method that returns just the actual string value.*/

