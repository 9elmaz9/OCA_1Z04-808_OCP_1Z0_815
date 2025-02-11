# OCA & OCP Certification Prep

Welcome to my personal repository where I'm preparing for **OCA_1Z0-808** and **OCP_1Z0_815**!

## What's Going On Here?

This is where I’m gathering all the resources, notes, and exercises while preparing for the **Oracle Certified Associate (OCA)** and **Oracle Certified Professional (OCP)** exams. Just a little bit of patience, a lot of practice, and maybe some coffee along the way.

- **OCA_1Z0-808**: Kicking off with the basics to become a **Java pro**.
- **OCP_1Z0_815**: Leveling up and getting ready to be a **certified professional**!

## Who's This For?

Well, mainly for me, but feel free to follow along if you're also preparing for the same certifications! It’s all about sharing the journey of getting certified and staying motivated.

## How to Use?

1. Clone the repo (if you want to follow along).
2. Get comfortable with some coffee.
3. Go through the materials, solve exercises, take practice tests, and learn a lot!
4. Get certified, celebrate, and feel proud of the hard work!

## Let’s Do This! 🎉

On my way to becoming a **Java certified professional**! No stress, just progress.




# Java Interview Questions and Answers

## 1. What are the main features of Java?
**Answer:** Java has several key features:
- **Platform Independent**: Java programs can run on different operating systems without modification due to the JVM (Java Virtual Machine).
- **Object-Oriented**: Java follows OOP principles, such as inheritance, encapsulation, and polymorphism.
- **Robust**: Java provides strong memory management and exception handling features.
- **Multithreaded**: Supports concurrent execution of two or more parts of a program.
- **Secure**: Java has security features like bytecode verification, runtime security checks, and the security manager.
- **High Performance**: Although Java is an interpreted language, it achieves high performance with Just-In-Time (JIT) compilation.
- **Dynamic and Extensible**: Supports dynamic loading of classes and libraries.

## 2. Explain the difference between JDK, JRE, and JVM.
**Answer:**
- **JDK (Java Development Kit)**: Includes the JRE along with development tools like compilers and debuggers. It is used for developing Java applications.
- **JRE (Java Runtime Environment)**: Includes JVM and libraries required for running Java applications but does not contain development tools.
- **JVM (Java Virtual Machine)**: A runtime environment that executes Java bytecode and enables platform independence.

## 3. What is the difference between Java and C++?
**Answer:**

| Feature               | Java                                     |              C++                     |
|-----------------------|-----------------------------------------|--------------------------------------|
| Platform Independence | Yes (via JVM)                            |   No (compiled to machine code)      |
| Memory Management     | Automatic (Garbage Collector)            | Manual (pointers, new/delete)        |
| Multiple Inheritance  | Not supported (achieved via interfaces)  | Supported                            |
| Pointers              | Not available                            | Available                            |
| Exception Handling    | Built-in                                 | Manual                               |
| Security              | High (sandboxing, bytecode verification) | Lower (direct memory access)         |

## 4. What is the Java Virtual Machine (JVM)?
**Answer:** JVM is an engine that provides a runtime environment for executing Java bytecode. It converts bytecode into machine code and ensures Java’s platform independence. It consists of:
- **Class Loader**: Loads class files into memory.
- **Runtime Memory Areas**: Heap, Stack, Method Area, etc.
- **Execution Engine**: Interprets bytecode or compiles it using JIT.
- **Garbage Collector**: Manages memory automatically by reclaiming unused objects.

## 5. What is bytecode in Java?
**Answer:**
Bytecode is an intermediate representation of Java source code compiled by the Java compiler. It is platform-independent and can be executed on any system with a JVM. Example:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
When compiled using `javac HelloWorld.java`, it generates `HelloWorld.class`, which contains bytecode.

## 6. Explain the difference between `==` and `equals()` in Java.
**Answer:**
- `==` is used for reference comparison (i.e., whether two references point to the same memory location).
- `equals()` is used for content comparison (i.e., whether two objects are logically equal).
  Example:
```java
String s1 = new String("Hello");
String s2 = new String("Hello");
System.out.println(s1 == s2);       // false (different memory locations)
System.out.println(s1.equals(s2));  // true (same content)
```

## 7. What is a constructor in Java?
**Answer:**
A constructor is a special method used to initialize objects. It has the same name as the class and does not have a return type. Example:
```java
class Example {
    int x;
    
    // Constructor
    Example(int value) {
        x = value;
    }
    
    void display() {
        System.out.println("Value: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display();
    }
}
```

## 8. What are the types of constructors in Java?
**Answer:**
- **Default Constructor**: No parameters, initializes default values.
- **Parameterized Constructor**: Accepts arguments to initialize an object.
- **Copy Constructor**: Creates a new object by copying values from another object.

## 9. What is method overloading in Java?
**Answer:**
Method overloading allows multiple methods with the same name but different parameter lists within a class.
Example:
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

## 10. What is method overriding in Java?
**Answer:**
Method overriding allows a subclass to provide a specific implementation of a method already defined in its parent class.
Example:
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}
```

## 11. What is an interface in Java?
**Answer:**
An interface in Java is a reference type that defines abstract methods that must be implemented by a class. Interfaces support multiple inheritance.
Example:
```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

## 12. What is an abstract class in Java?
**Answer:**
An abstract class in Java is a class that cannot be instantiated and may contain abstract methods (methods without implementation).
Example:
```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting...");
    }
}
```

## 13. What is the difference between an abstract class and an interface?
**Answer:**

| **Feature**                 | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Can have both abstract and concrete methods | Only abstract methods (Java 7), can have default/static methods (Java 8) |
| Variables | Can have instance variables | Only public, static, and final variables |
| Multiple Inheritance | Not supported | Supported |
| Constructor | Can have a constructor | Cannot have a constructor |

## 14. What is the `final` keyword in Java?
**Answer:**
The `final` keyword is used to declare constants, prevent method overriding, and prevent inheritance.
- **Final variable**: Cannot be reassigned.
- **Final method**: Cannot be overridden.
- **Final class**: Cannot be inherited.
  Example:
```java
final class Constants {
    static final double PI = 3.14159;
}
```

## 15. What is a static variable and a static method?
**Answer:**
A static variable/method belongs to the class rather than an instance of the class.
Example:
```java
class Example {
    static int count = 0;
    static void show() {
        System.out.println("Static method");
    }
}
```


