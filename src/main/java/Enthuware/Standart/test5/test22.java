package Enthuware.Standart.test5;

public class test22 {
}
/**
 Given that SomeException is a checked exception, consider the following code:

 //in file A.java
 public class A{
 protected void m() throws SomeException{}
 }

 //in file B.java
 public class B extends A{
 public void m(){ }
 }

 //in file TestClass.java
 public class TestClass{
 public static void main(String[] args){
 //insert code here. //1
 }
 }

 Which of the following options can be inserted at //1 without resulting in any compilation or runtime errors?
 */

/*A a = new B();
( ( B) a ).m();*/

/**Due to explicit casting of 'a' to B, the compiler knows that 'a' will point to an object of class B (or its subclass),
 * whose method m() does not throw an exception. So there is no need for a try catch block here.*/

