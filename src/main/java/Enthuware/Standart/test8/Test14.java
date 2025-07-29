package Enthuware.Standart.test8;

public class Test14 {
}



/**Consider the following code:

 public class TestClass{
 public void method(Object o){
 System.out.println("Object Version");
 }
 public void method(java.io.FileNotFoundException s){
 System.out.println("java.io.FileNotFoundException Version");
 }
 public void method(java.io.IOException s){
 System.out.println("IOException Version");
 }
 public static void main(String args[]){
 TestClass tc = new TestClass();
 tc.method(null);
 }
 }
 What would be the output when the above program is compiled and run? (Assume that FileNotFoundException is a subclass of IOException, which in turn is a subclass of Exception)
 */


//It will print java.io.FileNotFoundException Version


/**In the given code, the method method is overloaded to accept three different types of parameters:

 Object o
 java.io.FileNotFoundException s
 java.io.IOException s
 Method Selection
 When you call the method with the argument null (i.e., tc.method(null)), Java will try to match the method based on the type of the argument. In this case, null can match any reference type, so the method selection will depend on the most specific match.

 Here’s the method hierarchy:

 FileNotFoundException is a subclass of IOException, which is a subclass of Exception, and Exception is a subclass of Object.
 When calling tc.method(null), Java will prefer the most specific match. Since FileNotFoundException is more specific than IOException and Object, it will select the method with the parameter of type java.io.FileNotFoundException.

 Output
 So, the output of the program will be:

 lua
 Copy code
 */






/**
 * 1. while (false) { x = 3; }
 * Analysis: while(false) is a compile-time constant condition that makes the loop body unreachable.
 * Java Rule: Unreachable code in loops causes a compile-time error in Java.
 * Compilation: Does not compile.
 * 2. if (false) { x = 3; }
 * Analysis: In if(false), the block is unreachable, but Java allows unreachable code in if statements.
 * Compilation: Compiles successfully.
 * 3. do { x = 3; } while (false);
 * Analysis: A do-while loop always executes the body once before evaluating the condition, so it is not unreachable.
 * Compilation: Compiles successfully.
 * 4. for (int i = 0; i < 0; i++) x = 3;
 * Analysis: A for loop with a condition i < 0 will never execute, but it is syntactically valid.
 * Compilation: Compiles successfully.
 * Final Answer:
 * The three snippets that compile successfully are:
 *
 * if (false) { x = 3; }
 * do { x = 3; } while (false);
 * for (int i = 0; i < 0; i++) x = 3;
 * Correct Answer:
 * These are the three options you should select!
 */
