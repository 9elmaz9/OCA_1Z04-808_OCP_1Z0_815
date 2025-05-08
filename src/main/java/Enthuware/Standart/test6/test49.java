package Enthuware.Standart.test6;

public class test49 {
}
/**Consider the following classes:

 class A {
 public int getCode(){ return 2;}
 }

 class AA extends A {
 public void doStuff() {
 }
 }
 Given the following two declarations, which of the options will compile?
 A a = null;
 AA aa = null;*/


//a = (AA)aa;


//a = new AA();


//aa = (AA) a;
/**a is declared as a reference of class A and therefore, at run time, it is possible for a to point to an
 * object of class AA (because A is a super class of AA). Hence, the compiler will not complain.
 * Although if a does not point to an object of class AA at run time, a ClassCastException will be thrown.*/


//((AA)a).doStuff();
/**Once you cast a to AA, you can call methods defined in AA. Of course, if a does not point to an object
 *  of class AA at runtime, a ClassCastException will be thrown. In this particular case,
 *  a NullPointerException will be thrown because a points to null and a null can be cast to any class.*/

