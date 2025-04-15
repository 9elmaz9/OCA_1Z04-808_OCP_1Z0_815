package Enthuware.Standart.test5;

public class test20 {
}

/**
 Consider the following classes:
 class A implements Runnable{ ...}
 class B extends A implements Observer { ...}
 (Assume that Observer has no relation to Runnable.)

 and the declarations :

 A a = new A() ;
 B b = new B();

 Which of the following Java code fragments will compile and execute without throwing exceptions?
 *
 * /


// Object o = a; Runnable r = (Runnable) o;
// Here you are explicitly telling the compiler that o refers to an object that is Runnable.



// Object o = b; Runnable r = (Runnable) b;
 /*Since b is declared of a type that indirectly implements Runnable, the compiler can figure out that b will always point to an object that is assignable to a Runnable.
 Therefore, explicit cast is not required here. It will still work fine with the explicit cast though.*/

/**Although you know that o will refer to an object that is a Runnable at runtime, the compiler doesn't know about it.
 * That is why, you have to do: Runnable r = (Runnable) o; You can assign a subclass object reference to superclass
 * reference without a cast but to assign a super class object reference to a subclass (or interface) reference you
 * need an explicit cast as in option 2.*/