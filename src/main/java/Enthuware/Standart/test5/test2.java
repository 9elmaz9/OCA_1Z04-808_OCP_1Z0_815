package Enthuware.Standart.test5;

public class test2 {
}
/*What is wrong with the following code?
class MyException extends Exception {}
public class TestClass{
   public static void main(String[] args){
      TestClass tc = new TestClass();
      try{
         tc.m1();
      }
      catch (MyException e){
         tc.m1();
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}*/

//    It will not compile because of unhandled exception.

/*The catch block is throwing a checked exception (i.e. non-RuntimeException) which must be handled by either a try catch block or declared in the throws clause of the enclosing method.
Note that finally is also throwing an exception here, but it is a RuntimeException so there is no need to handle it or declare it in the throws clause.*/