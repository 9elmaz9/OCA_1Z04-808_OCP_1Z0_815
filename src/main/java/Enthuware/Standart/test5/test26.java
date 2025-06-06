package Enthuware.Standart.test5;

public class test26 {
}
/**Given the following program, which statements are true?
 *
 * // Filename: TestClass.java public class TestClass{
 * public static void main(String args[]){
 * A[] a, a1;
 * B[] b;
 *  a = new A[10];
 *  a1  = a;
 *  b =  new B[20];
 *  a = b;  // 1
 *  b = (B[]) a;  // 2
 *  b = (B[]) a1; // 3
 *  } }
 *  class A { }
 *  class B extends A { }
 *  */

//The program will throw a java.lang.ClassCastException at the line labelled 3 when run.

//The cast at line 2 is needed.

/**The line //1 will be allowed during compilation, since assignment is done from a subclass reference to a superclass reference.
 The cast in line //2 is needed because a superclass reference is assigned to a subclass reference variable. And this works at runtime because the object referenced to by a is actually of an array of B.
 Now, the cast at line //3 tells the compiler not to worry, that I'm a good programmer and I know what I am doing and the object referenced by the super class reference (a1) will actually be of class B at run time. So there is no compile time error. But at run time, this fails because the actual object is not an array of B but is an array of A.
 */