package Enthuware.Standart.test1;

public class test_51 {
}
/**What, if anything, is wrong with the following code?
 *  interface T1{
 *
 *   }
 *  interface T2{
 *
 *  int VALUE = 10;
 *  void m1(); }
 *  interface T3 extends T1, T2{
 *  public void m1();
 *  public void m1(int x); }
 *  */

//There is nothing wrong with the code.

/*Having ambiguous fields or methods does not cause any problem by itself (except in the case of default methods)
 but referring to such fields or methods in an ambiguous way will cause a compile time error.
 Having m1() in T3 is also fine because even though m1() is declared in T2 as well as T3 ,
  the definition to both resolves unambiguously to only one m1().
  Explicit cast is not required for calling the method m1() : ( ( T2) t).m1();  m1(int x) is valid because it is a totally independent method declared by T3.*/