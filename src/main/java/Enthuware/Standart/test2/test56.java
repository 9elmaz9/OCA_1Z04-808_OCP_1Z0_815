package Enthuware.Standart.test2;

public class test56 {
}
/**Consider the following code:

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


//It will print 0 4

/**Note that method print() is overridden in class B.
 * Due to polymorphism, the method to be executed is selected depending on the class of the actual object.
 * Here, when an object of class B is created, first B's default constructor (which is not visible in the code but
 * is automatically provided by the compiler because B does not define any constructor explicitly) is called.
 * The first line of this constructor is a call to super(), which invokes A's constructor. A's constructor in turn calls print().
 * Now, print is a non-private instance method and is therefore polymorphic, which means, the selection of the method to be
 * executed depends on the class of actual object on which it is invoked. Here, since the class of actual object is B, B's print
 * is selected instead of A's print. At this point of time, variable i has not been initialized (because we are still in
 * the middle of initializing A), so its default value i.e. 0 is printed.
 * Finally, 4 is printed.  NOTE: Try this code after declaring i in class B as final and observe the output.*/


/*Code Explanation:
A a = new B();

This creates an object of class B, but it is referred to as an instance of type A (polymorphism).
Constructor Execution:

When the new B() statement is executed:
The constructor of class A is invoked first (because B extends A).
Inside A's constructor, the method print() is called.
Important: Since print() is overridden in B, the print() method in B is executed. However:
At this point, B's instance variables are not yet initialized.
So, i is still at its default value of 0.
Output so far:

Copy code
0
a.print();

After the object is constructed, a.print() is called.
Since a refers to an object of type B, the overridden print() method in B is executed.
At this point, i has been initialized to 4.
Output now:

Copy code
0 4
Final Output:
Copy code
0 4
Key Points to Remember:
During the execution of a superclass constructor, subclass fields are not yet initialized.
Polymorphism ensures that the overridden method in the subclass is called, even during the execution of the superclass constructor.*/