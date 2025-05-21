package Enthuware.Standart.test7;

public class test19 {
}
/**What will the following code print when compiled and run?
 *  public class ATest {
 *  String global = "111";
 *  public int parse(String arg){
 *  int value = 0;
 *  try{
 *  String global = arg;
 *  value = Integer.parseInt(global);
 *  }
 *  catch(Exception e){
 *  System.out.println(e.getClass());
 *  }
 *  System.out.print(global+" "+value+" ");
 *  return value;
 *  }
 *  public static void main(String[] args) {
 *  ATest ct = new ATest();
 *  System.out.print(ct.parse("333"));
 *  } }*/

// 111 333 333

/**Observe that a local variable named global is defined in the try block by the statement String global = arg;.
 *  This variable is accessible only within that try block and it shadows the instance field of the same name
 *  within that try block. Since arg is 333, this local global variable is set to 333.
 *  It is this variable that is passed to the call to parseInt.
 *  Therefore, value is set to 333. However, when you print global in the parse method,
 *  the global defined in the try block is out of scope and the instance field named global is used.
 *  Therefore, it prints 111.  There is no exception because 333 can be parsed into an int.
 *  If you pass a string that cannot be parsed into an int to the parseInt method,
 *  it will throw a java.lang.NumberFormatException.*/