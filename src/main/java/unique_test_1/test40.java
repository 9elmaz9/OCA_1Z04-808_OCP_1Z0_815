package unique_test_1;

public class test40 {
}
/**What will be the result of attempting to compile and run the following code?
 *  class TestClass{
 *  public static void main(String args[] ){
 *  String str1 = "str1";
 *  String str2 = "str2";
 *  System.out.println( str1.concat(str2) );
 *  System.out.println(str1);
 *  } } */

/**
 The program will print str1str2 and str1*/

/**Note that String objects are immutable. No matter what operation you do, the original object will remain the same and a new object will be returned. Here, the statement str1.concat(str2) creates a new String object which is printed but its reference is lost after the printing.
 */



