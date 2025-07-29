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
