Java Interview Questions and Answers
Last Updated : 03 Jan, 2025
Java is one of the most popular programming languages in the world, known for its versatility, portability, and wide range of applications. Java is the most used language in top companies such as Uber, Airbnb, Google, Netflix, Instagram, Spotify, Amazon, and many more because of its features and performance.

In this article, we will provide 200+ Core Java Interview Questions tailored for both freshers and experienced professionals with 3, 5, and 8 years of experience. Here, we cover everything, including core Java concepts, Object-Oriented Programming (OOP), multithreading, exception handling, design patterns, Java Collections, and more, that will surely help you to crack Java interviews.

Table of Content

Java Interview questions for Freshers
Java Intermediate Interview Questions
Java Interview Questions For Experienced
Java Difference Interview Questions
Java Interview questions for Freshers
1. Is Java Platform Independent if then how?
   Yes, Java is a Platform Independent language. Unlike many programming languages javac compiles the program to form a bytecode or .class file. This file is independent of the software or hardware running but needs a JVM(Java Virtual Machine) file preinstalled in the operating system for further execution of the bytecode.

Although JVM is platform dependent, the bytecode can be created on any System and can be executed in any other system despite hardware or software being used which makes Java platform independent.

2. What are the top Java Features?
   Java is one the most famous and most used language in the real world, there are many features in Java that makes it better than any other language some of them are mentioned below:

Features-of-Java-768

Simple: Java is quite simple to understand and the syntax
Platform Independent: Java is platform independent means we can run the same program in any software and hardware and will get the same result.
Interpreted: Java is interpreted as well as a compiler-based language.
Robust: features like Garbage collection, exception handling, etc that make the language robust.
Object-Oriented: Java is an object-oriented language that supports the concepts of class,  objects, four pillars of OOPS, etc.
Secured: As we can directly share an application with the user without sharing the actual program makes Java a secure language.
High Performance:  faster than other traditional interpreted programming languages.
Dynamic: supports dynamic loading of classes and interfaces.
Distributed: feature of Java makes us able to access files by calling the methods from any machine connected.
Multithreaded: deal with multiple tasks at once by defining multiple threads
Architecture Neutral: it is not dependent on the architecture.
3. What is JVM?
   JVM-768

JVM stands for Java Virtual Machine it is a Java interpreter. It is responsible for loading, verifying, and executing the bytecode created in Java.

Although it is platform dependent which means the software of JVM is different for different Operating Systems it plays a vital role in making Java platform Independent.

To know more about the topic refer to JVM in Java.

4. What is JIT?
   JIT stands for (Just-in-Time) compiler is a part of JRE(Java Runtime Environment), it is used for better performance of the Java applications during run-time. The use of JIT is mentioned in step by step process mentioned below:

Source code is compiled with javac to form bytecode
Bytecode is further passed on to JVM
JIT is a part of JVM, JIT is responsible for compiling bytecode into native machine code at run time.
The JIT compiler is enabled throughout, while it gets activated when a method is invoked. For a compiled method, the JVM directly calls the compiled code, instead of interpreting it.
As JVM calls the compiled code that increases the performance and speed of the execution.
To know more about the topic refer to JIT in Java.

5. What are Memory storages available with JVM?
   JVM-Areas-768

JVM consists of a few memory storages as mentioned below:

Class(Method) Area: stores class-level data of every class such as the runtime constant pool, field, and method data, and the code for methods.
Heap: Objects are created or objects are stored. It is used to allocate memory to objects during run time.
Stack: stores data and partial results which will be needed while returning value for method and performing dynamic linking
Program Counter Register: stores the address of the Java virtual machine instruction currently being executed.
Native Method Stack: stores all the native methods used in the application.
To know more about the topic refer to JVM Memory Storages.

6. What is a classloader?
   Classloader is the part of JRE(Java Runtime Environment), during the execution of the bytecode or created .class file classloader is responsible for dynamically loading the java classes and interfaces to JVM(Java Virtual Machine). Because of classloaders Java run time system does not need to know about files and file systems.

To know more about the topic refer to ClassLoader in Java.

7. Difference between JVM, JRE, and JDK.
   JVM: JVM also known as Java Virtual Machine is a part of JRE. JVM is a type of interpreter responsible for converting bytecode into machine-readable code. JVM itself is platform dependent but it interprets the bytecode which is the platform-independent reason why Java is platform-independent.

JRE: JRE stands for Java Runtime Environment, it is an installation package that provides an environment to run the Java program or application on any machine.

JDK: JDK stands for Java Development Kit which provides the environment to develop and execute Java programs. JDK is a package that includes two things Development Tools to provide an environment to develop your Java programs and, JRE to execute Java programs or applications.

To know more about the topic refer to the Differences between JVM, JRE, and JDK.

8. What are the differences between Java and C++?
   Basis                 C++                                  Java  
Platform       C++ is Platform Dependent                     Java is Platform Independent

Application    C++ is mainly used for System Programming     Java is Mainly used for Application Programming

Hardware       C++ is nearer to hardware                     Java is not so interactive with hardware

Global Scope   C++ supports global and namespace scope.      Java doesn’t support global scope.

Not Supporting Functionality supported in Java but not in C++ are:  Functionality supported in C++ but not in Java are: 

                thread support                                                     
                documentation comment
                unsigned right shift(>>>)   

goto
Pointers
Call by reference
Structures and Unions
Multiple Inheritance
Virtual Functions
OOPS   C++ is an object-oriented language. It is not a single root hierarchy .  Java is also an object-oriented language. It is a single root hierarchy as everything gets derived from a single class (java.lang.Object).

Inheritance Tree   C++ always creates a new inheritance tree.   Java uses a Single inheritance tree as classes in Java are the child of object classes in Java.

9. Explain public static void main(String args[]) in Java.
   Main_function

Unlike any other programming language like C, C++, etc. In Java, we declared the main function as a public static void main (String args[]). The meanings of the terms are mentioned below:

public: the public is the access modifier responsible for mentioning who can access the element or the method and what is the limit.  It is responsible for making the main function globally available. It is made public so that JVM can invoke it from outside the class as it is not present in the current class.
static: static is a keyword used so that we can use the element without initiating the class so to avoid the unnecessary allocation of the memory.
void: void is a keyword and is used to specify that a method doesn’t return anything. As the main function doesn’t return anything we use void.
main: main represents that the function declared is the main function. It helps JVM to identify that the declared function is the main function.
String args[]: It stores Java command-line arguments and is an array of type java.lang.String class.
10. What is Java String Pool?
A Java String Pool is a place in heap memory where all the strings defined in the program are stored. A separate place in a stack is there where the variable storing the string is stored. Whenever we create a new string object, JVM checks for the presence of the object in the String pool, If String is available in the pool, the same object reference is shared with the variable, else a new object is created.

11. What will happen if we declare don’t declare the main as static?
    We can declare the main method without using static and without getting any errors. But, the main method will not be treated as the entry point to the application or the program.

12. What are Packages in Java?
    Packages in Java can be defined as the grouping of related types of classes, interfaces, etc providing access to protection and namespace management.

13. Why Packages are used?
    Packages are used in Java in order to prevent naming conflicts, control access, and make searching/locating and usage of classes, interfaces, etc easier.

14. What are the advantages of Packages in Java?
    There are various advantages of defining packages in Java.

Packages avoid name clashes.
The Package provides easier access control.
We can also have the hidden classes that are not visible outside and are used by the package.
It is easier to locate the related classes.
15. How many types of packages are there in Java?
    There are two types of packages in Java

User-defined packages
Build In packages
16. Explain different data types in Java.
    There are 2 types of data types in Java as mentioned below:

Primitive Data Type
Non-Primitive Data Type or Object Data type
Primitive Data Type: Primitive data are single values with no special capabilities. There are 8 primitive data types:

boolean: stores value true or false
byte: stores an 8-bit signed two’s complement integer
char: stores a single 16-bit Unicode character
short: stores a 16-bit signed two’s complement integer
int: stores a 32-bit signed two’s complement integer
long: stores a 64-bit two’s complement integer
float: stores a single-precision 32-bit IEEE 754 floating-point
double: stores a double-precision 64-bit IEEE 754 floating-point
Non-Primitive Data Type: Reference Data types will contain a memory address of the variable’s values because it is not able to directly store the values in the memory. Types of Non-Primitive are mentioned below:

Strings
Array
Class
Object
Interface
17. When a byte datatype is used?
    A byte is an 8-bit signed two-complement integer. The minimum value supported by bytes is -128 and 127 is the maximum value. It is used in conditions where we need to save memory and the limit of numbers needed is between -128 to 127.

18. Can we declare Pointer in Java?
    No, Java doesn’t provide the support of Pointer. As Java needed to be more secure because which feature of the pointer is not provided in Java.

19. What is the default value of byte datatype in Java?
    The default value of the byte datatype in Java is 0.

20. What is the default value of float and double datatype in Java?
    The default value of the float is 0.0f and of double is 0.0d in Java.

21. What is the Wrapper class in Java?
    Wrapper, in general, is referred to a larger entity that encapsulates a smaller entity. Here in Java, the wrapper class is an object class that encapsulates the primitive data types.

The primitive data types are the ones from which further data types could be created. For example, integers can further lead to the construction of long, byte, short, etc. On the other hand, the string cannot, hence it is not primitive.

Getting back to the wrapper class, Java contains 8 wrapper classes. They are Boolean, Byte, Short, Integer, Character, Long, Float, and Double. Further, custom wrapper classes can also be created in Java which is similar to the concept of Structure in the C programming language. We create our own wrapper class with the required data types.

22. Why do we need wrapper classes?
    The wrapper class is an object class that encapsulates the primitive data types, and we need them for the following reasons:

Wrapper classes are final and immutable
Provides methods like valueOf(), parseInt(), etc.
It provides the feature of autoboxing and unboxing.

23. Differentiate between instance and local variables.
    Instance Variable                                                   Local Variable 
Declared outside the method, directly invoked by the method.      Declared within the method.

Has a default value.                                                 No default value

It can be used throughout the class.                               The scope is limited to the method.


24. What are the default values assigned to variables and instances in Java?
    In Java When we haven’t initialized the instance variables then the compiler initializes them with default values. The default values for instances and variables depend on their data types. Some common types of default data types are:

The default value for numeric types (byte, short, int, long, float, and double) is 0.
The default value for the boolean type is false.
The default value for object types (classes, interfaces, and arrays) is null.
The null character, “u0000, ” is the default value for the char type.

Example:

// Java Program to demonstrate use of default values
import java.io.*;
class GFG {
// static values
static byte b;
static int i;
static long l;
static short s;
static boolean bool;
static char c;
static String str;
static Object object;
static float f;
static double d;
static int[] Arr;
public static void main(String[] args)
{
// byte value
System.out.println("byte value" + b);
// short value
System.out.println("short value" + s);
// int value
System.out.println("int value" + i);
// long value
System.out.println("long value" + l);
System.out.println("boolean value" + bool);
System.out.println("char value" + c);
System.out.println("float value" + f);
System.out.println("double value" + d);
System.out.println("string value" + str);
System.out.println("object value" + object);
System.out.println("Array value" + Arr);
}
}

Output:

byte value0
short value0
int value0
long value0
boolean valuefalse
char value
float value0.0
double value0.0
string valuenull
object valuenull
Array valuenull

25. What is a Class Variable?
    In Java, a class variable (also known as a static variable) is a variable that is declared within a class but outside of any method, constructor, or block. Class variables are declared with the static keyword, and they are shared by all instances (objects) of the class as well as by the class itself. No matter how many objects are derived from a class, each class variable would only exist once.

Example: // Java program to demonstrate use of Clas Variable
class GFG {
public static int ctr = 0;
public GFG() { ctr++; }
public static void main(String[] args)
{
GFG obj1 = new GFG();
GFG obj2 = new GFG();
GFG obj3 = new GFG();
System.out.println("Number of objects created are "
+ GFG.ctr);
}
}

Output
Number of objects created are 3


26. What is the default value stored in Local Variables?
    There is no default value stored with local variables. Also, primitive variables and objects don’t have any default values.

27. Explain the difference between instance variable and a class variable.
    Instance Variable: A class variable without a static modifier known as an instance variable is typically shared by all instances of the class. These variables can have distinct values among several objects. The contents of an instance variable are completely independent of one object instance from another because they are related to a specific object instance of the class.

