package Enthuware.Standart.test5;

public class test38 {
}

/**Consider the classes shown below:

 class A{
 public A() { }
 public A(int i) {   System.out.println(i );    }
 }
 class B{
 static A s1 = new A(1);
 A a = new A(2);
 public static void main(String[] args){
 B b = new B();
 A a = new A(3);
 }
 static A s2 = new A(4);
 }
 Which is the correct sequence of the digits that will be printed when B is run?*/


//1 ,4, 2 ,3

/**1. All static constants, variables, and blocks. Among themselves the order is the order in which they appear in the code. This step is actually a part of "class initialization" rather than "instance initialization". Class initialization happens only if the class is being used for the first time while being instantiated. For example, if you have invoked a static method of a class or accessed a static field of that class earlier in the code, you have already used the class and the JVM would have performed initialization of this class at that time. Thus, there wouldn't be any need to initialize the class if you instantiate an object of this class now.

 Further, if the class has a superclass, then the JVM performs this step for the superclass first (if the superclass hasn't been initialized already) and only after the superclass is initialized and static blocks are executed, does the JVM proceed with this class. This process is followed recursively up to the java.lang.Object class.

 2. All non static constants, variables, and blocks. Among themselves the order is the order in which they appear in the code.

 3. Constructor.

 Just like the class initialization, instance initialization also happens for the superclass first. That is, if the class has a superclass, then the JVM takes steps 2 and 3 given above for the superclass first and only after the superclass's instance members are initialized, does the JVM proceed with this class. This process is also followed recursively up to the java.lang.Object*/