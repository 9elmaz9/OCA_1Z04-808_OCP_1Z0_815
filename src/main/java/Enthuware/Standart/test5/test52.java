package Enthuware.Standart.test5;

public class test52 {
}
/**Consider the following classes :

 interface I{
 }
 class A implements I{
 }

 class B extends A {
 }

 class C extends B{
 }
 And the following declarations:
 A a = new A();
 B b = new B();
 Identify options that will compile and run without error.*/



//a = (B)(I)b;
/**class B does implement I because it extends A, which implements I.
 *  A reference of type I can be cast to any class at compile time (except if the class is final and does not implement I).
 *  Since B is-a A, it can be assigned to a.*/

/*Класс B реализует I, поскольку он расширяет A, который реализует I.
Ссылка типа I может быть приведена к любому классу во время компиляции
 (за исключением случаев, когда класс является final и не реализует I). Поскольку B является A, его можно присвоить a.*/

