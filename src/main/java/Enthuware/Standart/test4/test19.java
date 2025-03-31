package Enthuware.Standart.test4;

public class test19 {
}
/**Assume the following declarations:
 *  class A{ }
 *  class B extends A{ }
 *  class C extends B{ }
 *  class X{
 *  B getB(){ return new B();
 *  } }
 *  class Y extends X{
 *  //method declaration here }
 *  Which of the following methods can be inserted in class Y?*/


//protected B getB(){ return new C(); }
//Since C is-a B, this is valid. Also, an overriding method can be made less restrictive. protected is less restrictive than 'default' access.


//C getB(){ return new C(); }
//Covariant returns are allowed in Java 1.5, which means that an overriding method can change the return type of the overridden method to a subclass
// of the original return type. Here, C is a subclass of B. So this is valid.