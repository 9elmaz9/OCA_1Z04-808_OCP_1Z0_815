package unique_test_1;

public class test55 {
}
/**What will happen when the following program is compiled and run?
 *  public class SM{    public String checkIt(String s){
 *  if(s.length() == 0 || s == null){
 *  return "EMPTY";       }
 *  else return "NOT EMPTY";     }
 *  public static void main(String[] args){
 *  SM a = new SM();
 *  System.out.println(a.checkIt(null));
 *  } }*/


//It will throw NullPointerException.

/**Because the first part of the expression (s.length() == 0) is trying to call a method on s, which is null. The check s == null should be done before calling a method on the reference.
 */

