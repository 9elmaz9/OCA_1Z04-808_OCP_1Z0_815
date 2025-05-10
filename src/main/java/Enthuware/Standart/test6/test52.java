package Enthuware.Standart.test6;

public class test52 {
}
/**What will the following code print when compiled and run?
 *  interface Pow{
 *  static void wow(){
 *  System.out.println("In Pow.wow");
 *  }
 *  }
 *  abstract class Wow{
 *  static void wow(){
 *  System.out.println("In Wow.wow");
 *  }
 *  }
 *  public class Powwow extends Wow implements Pow {
 *  public static void main(String[] args) {
 *  Powwow f = new Powwow();
 *  f.wow();
 *  }
 *  }
 *  */

//
//In Wow.wow

/**Observe that f is reference variable of type Powwow. Since Powwow extends Wow,
 *  Powwow inherits the static method wow() from Wow. Java allows a static method of
 *  a class to be invoked using a reference variable and so f.wow() invoke's Wow's wow().
 *  Static methods of a interface are not inherited in the same way by an implementing class.
 *  Therefore, the static method wow() defined in the interface Pow, cannot be accessed through a reference variable.
 *  It can only be accessed using the name of the interface i.e. using Pow.wow().*/