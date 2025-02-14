package Enthuware.Standart.test2;

public class test4 {
}
/**What is the result of compiling and running this code?
 * class MyException extends Throwable{}
 * class MyException1 extends MyException{}
 * class MyException2 extends MyException{}
 * class MyException3 extends MyException2{}
 * public class ExceptionTest{
 * void myMethod() throws MyException{
 * throw new MyException3();
 * }
 * public static void main(String[] args){
 * ExceptionTest et = new ExceptionTest();
 * try{
 * et.myMethod();
 * }
 * catch(MyException me){
 * System.out.println("MyException thrown");
 * }
 * catch(MyException3 me3){
 *
 *  System.out.println("MyException3 thrown");
 *  }
 *  finally{
 *  System.out.println(" Done");
 *  }    } }*/

//It fails to compile


/**You can have multiple catch blocks to catch different kinds of exceptions, including exceptions that are subclasses of other exceptions. However, the catch clause for more specific exceptions (i.e. a SubClassException) should come before the catch clause for more general exceptions ( i.e. a SuperClassException). Failure to do so results in a compiler error as the more specific exception is unreachable.  In this case, catch for MyException3 cannot follow catch for MyException because if MyException3 is thrown, it will be caught by the catch clause for MyException. And so, there is no way the catch clause for MyException3 can ever execute. And so it becomes an unreachable statement.*/
