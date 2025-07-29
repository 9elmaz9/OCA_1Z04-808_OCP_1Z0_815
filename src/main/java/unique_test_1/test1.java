package unique_test_1;

public class test1 {
}
/**Consider the following code:
 * public class TestClass {
 * public static void doStuff() throws Exception{
 * System.out.println("Doing stuff...");
 * if(Math.random()>0.4){
 * throw new Exception("Too high!");
 * }
 * System.out.println("Done stuff.");
 * }
 * public static void main(String[] args) throws Exception {
 * doStuff();
 * System.out.println("Over");
 *  }
 * }
 *
 * Which of the following are possible outputs when the above program is compiled and run?
 * (Assume that Math.random() returns a double between 0.0 and 1.0 not including 1.0.
 * Further assume that there is no mistake in the line numbers printed in the output shown in the options.)*/


/**Doing stuff...
 Exception in thread "main" java.lang.Exception: Too high!
 at TestClass.doStuff(TestClass.java:29)
 at TestClass.main(TestClass.java:41)*/

/**There are only two possibilities:
 *  1. If Math.random() generates a number more than 0.4, the if part will throw an exception.
 *  In this case, the remain code of doStuff will not be called and main() will receive an exception due
 *  to the call to doStuff. Since doStuff() is not within a try/catch block, the exception will propagate
 *  up and the remaining code in main() will not be executed either.  Since the exception is not caught
 *  anywhere in the code, it will finally reach the JVM's thread that has called the main method.
 *  This thread catches the exception and prints out the stack trace.
 *
 *  2. If Math.random() generates a number not more than 0.4, if part will not be executed
 *  and "Done stuff." will be printed. After the call returns in main(), "Over" will be printed as well.*/
