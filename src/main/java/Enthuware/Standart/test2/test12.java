package Enthuware.Standart.test2;

public class test12 {
}
/**What will be the output when the following program is run?
 * package exceptions; public class TestClass {
 * public static void main(String[] args) {
 * try{
 * doTest();
 * }
 * catch(MyException me){
 * System.out.println(me);
 * }
 * }
 * static void doTest() throws MyException{
 * int[] array = new int[10];
 * array[10] = 1000;
 * doAnotherTest();
 * }
 * static void doAnotherTest() throws MyException{
 * throw new MyException("Exception from doAnotherTest");
 * } } class MyException extends Exception {
 *  public MyException(String msg){
 *  super(msg);
 *  }
 *  }
 *  (Assume that there is no error in the line numbers given in the options.)*/

/**Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10 at exceptions.TestClass.doTest(TestClass.java:14) at exceptions.TestClass.main(TestClass.java:5)*/

/*You are creating an array of length 10. Since array numbering starts with 0, the last element would be array[9]. array[10]
 would be outside the range of the array and therefore an ArrayIndexOutOfBoundsException will be thrown, which cannot be caught by catch(MyException ) clause.
The exception is thus thrown out of the main method and is handled by the JVM's uncaught exception handling mechanism, which prints the stack trace.*/

/**Note that there are a few questions in the exam that test your knowledge about how exception messages are printed.
 * When you use System.out.println(exception), a stack trace is not printed.
 * Just the name of the exception class and the message is printed.
 * When you use exception.printStackTrace(), a complete chain of the names of the methods called, along with the line numbers, is printed.
 * It contains the names of the methods in the chain of method calls that led to the place where the exception was created
 * going back up to the point where the thread, in which the exception was created, was started.*/

