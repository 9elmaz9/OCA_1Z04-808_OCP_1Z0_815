package Enthuware.Standart.test3;

public class tets24 {
}

/*Consider the following code...
  class MyException extends Exception {}
 public class TestClass{
  public void myMethod()
  throws XXXX{
  throw new MyException();
  } }
  What can replace XXXX?*/


//MyException

//Exception
//Because Exception is a superclass of MyException.


//Throwable
//Because Throwable is a super class of Exception.


/**You can use Throwable as well as Exception as both of them are super classes of MyException.
 * RuntimeException (and its subclasses such as NullPointerException and ArrayIndexOutOfBoundsException)
 * is not a checked exception. So it cannot cover for MyException which is a checked exception.
 * You cannot use Error as well because it is not in the hierarchy of MyException, which is Object <- Throwable <- Exception <- MyException.*/
