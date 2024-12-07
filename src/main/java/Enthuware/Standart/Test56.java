package Enthuware.Standart;

public class Test56 {
}
/*
*
Consider the following code:
class A{
   A() {  print();   }
   void print() { System.out.print("A "); }
}
class B extends A{
   int i =   4;
   public static void main(String[] args){
      A a = new B();
      a.print();
   }
   void print() { System.out.print(i+" "); }
}
What will be the output when class B is run ?*/


/**
 * 1,Code Explanation:
A a = new B();

This creates an object of class B, but it is referred to as an instance of type A (polymorphism).

2,Constructor Execution:

When the new B() statement is executed:
The constructor of class A is invoked first (because B extends A).
Inside A's constructor, the method print() is called.
Important: Since print() is overridden in B, the print() method in B is executed. However:
At this point, B's instance variables are not yet initialized.
So, i is still at its default value of 0.

Output so far:
0
a.print();

After the object is constructed, a.print() is called.
Since a refers to an object of type B, the overridden print() method in B is executed.
At this point, i has been initialized to 4.
Output now:
0 4


Final Output:
0 4

Key Points to Remember:
During the execution of a superclass constructor, subclass fields are not yet initialized.
Polymorphism ensures that the overridden method in the subclass is called, even during the execution of the superclass constructor.
* */