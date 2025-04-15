package Enthuware.Standart.test5;

public class test23 {
}
/**
 Consider the following code:

 class MyClass { }
 public class TestClass{
 MyClass getMyClassObject(){
 MyClass mc = new MyClass(); //1
 return mc; //2
 }
 public static void main(String[] args){
 TestClass tc = new TestClass(); //3
 MyClass x = tc.getMyClassObject(); //4
 System.out.println("got myclass object"); //5
 x = new MyClass(); //6
 System.out.println("done"); //7
 }
 }

 After what line the MyClass object created at line 1 will be eligible for garbage collection?*/

//6
//At line 6, x starts pointing to a new MyClassObject and no reference to the original MyClass object is left.

/**The official exam objectives now explicitly mention Garbage collection. All you need to know is:

 1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
 2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();*/


