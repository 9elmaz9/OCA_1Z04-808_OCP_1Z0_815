package unique_test_1;

public class test43 {
}

/**What will the following program print when run using the command line:
 * java TestClass   public class TestClass {
 * public static void methodX() throws Exception {
 * throw new AssertionError();
 * }
 * public static void main(String[] args) {
 *  try{
 *  methodX();
 *  }
 *  catch(Exception e) {
 *  System.out.println("EXCEPTION");
 *  }    } }*/


//It will throw AssertionError out of the main method.

//A subclass of Error cannot be caught using a catch block for Exception because java.lang.Error
// does not extend java.lang.Exception.

