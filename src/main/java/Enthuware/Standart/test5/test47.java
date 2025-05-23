package Enthuware.Standart.test5;

public class test47 {
}
/**What will the following program print?
 *  public class TestClass{
 *  public static void main(String[] args){
 *  String str = "111";
 *  boolean[] bA = new boolean[1];
 *  if( bA[0] ) str = "222";
 *  System.out.println(str);
 *  } }*/

//111

/**All the arrays are initialized to contain the default values of their type.
 * This means, int[] iA = new int[10]; will contain 10 integers with a value of 0.
 * Object[] oA = new Object[10]; will contain 10 object references pointing to null.
 * boolean[] bA = new boolean[10] will contain 10 booleans of value false.
 * So, as bA[0] is false, the if condition fails and str remains 111.*/