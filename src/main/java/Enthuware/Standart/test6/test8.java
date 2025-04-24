package Enthuware.Standart.test6;

public class test8 {
}
/**What will be printed when the following code is compiled and run?

 class A {
 public int getCode(){ return 2;}
 }

 class AA extends A {
 public long getCode(){ return 3;}
 }

 public class TestClass {

 public static void main(String[] args) throws Exception {
 A a = new A();
 A aa = new AA();
 System.out.println(a.getCode()+" "+aa.getCode());
 }

 public int getCode() {
 return 1;
 }
 }*/


//The code will not compile.

/*Class AA is trying to override getCode() method of class A but its return type is incompatible with the A's getCode.
 When the return type of the overridden method (i.e. the method in the base/super class) is a primitive, the return type of the overriding method
 (i.e. the method in the sub class) must match the return type of the overridden method.

 In case of Objects, the base class method can have a covariant return type,
  which means, it can return either return the same class or a sub class object. For example, if base class method is:
   public A getA(){ ... }
    a subclass can override it with:
    public AA getA(){ ... } because AA is a subclass of A.*/
