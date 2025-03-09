package Enthuware.Standart.test3;

public class test1 {
}
/**
 What would be the result of attempting to compile and run the following code?
 // Filename: TestClass.java
 public class TestClass{
 public static void main(String args[]){
 B c = new C();
 System.out.println(c.max(10, 20));
 }
 }
 class A{
 int max(int x, int y)  { if (x>y) return x; else return y; }
 }
 class B extends A{
 int max(int x, int y)  {  return 2 * super.max(x, y) ; }
 }
 class C extends B{
 int max(int x, int y)  {  return super.max( 2*x, 2*y); }
 }*/

//The code will compile without errors and will print 80 when run.

/*Remember the rule that in case of instance methods, it is always the class of the actual object that determines which version of
an overridden method is invoked.  Here, observe that the method max of class A is overridden by class B and then again by class C.
Thus, when main calls c.max(10, 20), class C's max will be invoked with parameters 10 and 20 because, even though the declared type of c is B,
the actual object referenced by c is of class C.  C's max calls the max method defined in B with parameters 2*10 and 2*20 i.e. 20 and 40.
The max method in B, in turn, calls the max method in A with the parameters 20 and 40. The max method in A will return 40 to the max() method in B.
The max() method in B will return 80 to the max() method in C. And finally the max of C will return 80 in main, which will be printed out.*/