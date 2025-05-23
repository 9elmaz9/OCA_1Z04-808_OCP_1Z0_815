package Enthuware.Standart.test7;

public class test23 {
}
/**What will be the result of attempting to compile and run the following program?

 public class TestClass{
 public static void main(String args[]){
 try{
 RuntimeException re = null;
 throw re;
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
 }*/
//

//The program will compile without error and will print java.lang.NullPointerException when run.

//A NullPointerException will be thrown if the expression given to the throw statement results in a null pointer.

//The try block generates NullPointerException which will be caught by the catch block.