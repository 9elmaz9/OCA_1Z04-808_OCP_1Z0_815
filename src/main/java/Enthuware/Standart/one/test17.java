package Enthuware.Standart.one;

public class test17 {
}
/**
 Which of these statements are true?* */

//TRUE
//1.The main method of a program can declare that it throws checked exceptions. (Any method can do that !)
//2.A method declaring that it throws a certain exception class may throw instances of any subclass of that exception class. (Note that it cannot throw the instances of any superclasses of the exception.)

//FALSE

//3,If a RuntimeException is not caught, the method will terminate and normal execution of the thread will resume.(Any remaining code of the method will not be executed. Further, any uncaught exception will cause the JVM to kill the thread.)
//4,An overriding method must declare that it throws the same exception classes as the method it overrides.(It can throw any subset of the exceptions thrown by overridden class.)
// 5,finally blocks are executed if and only if an exception gets thrown while inside the corresponding try block.(Finally is ALWAYS executed. (Only exception is System.exit() ))

/*Normal execution will not resume if an exception is uncaught by a method. The exception will propagate up the method invocation stack until some method handles it. If no one handles it then the exception will be handled by the JVM and the JVM will terminate that thread.

An overriding method only needs to declare that it can throw a subset of the exceptions the overridden method can throw. Having no throws clause in the overriding method is OK.**/