package Enthuware.Standart.test7;

public class test29 {
}
/**What will be the output of the following program:
 *  public class TestClass{
 *  public static void main(String args[]){
 *  try{
 *  m1();
 *  }catch(IndexOutOfBoundsException e){
 *  System.out.println("1");
 *  throw new NullPointerException();
 *  }catch(NullPointerException e){
 *  System.out.println("2");
 *  return;
 *  }catch (Exception e) {
 *  System.out.println("3");
 *  }finally{
 *  System.out.println("4");
 *  }
 *  System.out.println("END");
 * }
 * static void m1(){
 * System.out.println("m1 Starts");
 * throw new IndexOutOfBoundsException( "Big Bang " );
 * } }*/

//
//The program will print m1 Starts, 1 and 4, in that order.

/**The code has a try block and the try block is associated with three catch clauses.
 * All of the catch clauses are at the same level and are meant to catch exceptions thrown only from that try block.
 * They cannot catch any exception thrown from anywhere else in the code (including the catch blocks themselves).
 * The m1() method prints m1 Starts and then throws an IndexOutOfBoundsException.
 * This exception is caught by the catch(IndexOutOfBoundsException e) clause, so the control goes inside this catch block.
 * Inside the catch block, 1 is printed and a NullPointerException is thrown.
 * Since this exception is not thrown inside any try block, it will not be caught.
 * It will remain "unhandled" by this method and will be propagated to the caller of the main() method.
 * But before the exception is sent to the caller, the finally block is executed, which causes 4 to be printed.
 * The code that prints END is never reached because of the uncaught NullPointerException.
 * This exception will finally be handled by the JVM itself, which prints the stack trace associated with the exception and exits.*/