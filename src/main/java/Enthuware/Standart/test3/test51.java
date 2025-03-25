package Enthuware.Standart.test3;

public class test51 {
}
/**What will be the result of attempting to compile and run the following program?
 *  public class TestClass{
 *  public static void main(String args[]){
 *  Exception e = null;
 *  throw e;
 *  } }*/

//The code will fail to compile.

/**The main method is throwing a checked exception but there is no try/catch block to handle it
 * and neither is there a throws clause that declares the checked exception.
 * So, it will not compile. If you either put a try catch block or declare a
 * throws clause for the method then it will throw a NullPointerException at
 * run time because e is null. A method that throws a "checked" exception i.e. an
 * exception that is not a subclass of Error or RuntimeException, either must declare
 * it in throws clause or put the code that throws the exception within a try/catch block.*/

