package Enthuware.Standart.test7;

public class test48 {
}
/**What will the following code print?
 *  public class TestClass{
 *  static char ch;   static float f;
 *  static boolean bool;
 *  public static void main(String[] args){
 *  System.out.print(f);
 *  System.out.print(" ");
 *  System.out.print(ch);
 *  System.out.print(" ");
 *  System.out.print(bool);
 *  } }*/


//0.0 false

/*This question tests you on two aspects - 1. the default values that are given to variables of various primitive types.
 You should remember that all numeric types, including char, get the value of 0 (or 0.0 for float and double) and boolean
  gets the value of false.  2. how the value is printed by System.out.print method - java.lang.System class has a public
  static variable named out, which is of class java.io.PrintStream.  The PrintStream class has multiple print/println
   methods for printing out primitive values as well as objects.  For byte, short, and int, these print/println methods
   simply print the integer value as it is.  For char, the print/println methods translate the character into one or more
   bytes according to the platform's default character encoding. That is why while printing a char value of 0, a blank space
    is printed instead of 0 (even though the char's integral value is 0).  For long, float, and double values, these print/println
     methods use the respective primitive wrapper class's toString method to get the String representation of that primitive.
     For example, to print the value of a float variable f, it internally calls Float.toString(f).
Now, this method doesn't append an "f" at the end of a float value. That is why a float value of 0.0 is printed as 0.0 and not 0.0f.*/