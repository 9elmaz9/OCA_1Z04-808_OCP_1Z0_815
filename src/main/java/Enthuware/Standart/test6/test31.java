package Enthuware.Standart.test6;

public class test31 {
}
/**Consider the following code appearing in a file named TestClass.java:  class Test{ }  // 1  public class TestClass {
 *  public int main(String[] args)  { // 2
 *  double x=10, double y;  // 3
 *  System.out.println[]; // 4
 *  for(int k =0; k<x; k++){ } //5
 *  return 0;    } }  Which of the lines are invalid?*/

// 3 and // 4

/** 1 is valid because it is a valid code that declares a class.
// 2 is a valid declaration of a method named main.
// Although, it is not a correct declaration for the standard main method that can be used to execute the class, but it is a valid method nevertheless.
 // 3 is invalid syntax. It can be written as either double x=10; double y;or double x=10, y; Note that even though x is a double and 10 is an int,
 it is valid because 10 will automatically be converted to a double. The reverse would not be valid i.e. int x = 10.0;
 will be invalid. You need a cast for that: int x = (int) 10.0;
 //4 is invalid because println is not a class name. So you cannot create an array of it. println is a method.
// So it should be written as System.out.println();
 //5 is a valid declaration of a for loop.*/

