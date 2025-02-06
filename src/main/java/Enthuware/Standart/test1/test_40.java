package Enthuware.Standart.test1;

public class test_40 {
}
/**What will the following code print when run?

 class A {
 }

 class AA extends A {
 }


 public class TestClass {
 public static void main(String[] args) throws Exception {
 A a = new A();
 AA aa = new AA();
 a = aa;
 System.out.println("a = "+a.getClass());
 System.out.println("aa = "+aa.getClass());
 }
 }*/

/*
a = class AA
 aa = class AA*/

/**getClass is a public instance method in Object class. That means it is polymorphic. In other words, this method is bound at run time and so it returns the name of the class of the actual object to which the reference points.
 Here, at run time, both - a and aa, point to an object of class AA. So both will print AA.*/