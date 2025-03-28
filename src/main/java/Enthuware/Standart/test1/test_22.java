package Enthuware.Standart.test1;

public class test_22 {
}

//Which of the following standard java exception classes extend java.lang.RuntimeException?


//java.lang.SecurityException
/*SecurityException extends RuntimeException: It is thrown by the security manager upon security violation. For example, when a java program runs in a sandbox (such as an applet)
and it tries to use prohibited APIs such as File I/O, the security manager throws this exception.
 Since this exception is explicitly thrown using the new keyword by a security manager class, it can be considered to be thrown by the application programmer.*/

//java.lang.ClassCastException
/*ClassCastException extends RuntimeException: Usually thrown by the JVM. Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
 For example, the following code generates a ClassCastException: Object x = new Integer(0); System.out.println((String)x);*/


//java.lang.NullPointerException
/*
java.lang.NullPointerException
NullPointerException extends RuntimeException: Usually thrown by the JVM. Thrown when an application attempts to use null in a case where an object is required.
These include:
 Calling the instance method of a null object.
 Accessing or modifying the field of a null object.
 Taking the length of null as if it were an array.
Accessing or modifying the slots of null as if it were an array.
 Throwing null as if it were a Throwable value.
Applications should throw instances of this class to indicate other illegal uses of the null object.*/


//java.lang.IndexOutOfBoundsException
/*IndexOutOfBoundsException extends RuntimeException:
Usually thrown by the JVM. Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
Applications can subclass this class to indicate similar exceptions.
 ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both extend IndexOutOfBoundsException.*/


/**The other two exceptions you should know about are: IllegalArgumentException extends RuntimeException: If a parameter passed to a method is not valid. Usually thrown by the application.
 * IllegalStateException extends RuntimeException: Signals that a method has been invoked at an illegal or inappropriate time.
 *  In other words, the Java environment or Java application is not in an appropriate state for the requested operation. Usually thrown by the application.*/