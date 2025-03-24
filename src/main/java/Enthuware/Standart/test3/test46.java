package Enthuware.Standart.test3;

public class test46 {
}
/**Consider the following classes :
 * class A{
 *  public static void sM1() {
 *  System.out.println("In base static"); } }
 *  class B extends A{
 *  Line 1 --> // public static void sM1() {  System.out.println("In sub static"); }
 *  Line 2 --> // public  void sM1() {  System.out.println("In sub non-static"); }
 *  }
 *  Which of the following statements are true?*/


//class B will not compile if line 2 is uncommented
//static method cannot be overridden by a non-static method and vice versa


//class B will not compile if line 1 and 2 are both uncommented.

/**Another concept (although not related to this question but about static methods) is that static methods are never overridden. They are hidden just like static or non-static fields. For example,
 class A{
 int i = 10;
 public static void m1(){  }
 public void m2() { }
 }
 class B extends A{
 int i = 20;
 public static void m1() {  }
 public void m2() { }
 }
 Here, UNLIKE m2, m1() of B does not override m1() of A, it just hides m1() of A, as proven by the following code:
 A a  = new B();
 System.out.println(a.i)  //will print 10 instead of 20
 a.m1();  //will call A's m1
 a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()*/