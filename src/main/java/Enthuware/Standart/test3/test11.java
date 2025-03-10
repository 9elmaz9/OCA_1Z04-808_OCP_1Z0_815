package Enthuware.Standart.test3;

public class test11 {
}

/**What will the following code print when compiled and run?
 * public class TestClass {
 *  public static void main(String[] args) {
 *  String s = "blooper";
 *  StringBuilder sb = new StringBuilder(s);
 *  s.append("whopper");
 *  sb.append("shopper");
 *  System.out.println(s);
 *  System.out.println(sb);
 *  } }*/

//It will not compile.

//append() method does not exist in String class. It exits only in StringBuffer and StringBuilder. The value of sb will be bloopershopper though.
