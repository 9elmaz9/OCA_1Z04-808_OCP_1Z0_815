package Enthuware.Standart.test4;

public class test55 {
}

/**Given:
 * public class TestClass{
 *  public static void main(String[] args){
 *  int i = Integer.parseInt(args[1]);
 *  System.out.println(args[i]);
 *  } }
 *  What will happen when you compile and run the above program using the following command line:
 *  java TestClass 1 2*/


//It will throw ArrayIndexOutOfBoundsException.

/**1. Arrays are indexed from 0.
 * 2. In java, the name of the class is not the first element of args.
 * So, when the command line is : java TestClass 1 2, args[0] is 1 and args[1] is 2.
 * When you try to access args[2], It will throw an ArrayIndexOutOfBoundsException because the array length is only 2 so args[2] is out of bounds.*/