package Enthuware.Standart.test1;

public class test_36 {
}
/**What will the following code print when run?
 *  public class TestClass{
 *  public static long main(String[] args){
 *  System.out.println("Hello");
 *  return 10L;
 *  } }
 *  */

//It will throw an Error at runtime.

/*When the program is run, the JVM looks for a method named main() which takes an array of Strings as input and returns nothing
 (i.e. the return type is void). But in this case, it doesn't find such a method ( the given main() method is returning long!)
  so it gives out the following message:  Error:
 Main method must return a value of type void in class TestClass, please define the main method as: public static void main(String[] args)*/