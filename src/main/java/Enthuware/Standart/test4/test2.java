package Enthuware.Standart.test4;

public class test2 {
}
/**What will be the result of attempting to compile and run class B?
 *  class A{
 *  final int fi = 10;
 *  }
 *  public class B extends A{
 *  int fi = 15;
 *  public static void main(String[] args){
 *  B b = new B();
 *  b.fi = 20;
 *  System.out.println(b.fi);
 *  System.out.println((  (A) b  ).fi  );    } }*/


//It will print 20 and then 10

//Note that a final variable can be hidden. Here, although fi in A is final, it is hidden by fi of B. So b.fi = 20; is valid since B's fi is not final.