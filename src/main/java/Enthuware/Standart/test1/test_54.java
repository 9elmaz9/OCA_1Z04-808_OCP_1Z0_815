package Enthuware.Standart.test1;

public class test_54 {
}
/**Which is the earliest line in the following code after which the object created on line // 1 can be garbage collected, assuming no compiler optimizations are done?

 public class NewClass{
 private Object o;
 void doSomething(Object s){  o = s;   }

 public static void main(String args[]){
 Object obj = new Object(); // 1
 NewClass tc = new NewClass(); //2
 tc.doSomething(obj); //3
 obj = new Object();    //4
 obj = null;    //5
 tc.doSomething(obj); //6
 }
 }*/

//Line 6
//Before this line the object is being pointed to by at least one variable.

/**The official exam objectives now explicitly mention Garbage collection.All you need to know is:  1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
 *  2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();*/