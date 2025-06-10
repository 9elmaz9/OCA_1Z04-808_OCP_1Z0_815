package Enthuware.Standart.test7;

public class test36 {
}
/**Consider the following two java files:
 * //in file SM.java
 * package x.y;
 * public class SM{
 * public static void foo(){ };
 *  }
 *
 * //in file TestClass.java
 * //insert import statement here //1
 * public class TestClass{
 * public static void main(String[] args){
 * foo();
 *   }
 *  }
 *
 * What should be inserted at //1 so that TestClass will compile and run?*/


//import static x.y.SM.foo;
//This is valid because this statement is importing the static member foo of class x.y.SM.


//import static x.y.SM.*;
//This is valid because this statement is importing all the static members of class x.y.SM.
