package Enthuware.Standart.test3;

public class test8 {
}
/**What will the following code snippet print?
 *  List s1 = new ArrayList( );
 *  try{
 *  while(true){
 *  s1.add("sdfa");
 *  }
 *  }catch(RuntimeException e){
 *  e.printStackTrace();
 *  }
 *  System.out.println(s1.size());
 *  */

//It will throw an error at runtime that will not be caught by the catch block.


//It will throw a java.lang.OutOfMemoryError. Note that this is not a subclass of RuntimeException or even Exception. It is a subclass of java.lang.Error.

