package Enthuware.Standart.test5;

public class test {
}
/**Which statements, when inserted in the code below, will cause an exception at run time?

 class B {}
 class B1 extends B {}
 class B2 extends B {}
 public class ExtendsTest{
 public static void main(String args[]){
 B b = new B();
 B1 b1 = new B1();
 B2 b2 = new B2();
 // insert statement here
 }
 }*/


//b1 = (B1) b;
/**
 b1 = (B1) b;
 It will pass at compile time but fail at run time as the actual object referenced by b is not a B1.
 By casting b to (B1), you are telling the compiler that the object referred to by b will be of class B1 at runtime.
 The compiler accepts that because it is possible for b to refer to an object of class B1 since B1 is-a B. However,
 at run time, b is pointing to an object of class B. B is not B1, so the JVM will throw a ClassCastException.*/

/**Он пройдет во время компиляции, но не во время выполнения, так как фактический объект, на который ссылается b, не является B1.
 * Приводя b к (B1), вы сообщаете компилятору, что объект, на который ссылается b, будет иметь класс B1 во время выполнения.
 * Компилятор принимает это, поскольку b может ссылаться на объект класса B1, поскольку B1 является B.
 * Однако во время выполнения b указывает на объект класса B. B не является B1, поэтому JVM выдаст исключение ClassCastException.*/
