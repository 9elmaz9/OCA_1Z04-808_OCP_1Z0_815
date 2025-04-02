package Enthuware.Standart.test4;

public class test36 {
}
/**What will be the result of compiling and running the following program ?

 class NewException extends Exception {}

 class AnotherException extends Exception {}

 public class ExceptionTest{
 public static void main(String[] args) throws Exception{
 try{
 m2();
 }
 finally{
 m3();
 }
 catch (NewException e){}
 }

 public static void m2() throws NewException { throw new NewException(); }

 public static void m3() throws AnotherException{ throw new AnotherException(); }

 }*/

//It will not compile.
//Because a catch block cannot follow a finally block!




/**Syntax of try/catch/finally is:
 * try{ }
 * catch(Exception1 e) {... }
 * catch(Exception2 e) {... } ...
 * catch(ExceptionN e) {... }
 * finally { ...}*/
