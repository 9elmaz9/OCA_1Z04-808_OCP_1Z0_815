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


---

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

---

## 2. Explain the difference between JDK, JRE, and JVM.
**Answer:**
- **JDK (Java Development Kit)**: Includes the JRE along with development tools like compilers and debuggers. It is used for developing Java applications.
- **JRE (Java Runtime Environment)**: Includes JVM and libraries required for running Java applications but does not contain development tools.
- **JVM (Java Virtual Machine)**: A runtime environment that executes Java bytecode and enables platform independence.

---

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

---

## 4. What is the Java Virtual Machine (JVM)?
**Answer:** JVM is an engine that provides a runtime environment for executing Java bytecode. It converts bytecode into machine code and ensures Java’s platform independence. It consists of:
- **Class Loader**: Loads class files into memory.
- **Runtime Memory Areas**: Heap, Stack, Method Area, etc.
- **Execution Engine**: Interprets bytecode or compiles it using JIT.
- **Garbage Collector**: Manages memory automatically by reclaiming unused objects.

---

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

---

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
---

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
---

## 8. What are the types of constructors in Java?
**Answer:**
- **Default Constructor**: No parameters, initializes default values.
- **Parameterized Constructor**: Accepts arguments to initialize an object.
- **Copy Constructor**: Creates a new object by copying values from another object.
---

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
---

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
---


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
---

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
---


## 13. What is the difference between an abstract class and an interface?
**Answer:**

| **Feature**                 | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Can have both abstract and concrete methods | Only abstract methods (Java 7), can have default/static methods (Java 8) |
| Variables | Can have instance variables | Only public, static, and final variables |
| Multiple Inheritance | Not supported | Supported |
| Constructor | Can have a constructor | Cannot have a constructor |

---

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

---

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
---

## 16. What is the `super` keyword in Java?
**Answer:**
The `super` keyword is used to refer to the immediate parent class in Java. It can be used to call parent class constructors, methods, or access parent class variables.
Example:
```java
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls parent class method
        System.out.println("Child class");
    }
}
```
---

## 17. What is the `this` keyword in Java?
**Answer:**
The `this` keyword is a reference variable that refers to the current object. It is used to differentiate between instance variables and parameters with the same name.
Example:
```java
class Example {
    int x;
    Example(int x) {
        this.x = x; // Refers to the instance variable
    }
}
```
---


## 18. What is an immutable class in Java?
**Answer:**
An immutable class is a class whose objects cannot be modified after creation. The `String` class is a prime example.
Example:
```java
final class ImmutableClass {
    private final int value;
    ImmutableClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
```
---


## 19. What is garbage collection in Java?
**Answer:**
Garbage collection in Java is the process of automatically reclaiming memory occupied by unused objects to prevent memory leaks. It is performed by the JVM’s Garbage Collector (GC).

## 20. What are access modifiers in Java?
**Answer:**
Java provides four types of access modifiers:
- **Private**: Accessible only within the class.
- **Default (no modifier)**: Accessible within the same package.
- **Protected**: Accessible within the same package and subclasses.
- **Public**: Accessible from anywhere.

---

## 21. What is the difference between `final`, `finally`, and `finalize` in Java?
**Answer:**
- **`final`**: Used for variables (makes them constants), methods (prevents overriding), and classes (prevents inheritance).
- **`finally`**: A block used in exception handling that always executes, regardless of whether an exception occurs or not.
- **`finalize()`**: A method that is called by the garbage collector before an object is removed from memory.
  Example:
```java
class Example {
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}
```
---

## 22. What is the difference between checked and unchecked exceptions?
**Answer:**
- **Checked Exceptions**: Exceptions that are checked at compile time (e.g., `IOException`, `SQLException`). Must be handled using `try-catch` or `throws`.
- **Unchecked Exceptions**: Exceptions that occur at runtime (e.g., `NullPointerException`, `ArithmeticException`).
  Example:
```java
try {
    FileReader file = new FileReader("test.txt");
} catch (IOException e) {
    System.out.println("File not found!");
}
```
---


## 23. What is the difference between throw and throws?
**Answer:**
- **`throw`**: Used to explicitly throw an exception.
- **`throws`**: Declares exceptions that a method might throw.
  Example:
```java
void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        throw new ArithmeticException("Not allowed");
    }
}
```
---

## 24. What are the different ways to create a thread in Java?
**Answer:**
1. **Extending the `Thread` class**:
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```
2. **Implementing the `Runnable` interface**:
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
}
```
---


## 25. What is the difference between `sleep()` and `wait()` in Java?
**Answer:**
- **`sleep()`**: A method in `Thread` that pauses execution for a specified time but does not release the lock.
- **`wait()`**: A method in `Object` that pauses execution until `notify()` or `notifyAll()` is called, and releases the lock.
  Example:
```java
synchronized(obj) {
    obj.wait(); // Releases lock and waits
    obj.notify(); // Wakes up waiting thread
}
```
---


## 26. What is the difference between `synchronized` and `volatile` in Java?
**Answer:**
- **`synchronized`**: Ensures that only one thread can access a block of code or method at a time. It provides locking to avoid race conditions.
- **`volatile`**: Ensures visibility of changes to a variable across threads but does not provide locking.
  Example:
```java
class SharedResource {
    private volatile boolean flag = true;
    void updateFlag() {
        flag = false; // Other threads immediately see the change
    }
}
```
---

## 27. What are daemon threads in Java?
**Answer:**
Daemon threads are background threads that run in the JVM and terminate when all user threads are completed. They are used for tasks like garbage collection.
Example:
```java
class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon running");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
```
---

## 28. What is the difference between `ArrayList` and `LinkedList`?
**Answer:**

| Feature | `ArrayList` | `LinkedList` |
|---------|------------|-------------|
| Implementation | Uses a dynamic array | Uses a doubly linked list |
| Access time | Fast (O(1) for `get()`) | Slow (O(n) for `get()`) |
| Insertion/Deletion | Slow (shifting elements required) | Fast (modifying pointers) |
| Memory Usage | Less (stores elements in contiguous memory) | More (stores extra references) |
Example:
```java
List<String> list = new ArrayList<>(); // or new LinkedList<>();
```
---

## 29. What is a lambda expression in Java?
**Answer:**
Lambda expressions provide a concise way to implement functional interfaces in Java.
Example:
```java
@FunctionalInterface
interface MyFunction {
    void display();
}

public class Main {
    public static void main(String[] args) {
        MyFunction func = () -> System.out.println("Hello from Lambda");
        func.display();
    }
}
```
---

## 30. What is a functional interface in Java?
**Answer:**
A functional interface is an interface that contains exactly one abstract method. It can have multiple default or static methods.
Example:
```java
@FunctionalInterface
interface MyInterface {
    void execute();
    default void show() {
        System.out.println("Default method");
    }
}
```
---

## 31. What is the Stream API in Java?
**Answer:**
The Stream API provides functional-style operations on collections and is used for processing data efficiently.
Example:
```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println); // Prints even numbers
    }
}
```
---


## 32. What is the difference between `map()` and `flatMap()` in Java Streams?
**Answer:**
- **`map()`**: Transforms elements one-to-one.
- **`flatMap()`**: Flattens nested structures and then applies a transformation.
  Example:
```java
List<String> words = Arrays.asList("Hello", "World");
List<String> result = words.stream()
                           .map(w -> w.split("")) // Returns Stream<String[]>
                           .flatMap(Arrays::stream) // Returns Stream<String>
                           .collect(Collectors.toList());
```
---

## 33. What is an Optional in Java?
**Answer:**
`Optional` is a container object that helps avoid `NullPointerException` by providing methods to handle values safely.
Example:
```java
Optional<String> name = Optional.ofNullable(null);
System.out.println(name.orElse("Default Name")); // Prints "Default Name"
```
---

## 34. What is the difference between `Comparator` and `Comparable`?
**Answer:**
| Feature | `Comparable` | `Comparator` |
|---------|-------------|-------------|
| Purpose | Defines natural ordering of objects | Allows custom sorting |
| Interface method | `compareTo(T o)` | `compare(T o1, T o2)` |
| Modifications | Implemented within the class | Defined externally |
Example:
```java
class Student implements Comparable<Student> {
    int age;
    public int compareTo(Student s) { return Integer.compare(this.age, s.age); }
}
```
---

## 35. What is the difference between deep copy and shallow copy?
**Answer:**
- **Shallow Copy**: Copies object references, changes to the original affect the copy.
- **Deep Copy**: Creates a completely new copy of objects, changes to the original do not affect the copy.
  Example:
```java
class Example implements Cloneable {
    int value;
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}
```
---

## 36. What is Reflection in Java?
**Answer:**
Reflection is a feature that allows inspection and manipulation of classes, methods, and fields at runtime.
Example:
```java
import java.lang.reflect.*;

class Example {
    private String message = "Hello";
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        Field field = Example.class.getDeclaredField("message");
        field.setAccessible(true);
        System.out.println(field.get(obj)); // Prints "Hello"
    }
}
```
---

## 37. What is the difference between `try-with-resources` and a regular `try-catch` block?
**Answer:**
- **`try-with-resources`**: Automatically closes resources after execution.
- **Regular `try-catch`**: Requires explicit closing of resources.
  Example:
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    e.printStackTrace();
}
```
---

## 38. What are the different types of memory areas allocated by JVM?
**Answer:**
- **Method Area**: Stores class metadata, static variables, and method code.
- **Heap**: Stores objects and class instances.
- **Stack**: Stores method calls and local variables.
- **PC Register**: Stores the address of the currently executing instruction.
- **Native Method Stack**: Stores native method calls.

---

## 39. What is a singleton class in Java?
**Answer:**
A singleton class ensures that only one instance of the class exists.
Example:
```java
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
---

## 40. What is the difference between HashMap and HashTable?
**Answer:**

| Feature | `HashMap` | `HashTable` |
|---------|----------|-------------|
| Synchronization | Not synchronized | Synchronized |
| Performance | Faster | Slower |
| Null keys/values | Allows one null key, multiple null values | Does not allow null keys/values |
Example:
```java
Map<String, String> map = new HashMap<>(); // or new Hashtable<>();
```
---

## 41. What is the difference between fail-fast and fail-safe iterators?
**Answer:**
- **Fail-fast iterators**: Throw `ConcurrentModificationException` if the collection is modified while iterating (e.g., `ArrayList`, `HashMap`).
- **Fail-safe iterators**: Do not throw exceptions as they work on a copy of the collection (e.g., `CopyOnWriteArrayList`).
  Example:
```java
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
Iterator<Integer> itr = list.iterator();
while (itr.hasNext()) {
    list.add(4); // Throws ConcurrentModificationException
}
```
---


## 42. What is the difference between deep cloning and shallow cloning in Java?
**Answer:**
- **Shallow Clone**: Copies field values, but references point to the same objects.
- **Deep Clone**: Creates completely new instances of referenced objects.
  Example:
```java
class Example implements Cloneable {
    int value;
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}
```
---

## 43. What is a ConcurrentHashMap in Java?
**Answer:**
`ConcurrentHashMap` is a thread-safe variant of `HashMap` that allows concurrent access without locking the entire map.
Example:
```java
Map<String, Integer> map = new ConcurrentHashMap<>();
map.put("A", 1);
```
---

## 44. What is the purpose of the transient keyword in Java?
**Answer:**
The `transient` keyword prevents a variable from being serialized.
Example:
```java
class Example implements Serializable {
    transient int tempData; // Will not be serialized
    int normalData;
}
```
---

## 45. What is the difference between Executor and ExecutorService?
**Answer:**
- **Executor**: A simple interface for executing tasks.
- **ExecutorService**: A more advanced interface that provides lifecycle control of the task execution.
  Example:
```java
ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> System.out.println("Task executed"));
executor.shutdown();
```
---

## 46. What is the difference between Callable and Runnable in Java?
**Answer:**
- **Runnable**: Does not return a result and cannot throw checked exceptions.
- **Callable**: Returns a result and can throw checked exceptions.
  Example:
```java
Callable<Integer> task = () -> {
    return 42;
};
Future<Integer> future = Executors.newSingleThreadExecutor().submit(task);
System.out.println(future.get());
```
---

## 47. What is the difference between synchronized block and synchronized method?
**Answer:**
- **Synchronized Method**: Locks the entire method, preventing multiple threads from executing it simultaneously.
- **Synchronized Block**: Locks only a specific block of code inside a method.
  Example:
```java
class Example {
    synchronized void syncMethod() {
        // Locks entire method
    }
    void syncBlock() {
        synchronized (this) {
            // Locks only this block
        }
    }
}
```
---

## 48. What is a ReentrantLock in Java?
**Answer:**
`ReentrantLock` is a more flexible and powerful alternative to synchronized methods and blocks. It allows locking with more control.
Example:
```java
ReentrantLock lock = new ReentrantLock();
lock.lock();
try {
    // Critical section
} finally {
    lock.unlock();
}
```
---

## 49. What is the difference between wait() and notify() in Java?
**Answer:**
- **wait()**: Makes the thread wait until another thread calls `notify()`.
- **notify()**: Wakes up a single waiting thread.
  Example:
```java
synchronized (obj) {
    obj.wait(); // Releases lock and waits
    obj.notify(); // Wakes up waiting thread
}
```
---

## 50. What is ThreadLocal in Java?
**Answer:**
`ThreadLocal` is a mechanism to create variables that are local to a thread.
Example:
```java
ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
threadLocal.set(100);
System.out.println(threadLocal.get());
```
---

## 51. What is the difference between `Future` and `CompletableFuture` in Java?
**Answer:**
- **`Future`**: Represents the result of an asynchronous computation but lacks chaining and exception handling.
- **`CompletableFuture`**: Provides methods for functional-style chaining and handling exceptions.
  Example:
```java
CompletableFuture.supplyAsync(() -> "Hello")
    .thenApply(str -> str + " World")
    .thenAccept(System.out::println);
```
---


## 52. What is the difference between `ForkJoinPool` and `ExecutorService`?
**Answer:**
- **`ExecutorService`**: Manages a fixed number of threads for tasks.
- **`ForkJoinPool`**: Designed for parallelism and recursive task splitting.
  Example:
```java
ForkJoinPool pool = new ForkJoinPool();
pool.submit(() -> System.out.println("Parallel execution"));
```
---

## 53. What is the difference between `readResolve()` and `writeReplace()` in serialization?
**Answer:**
- **`writeReplace()`**: Called before serialization to replace the object.
- **`readResolve()`**: Called after deserialization to replace the object.
  Example:
```java
protected Object readResolve() {
    return INSTANCE; // Ensures singleton after deserialization
}
```
---


## 54. What is the difference between `Stream.forEach()` and `Collection.forEach()`?
**Answer:**
- **`Stream.forEach()`**: Processes elements in parallel if used with a parallel stream.
- **`Collection.forEach()`**: Works sequentially on elements.
  Example:
```java
List<String> list = Arrays.asList("A", "B", "C");
list.forEach(System.out::println); // Collection.forEach()
list.stream().forEach(System.out::println); // Stream.forEach()
```
---

## 55. What is the difference between `Predicate`, `Function`, and `Consumer` in Java?
**Answer:**
- **`Predicate<T>`**: Returns a boolean (`test(T t)`).
- **`Function<T, R>`**: Transforms input to output (`apply(T t)`).
- **`Consumer<T>`**: Performs an action (`accept(T t)`).
  Example:
```java
Predicate<Integer> isEven = x -> x % 2 == 0;
Function<Integer, String> toString = x -> "Number: " + x;
Consumer<String> print = System.out::println;
```
---

## 56. What is the difference between `peek()` and `map()` in Java Streams?
**Answer:**
- **`map()`**: Transforms each element and returns a new stream.
- **`peek()`**: Performs an intermediate operation without modifying elements.
  Example:
```java
List<String> result = Stream.of("a", "b", "c")
    .peek(System.out::println) // Does not modify elements
    .map(String::toUpperCase) // Transforms elements
    .collect(Collectors.toList());
```
---


## 57. What is the difference between `flatMap()` and `map()` in Streams?
**Answer:**
- **`map()`**: Transforms elements individually.
- **`flatMap()`**: Flattens nested structures before transformation.
  Example:
```java
List<List<String>> list = Arrays.asList(
    Arrays.asList("A", "B"), Arrays.asList("C", "D")
);
List<String> flatList = list.stream()
    .flatMap(Collection::stream)
    .collect(Collectors.toList());
```
---


## 58. What is an enum in Java?
**Answer:**
An enum is a special class that represents a fixed set of constants.
Example:
```java
enum Day {
    SUNDAY, MONDAY, TUESDAY;
}
Day today = Day.MONDAY;
```
---

## 59. What is `AtomicInteger` in Java?
**Answer:**
`AtomicInteger` is a thread-safe integer class used in concurrent programming.
Example:
```java
AtomicInteger count = new AtomicInteger(0);
count.incrementAndGet(); // Increments atomically
```
---


## 60. What is the difference between `StringBuffer` and `StringBuilder`?
**Answer:**
- **`StringBuffer`**: Thread-safe and synchronized.
- **`StringBuilder`**: Not synchronized, but faster for single-threaded applications.
  Example:
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```
---

## 61. What is the difference between `Serializable` and `Externalizable` in Java?
**Answer:**
- **`Serializable`**: Uses default serialization mechanism.
- **`Externalizable`**: Allows custom serialization logic by implementing `writeExternal()` and `readExternal()`.
  Example:
```java
class Example implements Externalizable {
    private String data;
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(data);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        data = (String) in.readObject();
    }
}
```
---

## 62. What is a SoftReference in Java?
**Answer:**
A `SoftReference` allows an object to be garbage collected only when memory is low, improving efficiency.
Example:
```java
SoftReference<String> softRef = new SoftReference<>(new String("Soft Reference"));
System.out.println(softRef.get());
```
---

## 63. What is the difference between `WeakHashMap` and `HashMap`?
**Answer:**
- **`WeakHashMap`**: Uses weak references for keys, allowing them to be garbage collected.
- **`HashMap`**: Uses strong references, preventing garbage collection.
  Example:
```java
Map<Object, String> map = new WeakHashMap<>();
Object key = new Object();
map.put(key, "Value");
key = null; // Key can now be garbage collected
```
---

## 64. What is the difference between `LinkedHashMap` and `TreeMap`?
**Answer:**
| Feature | `LinkedHashMap` | `TreeMap` |
|---------|----------------|-----------|
| Order | Maintains insertion order | Maintains sorted order |
| Performance | Faster for iteration | Slower for insertion/deletion |
Example:
```java
Map<Integer, String> map = new TreeMap<>();
map.put(2, "B");
map.put(1, "A");
```
---

## 65. What is `PhantomReference` in Java?
**Answer:**
A `PhantomReference` allows an object to be garbage collected but provides a callback before finalization.
Example:
```java
PhantomReference<Object> phantomRef = new PhantomReference<>(new Object(), new ReferenceQueue<>());
```
---

## 66. What is a `CountDownLatch` in Java?
**Answer:**
A `CountDownLatch` is used to make a thread wait until other threads complete a set of operations.
Example:
```java
CountDownLatch latch = new CountDownLatch(3);
new Thread(() -> {
    latch.countDown();
}).start();
latch.await(); // Main thread waits until latch reaches 0
```
---

## 67. What is a `CyclicBarrier` in Java?
**Answer:**
A `CyclicBarrier` allows multiple threads to wait for each other before continuing execution.
Example:
```java
CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier"));
new Thread(() -> {
    barrier.await();
}).start();
```
---


## 68. What is a `Semaphore` in Java?
**Answer:**
A `Semaphore` controls access to resources by allowing only a fixed number of threads to access a resource simultaneously.
Example:
```java
Semaphore semaphore = new Semaphore(2);
semaphore.acquire(); // Acquires a permit
semaphore.release(); // Releases a permit
```
---

## 69. What is a `ReentrantReadWriteLock` in Java?
**Answer:**
A `ReentrantReadWriteLock` provides separate locks for read and write operations to improve performance in concurrent applications.
Example:
```java
ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
lock.readLock().lock();
lock.readLock().unlock();
```
---


## 70. What is a `BlockingQueue` in Java?
**Answer:**
A `BlockingQueue` is a queue that blocks threads when it is full (on insertion) or empty (on retrieval).
Example:
```java
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
queue.put(1); // Inserts element, blocking if full
queue.take(); // Retrieves element, blocking if empty
```
---

## 71. What is `ThreadPoolExecutor` in Java?
**Answer:**
`ThreadPoolExecutor` is a flexible implementation of the `ExecutorService` that manages a pool of worker threads.
Example:
```java
ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
executor.execute(() -> System.out.println("Task executed"));
executor.shutdown();
```
---

## 72. What is the difference between `ScheduledExecutorService` and `Timer` in Java?
**Answer:**
- **`ScheduledExecutorService`**: More flexible, supports periodic and delayed execution with thread pooling.
- **`Timer`**: Older, less flexible, single-threaded.
  Example:
```java
ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
scheduler.schedule(() -> System.out.println("Task executed"), 5, TimeUnit.SECONDS);
```
---


## 73. What is the difference between `CopyOnWriteArrayList` and `ArrayList`?
**Answer:**
- **`CopyOnWriteArrayList`**: Thread-safe, creates a copy on modification, best for read-heavy operations.
- **`ArrayList`**: Not thread-safe, uses a single backing array.
  Example:
```java
List<String> list = new CopyOnWriteArrayList<>();
list.add("A");
```
---

## 74. What is a `PriorityQueue` in Java?
**Answer:**
A `PriorityQueue` is a queue that orders elements according to their natural ordering or a custom comparator.
Example:
```java
PriorityQueue<Integer> queue = new PriorityQueue<>();
queue.add(10);
queue.add(5);
queue.add(20);
System.out.println(queue.poll()); // Prints 5
```
---

## 75. What is a `Deque` in Java?
**Answer:**
A `Deque` (double-ended queue) allows insertion and removal from both ends.
Example:
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);
deque.addLast(2);
System.out.println(deque.pollFirst()); // Prints 1
```
---

## 76. What is `LinkedBlockingQueue` in Java?
**Answer:**
`LinkedBlockingQueue` is a blocking queue backed by a linked list. It blocks threads when the queue is empty or full.
Example:
```java
BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);
queue.put(1);
queue.put(2);
System.out.println(queue.take()); // Retrieves and removes head element
```
---

## 77. What is `ConcurrentLinkedQueue` in Java?
**Answer:**
`ConcurrentLinkedQueue` is a thread-safe, non-blocking queue using a lock-free algorithm.
Example:
```java
Queue<String> queue = new ConcurrentLinkedQueue<>();
queue.add("A");
queue.add("B");
System.out.println(queue.poll()); // Prints "A"
```
---

## 78. What is the difference between `TreeSet` and `HashSet`?
**Answer:**

| Feature | `TreeSet` | `HashSet` |
|---------|----------|----------|
| Ordering | Sorted order | No specific order |
| Performance | Slower (O(log n)) | Faster (O(1) for insert/search) |
| Implementation | Based on `TreeMap` | Based on `HashMap` |
Example:
```java
Set<Integer> set = new TreeSet<>();
set.add(5);
set.add(1);
set.add(10);
System.out.println(set); // Prints [1, 5, 10]
```
---

## 79. What is `EnumMap` in Java?
**Answer:**
`EnumMap` is a specialized `Map` implementation for keys of type `enum`, offering high efficiency.
Example:
```java
enum Day { MONDAY, TUESDAY, WEDNESDAY }
Map<Day, String> map = new EnumMap<>(Day.class);
map.put(Day.MONDAY, "Start of week");
System.out.println(map.get(Day.MONDAY));
```
---


## 80. What is `WeakReference` in Java?
**Answer:**
A `WeakReference` allows an object to be garbage collected if no strong references exist.
Example:
```java
WeakReference<String> weakRef = new WeakReference<>(new String("Weak Reference"));
System.gc(); // May clear the weak reference
System.out.println(weakRef.get()); // May return null
```
---

## 81. What is `IdentityHashMap` in Java?
**Answer:**
`IdentityHashMap` is a specialized `Map` that uses reference equality (`==`) instead of object equality (`equals()`).
Example:
```java
Map<String, String> map = new IdentityHashMap<>();
String a = new String("key");
String b = new String("key");
map.put(a, "Value1");
map.put(b, "Value2");
System.out.println(map.size()); // Prints 2 because a != b by reference
```
---

## 82. What is `LinkedHashSet` in Java?
**Answer:**
`LinkedHashSet` is an ordered version of `HashSet`, maintaining insertion order.
Example:
```java
Set<Integer> set = new LinkedHashSet<>();
set.add(3);
set.add(1);
set.add(2);
System.out.println(set); // Prints [3, 1, 2]
```
---


## 83. What is the difference between `compareTo()` and `Comparator` in Java?
**Answer:**
- **`compareTo()`**: Defined in `Comparable`, provides natural ordering.
- **`Comparator`**: A separate class used for custom ordering.
  Example:
```java
class Student implements Comparable<Student> {
    int age;
    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }
}
Comparator<Student> comp = (s1, s2) -> Integer.compare(s2.age, s1.age); // Reverse order
```
---


## 84. What is `TreeMap` in Java?
**Answer:**
`TreeMap` is a sorted map implementation based on a Red-Black tree.
Example:
```java
Map<Integer, String> map = new TreeMap<>();
map.put(3, "C");
map.put(1, "A");
map.put(2, "B");
System.out.println(map); // Prints {1=A, 2=B, 3=C}
```
---

## 85. What is the difference between `ArrayDeque` and `LinkedList`?
**Answer:**
| Feature | `ArrayDeque` | `LinkedList` |
|---------|-------------|-------------|
| Performance | Faster for stack/queue operations | Slower due to linked structure |
| Memory | Uses a resizable array | Uses node-based structure |
Example:
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);
deque.addLast(2);
System.out.println(deque.pollFirst()); // Prints 1
```
---

## 86. What is the difference between `Volatile` and `Atomic` variables in Java?
**Answer:**
- **`volatile`**: Ensures visibility of variable updates across threads but does not provide atomicity.
- **`Atomic` classes (`AtomicInteger`, `AtomicLong`, etc.)**: Ensure both visibility and atomicity using CAS (Compare-And-Swap).
  Example:
```java
volatile int count = 0;
AtomicInteger atomicCount = new AtomicInteger(0);
atomicCount.incrementAndGet(); // Atomically increments
```
---

## 87. What is a `Phaser` in Java?
**Answer:**
A `Phaser` is a synchronization mechanism similar to `CountDownLatch` and `CyclicBarrier` but more flexible, allowing dynamic thread registration.
Example:
```java
Phaser phaser = new Phaser(1);
phaser.register();
phaser.arriveAndAwaitAdvance();
```
---

## 88. What is the difference between `Iterator` and `ListIterator`?
**Answer:**
- **`Iterator`**: Supports forward iteration only.
- **`ListIterator`**: Supports both forward and backward traversal.
  Example:
```java
ListIterator<Integer> listIterator = list.listIterator();
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}
```
---

## 89. What is the difference between `poll()`, `remove()`, and `peek()` in Java?
**Answer:**
- **`poll()`**: Retrieves and removes the head element, returning `null` if empty.
- **`remove()`**: Retrieves and removes the head element, throwing an exception if empty.
- **`peek()`**: Retrieves but does not remove the head element.
  Example:
```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(10);
System.out.println(queue.poll()); // Retrieves and removes 10
System.out.println(queue.peek()); // Retrieves 10 without removing
```
---

## 90. What is `CompletableFuture` in Java?
**Answer:**
`CompletableFuture` is an advanced version of `Future` that supports chaining, callbacks, and asynchronous computation.
Example:
```java
CompletableFuture.supplyAsync(() -> "Hello")
    .thenApply(str -> str + " World")
    .thenAccept(System.out::println);
```

---

## 91. What is the difference between `countDownLatch` and `CyclicBarrier`?
**Answer:**
- **`CountDownLatch`**: A one-time use synchronization mechanism where threads wait until the count reaches zero.
- **`CyclicBarrier`**: A reusable barrier where a group of threads waits for each other before proceeding.
  Example:
```java
CountDownLatch latch = new CountDownLatch(3);
latch.countDown();
latch.await();
```
---

## 92. What is `FutureTask` in Java?
**Answer:**
`FutureTask` is a cancellable asynchronous computation that implements both `Runnable` and `Future`.
Example:
```java
FutureTask<Integer> futureTask = new FutureTask<>(() -> 42);
new Thread(futureTask).start();
System.out.println(futureTask.get());
```
---


## 93. What is a `Spliterator` in Java?
**Answer:**
A `Spliterator` is used for traversing and partitioning elements of a `Collection` for parallel processing.
Example:
```java
List<String> list = Arrays.asList("one", "two", "three");
Spliterator<String> spliterator = list.spliterator();
spliterator.forEachRemaining(System.out::println);
```
---

## 94. What is the difference between `ReentrantLock` and `synchronized`?
**Answer:**
- **`synchronized`**: Implicit lock mechanism, easy to use.
- **`ReentrantLock`**: Explicit locking, allows try-lock, timeout, and fairness policy.
  Example:
```java
ReentrantLock lock = new ReentrantLock();
lock.lock();
try {
    // Critical section
} finally {
    lock.unlock();
}
```
---

## 95. What is a `ThreadLocal` variable in Java?
**Answer:**
A `ThreadLocal` variable provides each thread with its own copy of a variable.
Example:
```java
ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
System.out.println(threadLocal.get());
```
---
## 96. What is `VarHandle` in Java?
**Answer:**
`VarHandle` is a low-level mechanism for atomic and volatile variable operations, introduced in Java 9 as an alternative to `Unsafe`.
Example:
```java
VarHandle handle = MethodHandles.lookup().findVarHandle(Example.class, "field", int.class);
handle.set(exampleInstance, 42);
```
---

## 97. What is the difference between `ForkJoinPool` and `ThreadPoolExecutor`?
**Answer:**
- **`ForkJoinPool`**: Used for recursive parallel tasks (work-stealing algorithm).
- **`ThreadPoolExecutor`**: Used for managing a pool of worker threads for concurrent execution.
  Example:
```java
ForkJoinPool pool = new ForkJoinPool();
pool.submit(() -> System.out.println("Parallel execution"));
```
---

## 98. What is the difference between `CompletableFuture.supplyAsync()` and `runAsync()`?
**Answer:**
- **`supplyAsync()`**: Returns a result (`CompletableFuture<T>`).
- **`runAsync()`**: Does not return a result (`CompletableFuture<Void>`).
  Example:
```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<Void> futureRun = CompletableFuture.runAsync(() -> System.out.println("Task executed"));
```
---


## 99. What is `Record` in Java?
**Answer:**
A `Record` is a special kind of class introduced in Java 14 for immutable data storage.
Example:
```java
record Person(String name, int age) {}
Person p = new Person("Alice", 25);
System.out.println(p.name());
```
---

## 100. What is the `Sealed Class` feature in Java?
**Answer:**
A `Sealed Class` restricts which classes can extend it, introduced in Java 15.
Example:
```java
sealed class Shape permits Circle, Rectangle {}
final class Circle extends Shape {}
final class Rectangle extends Shape {}
```
---
## 101. What is `Pattern Matching for instanceof` in Java?
**Answer:**
Introduced in Java 16, this feature simplifies type checks using `instanceof` by reducing explicit casting.
Example:
```java
if (obj instanceof String s) {
    System.out.println(s.toUpperCase()); // No explicit casting needed
}
```
---

## 102. What is `Text Blocks` in Java?
**Answer:**
A `Text Block` allows defining multiline string literals, introduced in Java 13.
Example:
```java
String text = """
    This is a text block
    that spans multiple lines.
""";
```
---

## 103. What is `Switch Expressions` in Java?
**Answer:**
Introduced in Java 12, `switch expressions` allow returning values and use lambda-style syntax.
Example:
```java
String result = switch (day) {
    case MONDAY, FRIDAY -> "Start or end of week";
    case SATURDAY, SUNDAY -> "Weekend";
    default -> "Midweek";
};
```
---

## 104. What is `Vector API` in Java?
**Answer:**
Introduced in Java 16, `Vector API` provides support for SIMD (Single Instruction, Multiple Data) computations, improving performance for data-heavy applications.
Example:
```java
VectorSpecies<Float> species = FloatVector.SPECIES_PREFERRED;
FloatVector va = FloatVector.fromArray(species, a, 0);
FloatVector vb = FloatVector.fromArray(species, b, 0);
FloatVector vc = va.mul(vb);
```
---

## 105. What is `Foreign Function & Memory API` in Java?
**Answer:**
This API, introduced as an incubator feature in Java 17, allows calling native code without JNI and managing off-heap memory safely.
Example:
```java
try (MemorySegment segment = MemorySegment.allocateNative(100)) {
    segment.set(ValueLayout.JAVA_INT, 0, 42);
    System.out.println(segment.get(ValueLayout.JAVA_INT, 0));
}
```
---

## 106. What is `Sealed Classes` in Java?
**Answer:**
Introduced in Java 15, `Sealed Classes` restrict which other classes can extend them.
Example:
```java
sealed class Shape permits Circle, Rectangle {}
final class Circle extends Shape {}
final class Rectangle extends Shape {}
```
---


## 107. What is `Records` in Java?
**Answer:**
A `Record` is a special kind of class introduced in Java 14 for immutable data storage.
Example:
```java
record Person(String name, int age) {}
Person p = new Person("Alice", 25);
System.out.println(p.name());
```
---


## 108. What is `Hidden Classes` in Java?
**Answer:**
Introduced in Java 15, `Hidden Classes` allow dynamically generated classes that are not discoverable via reflection.
Example:
```java
MethodHandles.Lookup lookup = MethodHandles.lookup();
Class<?> hiddenClass = lookup.defineHiddenClass(bytes, true).lookupClass();
```
---

## 114. What is the difference between `Callable` and `Runnable`?
**Answer:**
- **`Runnable`**: Does not return a result and cannot throw checked exceptions.
- **`Callable`**: Returns a result and can throw checked exceptions.
  Example:
```java
Callable<Integer> task = () -> 42;
Future<Integer> future = Executors.newSingleThreadExecutor().submit(task);
System.out.println(future.get());
```

## 115. What is the difference between `sleep()` and `wait()` in Java?
**Answer:**
- **`sleep()`**: Pauses execution for a specified time but does not release the lock.
- **`wait()`**: Pauses execution until `notify()` or `notifyAll()` is called and releases the lock.
  Example:
```java
synchronized(obj) {
    obj.wait(); // Releases lock and waits
    obj.notify(); // Wakes up waiting thread
}
```

## 116. What is the difference between `ArrayBlockingQueue` and `LinkedBlockingQueue`?
**Answer:**
- **`ArrayBlockingQueue`**: Uses a fixed-size array, faster but limited in capacity.
- **`LinkedBlockingQueue`**: Uses a linked list, allowing dynamic sizing.
  Example:
```java
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
queue.put(1);
System.out.println(queue.take());
```

## 117. What is the difference between `CopyOnWriteArrayList` and `ArrayList`?
**Answer:**
- **`CopyOnWriteArrayList`**: Thread-safe, creates a new copy on each write operation, best for read-heavy operations.
- **`ArrayList`**: Not thread-safe, uses a single backing array.
  Example:
```java
List<String> list = new CopyOnWriteArrayList<>();
list.add("A");
```

## 118. What is the difference between `ConcurrentHashMap` and `HashMap`?
**Answer:**
- **`ConcurrentHashMap`**: Thread-safe, uses segment-based locking.
- **`HashMap`**: Not thread-safe, requires explicit synchronization for concurrent access.
  Example:
```java
Map<String, Integer> map = new ConcurrentHashMap<>();
map.put("A", 1);
```
## 119. What is the difference between `HashSet` and `TreeSet`?
**Answer:**
- **`HashSet`**: Uses a hash table, does not maintain order, offers O(1) time complexity for insert/search.
- **`TreeSet`**: Uses a red-black tree, maintains sorted order, offers O(log n) time complexity.
  Example:
```java
Set<Integer> set = new TreeSet<>();
set.add(5);
set.add(1);
set.add(10);
System.out.println(set); // Prints [1, 5, 10]
```

## 120. What is `LinkedHashMap` and how is it different from `HashMap`?
**Answer:**
- **`LinkedHashMap`**: Maintains insertion order using a doubly linked list.
- **`HashMap`**: Does not guarantee order.
  Example:
```java
Map<Integer, String> map = new LinkedHashMap<>();
map.put(2, "B");
map.put(1, "A");
System.out.println(map); // Maintains insertion order
```

## 121. What is the difference between `peek()`, `poll()`, and `remove()` in Java Queues?
**Answer:**
- **`peek()`**: Retrieves but does not remove the head element, returns `null` if empty.
- **`poll()`**: Retrieves and removes the head element, returns `null` if empty.
- **`remove()`**: Retrieves and removes the head element, throws `NoSuchElementException` if empty.
  Example:
```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(10);
System.out.println(queue.peek()); // 10
System.out.println(queue.poll()); // 10
```

## 122. What is `WeakHashMap` in Java?
**Answer:**
`WeakHashMap` is a map where keys are weak references and can be garbage collected when no strong references exist.
Example:
```java
Map<Object, String> map = new WeakHashMap<>();
Object key = new Object();
map.put(key, "Value");
key = null; // Now the entry may be garbage collected
```

## 123. What is the difference between `Deque` and `Queue`?
**Answer:**
- **`Queue`**: Supports FIFO (First In, First Out) operations.
- **`Deque`**: Supports both FIFO and LIFO (Last In, First Out) operations.
  Example:
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);
deque.addLast(2);
System.out.println(deque.pollFirst()); // 1
```

## 124. What is the difference between `PriorityQueue` and `ArrayDeque`?
**Answer:**
- **`PriorityQueue`**: A queue that orders elements based on their priority.
- **`ArrayDeque`**: A resizable array-based implementation of a double-ended queue (Deque).
  Example:
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);
pq.add(20);
System.out.println(pq.poll()); // Prints 5 (lowest priority first)
```

## 125. What is `IdentityHashMap` in Java?
**Answer:**
`IdentityHashMap` is a specialized `Map` implementation that compares keys using reference equality (`==`) instead of `equals()`.
Example:
```java
Map<String, String> map = new IdentityHashMap<>();
String a = new String("key");
String b = new String("key");
map.put(a, "Value1");
map.put(b, "Value2");
System.out.println(map.size()); // Prints 2 because a != b by reference
```

## 126. What is `PhantomReference` in Java?
**Answer:**
A `PhantomReference` allows an object to be garbage collected but provides a callback before finalization.
Example:
```java
PhantomReference<Object> phantomRef = new PhantomReference<>(new Object(), new ReferenceQueue<>());
```

## 127. What is `EnumMap` in Java?
**Answer:**
`EnumMap` is a specialized `Map` implementation for keys of type `enum`, offering high efficiency.
Example:
```java
enum Day { MONDAY, TUESDAY, WEDNESDAY }
Map<Day, String> map = new EnumMap<>(Day.class);
map.put(Day.MONDAY, "Start of week");
System.out.println(map.get(Day.MONDAY));
```

## 128. What is `BlockingQueue` in Java?
**Answer:**
A `BlockingQueue` is a queue that blocks threads when it is full (on insertion) or empty (on retrieval).
Example:
```java
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
queue.put(1); // Inserts element, blocking if full
queue.take(); // Retrieves element, blocking if empty
```
## 129. What is the difference between `LinkedBlockingQueue` and `ArrayBlockingQueue`?
**Answer:**
- **`LinkedBlockingQueue`**: Uses a linked list structure, allowing dynamic sizing and better performance for large workloads.
- **`ArrayBlockingQueue`**: Uses a fixed-size array, providing better performance for predictable workloads.
  Example:
```java
BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
queue.put(1);
System.out.println(queue.take());
```

## 130. What is `DelayQueue` in Java?
**Answer:**
A `DelayQueue` is a blocking queue that holds elements until their delay expires.
Example:
```java
class DelayedTask implements Delayed {
    private long startTime;
    DelayedTask(long delay) {
        this.startTime = System.currentTimeMillis() + delay;
    }
    public long getDelay(TimeUnit unit) {
        return unit.convert(startTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}
DelayQueue<DelayedTask> queue = new DelayQueue<>();
queue.put(new DelayedTask(5000));
```

## 131. What is `PriorityBlockingQueue` in Java?
**Answer:**
A `PriorityBlockingQueue` is a thread-safe priority queue that orders elements according to their priority.
Example:
```java
PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
pq.add(10);
pq.add(5);
pq.add(20);
System.out.println(pq.poll()); // Prints 5 (smallest first)
```

## 132. What is the difference between `TreeMap` and `HashMap`?
**Answer:**
- **`TreeMap`**: Maintains keys in sorted order (O(log n) operations).
- **`HashMap`**: Provides fast access (O(1) operations) but does not maintain order.
  Example:
```java
Map<Integer, String> map = new TreeMap<>();
map.put(2, "B");
map.put(1, "A");
System.out.println(map); // {1=A, 2=B}
```

## 133. What is `CopyOnWriteArraySet` in Java?
**Answer:**
A `CopyOnWriteArraySet` is a thread-safe set that copies itself on modification, making it efficient for read-heavy workloads.
Example:
```java
Set<String> set = new CopyOnWriteArraySet<>();
set.add("A");
set.add("B");
System.out.println(set);
```
## 134. What is `ConcurrentSkipListMap` in Java?
**Answer:**
`ConcurrentSkipListMap` is a thread-safe, sorted map that provides logarithmic time performance similar to `TreeMap`, but supports concurrent access.
Example:
```java
ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
map.put(2, "B");
map.put(1, "A");
System.out.println(map); // {1=A, 2=B}
```

## 135. What is `Semaphore` in Java?
**Answer:**
A `Semaphore` controls access to a resource by limiting the number of concurrent threads that can access it.
Example:
```java
Semaphore semaphore = new Semaphore(2);
semaphore.acquire(); // Acquires a permit
semaphore.release(); // Releases a permit
```

## 136. What is `CountDownLatch` in Java?
**Answer:**
A `CountDownLatch` is a synchronization aid that allows one or more threads to wait until a set of operations in other threads completes.
Example:
```java
CountDownLatch latch = new CountDownLatch(3);
latch.countDown();
latch.await();
```

## 137. What is the difference between `Executor` and `ExecutorService`?
**Answer:**
- **`Executor`**: A simple interface for executing tasks asynchronously.
- **`ExecutorService`**: A more advanced interface that provides lifecycle management of tasks.
  Example:
```java
ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> System.out.println("Task executed"));
executor.shutdown();
```

## 138. What is `ScheduledExecutorService` in Java?
**Answer:**
`ScheduledExecutorService` allows scheduling tasks with a fixed delay or at a fixed rate.
Example:
```java
ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
scheduler.schedule(() -> System.out.println("Task executed"), 5, TimeUnit.SECONDS);
```
# Java Interview Questions and Answers

...(предыдущие вопросы)

## 139. What is `ThreadPoolExecutor` in Java?
**Answer:**
`ThreadPoolExecutor` is a flexible implementation of the `ExecutorService` that manages a pool of worker threads.
Example:
```java
ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
executor.execute(() -> System.out.println("Task executed"));
executor.shutdown();
```

## 140. What is `CyclicBarrier` in Java?
**Answer:**
A `CyclicBarrier` allows multiple threads to wait for each other before proceeding further.
Example:
```java
CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier"));
new Thread(() -> {
    barrier.await();
}).start();
```

## 141. What is `ReentrantReadWriteLock` in Java?
**Answer:**
A `ReentrantReadWriteLock` provides separate locks for read and write operations to improve performance in concurrent applications.
Example:
```java
ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
lock.readLock().lock();
lock.readLock().unlock();
```

## 142. What is `Phaser` in Java?
**Answer:**
A `Phaser` is a more flexible alternative to `CountDownLatch` and `CyclicBarrier`, allowing dynamic thread registration.
Example:
```java
Phaser phaser = new Phaser(1);
phaser.register();
phaser.arriveAndAwaitAdvance();
```

## 143. What is `ForkJoinPool` in Java?
**Answer:**
A `ForkJoinPool` is a special type of thread pool for parallel task execution, especially suited for recursive tasks.
Example:
```java
ForkJoinPool pool = new ForkJoinPool();
pool.submit(() -> System.out.println("Parallel execution"));
```

