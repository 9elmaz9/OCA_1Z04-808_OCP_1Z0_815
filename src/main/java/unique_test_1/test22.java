package unique_test_1;

public class test22 {
}
/**Given:

 interface I { }

 class A implements I{
 public String toString(){ return "in a"; }
 }

 class B extends A{
 public String toString(){ return "in b"; }
 }


 public class TestClass {

 public static void main(String[] args) {
 B b = new B();
 A a = b;
 I i = a;

 System.out.println(i);
 System.out.println((B)a);
 System.out.println(b);

 }
 }
 What will be printed when the above code is compiled and run?*/

/**
 in b in b in b
 There is only one object created in this code and the class of that object is B. Therefore, B's toString will be called no matter what reference you use. Therefore, it is print "in b" for all the cases.
 */
