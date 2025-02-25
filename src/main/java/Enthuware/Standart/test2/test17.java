package Enthuware.Standart.test2;

public class test17 {
}
//Which of the following are standard Java exception classes?

//java.io.FileNotFoundException


//java.lang.SecurityException
/**Java has a java.lang.SecurityException. This exception extends RuntimeException and is thrown by the security manager upon security violation.
 *  For example, when a java program runs in a sandbox (such as an applet) and it tries to use prohibited APIs such as File I/O,
 *  the security manager throws this exception. Since this exception is explicitly thrown using the new keyword by a security manager class,
 *  it can be considered to be thrown by the application programmer.*/


/**Question: Identify the standard Java exception classes.
 Let's analyze the given options:

 java.io.FileNotFoundException:

 This is a standard Java exception class.
 It is part of the java.io package and extends IOException.
 Correct option.
 java.io.InputException:

 This is not a standard Java exception class.
 There is no InputException in the java.io package.
 java.lang.CPUError:

 This is not a standard Java error or exception class.
 It does not exist in the java.lang package.
 java.lang.MemoryException:

 This is not a standard Java exception class.
 Java provides OutOfMemoryError but no MemoryException.
 java.lang.SecurityException:

 This is a standard Java exception class.
 It is part of the java.lang package and is thrown when a security violation occurs.
 Correct option.
 Correct Answers:
 java.io.FileNotFoundException
 java.lang.SecurityException*/