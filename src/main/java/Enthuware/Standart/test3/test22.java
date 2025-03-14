package Enthuware.Standart.test3;

public class test22 {
}
/**What will the following program print?
 *  public class TestClass{
 *  public static void main(String[] args){
 *  Object obj1 = new Object();
 *  Object obj2 = obj1;
 *  if( obj1.equals(obj2) ) System.out.println("true");
 *  else  System.out.println("false");   } }*/

//true

/**Object class's equals() method just checks whether the two references are pointing to the same location or not.
 *  In this case they really are pointing to the same location because of obj2 = obj1; so it returns true.*/
