package Enthuware.Standart.eight;

public class test46 {
}

/**What will the following program print?
 *
 *  interface Flyer{ }
 *  class AirPlane implements Flyer{ }
 *  public class TestClass {
 *  static void flyIt(Flyer f){
 *  System.out.println("Flyer Flying");   }
 *  static void flyIt(AirPlane a){
 *  System.out.println("AirPlane Flying");   }
 *  public static void main(String[] args){
 *  Flyer f = new AirPlane();
 *  AirPlane a = new AirPlane();
 *  flyIt(f);  //1
 *  flyIt(a);  //2
 *   }
 *  }
 *  */

/**Flyer Flying
 * AirPlane Flying*/

/**When the compiler looks at a method call, it tries to find the method with a signature that matches
 *  the arguments given in the method call. Since the compiler does not know the exact object type that
 *  will be pointed to by a variable at runtime, it matches the signature based on the declared type of
 *  the variable only. Once found, it binds the call to that method. Note that, at this point, the compiler
 *  4is not bothered with overriding as much as overloading.
 *  Now, in the given question, compiler binds the flyIt(f) call to Flyer's flyIt method because
 *  the declared type of f is Flyer, and it binds the flyIt(a) call to AirPlane's flyIt method because
 *  the declared type of a is AirPlane. Therefore, Flyer Flying and AirPlane Flying are printed.*/
