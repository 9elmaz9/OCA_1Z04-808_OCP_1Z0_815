package Enthuware.Standart.test7;

public class test39 {
}
/**Consider the following code snippet:
 void m1() throws Exception{
 try{
 // line1
 }
 catch (IOException e){
 throw new SQLException();
 }
 catch(SQLException e){
 throw new InstantiationException();
 }
 finally{
 throw new CloneNotSupportedException(); // this is not a RuntimeException.
 }
 }
 Which of the following statements are true?*/


//If IOException gets thrown at line1, then the whole method will end up throwing CloneNotSupportedException.


//If no exception is thrown at line1, then the whole method will end up throwing CloneNotSupportedException.

/**The fundamental concepts at play here are:

 1. The Exception that is thrown the last, is the Exception that is thrown by the method to the caller.
 So, when no exception or any exception is thrown at line 1, the control goes to finally or some catch block. Now, even if the catch blocks throws some exception, the control goes to finally. The finally block throws CloneNotSupportedException, so the method ends up throwing CloneNotSupportedException. Other exceptions thrown by the code prior to this point are lost.

 2. Exception thrown by a catch cannot be caught by the following catch blocks at the same level. So, if IOException is thrown at line 1,
 the control goes to first catch which throws SQLException. Now, although there is a catch for SQLException, it won't catch the exception because
 it is at the same level. So, the control goes to the finally and same process as explained above continues. Any exceptions thrown before this
 exception are lost.*/
