package Enthuware.Standart.test6;

public class test17 {
}
/**What is wrong with the following code written in a single file named TestClass.java?
 *  class SomeThrowable extends Throwable { }
 *  class MyThrowable extends SomeThrowable { }
 *  public class TestClass{
 *  public static void main(String args[]) throws SomeThrowable{
 *  try{
 *  m1();
 *  }catch(SomeThrowable e){
 *
 *  throw e;
 *
 *  }finally{
 *  System.out.println("Done");
 *  }
 *  }
 *  public static void m1() throws MyThrowable{
 *  throw new MyThrowable();
 *  } } */


//There is nothing wrong with the code and Done will be printed.

//Done will be followed by an exception. Finally is always executed (Only exception is System.exit();)µ