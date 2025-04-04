package Enthuware.Standart.test4;

public class test38 {
}
/**
 *
 * Consider the following code snippet:
 *
 * public class Test{
 *   void test(){
 *       MyClass obj = new MyClass();
 *       obj.name = "jack";
 *       // 1 insert code here
 *   }
 * }
 *
 * //In MyClass.java
 * public class MyClass{
 *   int value;
 *   String name;
 * }
 *
 * What can be inserted at // 1, which will make the object referred to by obj eligible for garbage collection?*/


Consider the following code snippet:

public class Test{
    void test(){
        MyClass obj = new MyClass();
        obj.name = "jack";
        // 1 insert code here
    }
}

//In MyClass.java
public class MyClass{
    int value;
    String name;
}

//    What can be inserted at // 1, which will make the object referred to by obj eligible for garbage collection?
//This will make the object eligible for GC because there are no other references to it.


/**The official exam objectives now explicitly mention Garbage collection.  All you need to know is:

 1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
 2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();

 Nothing can ensure that an object will definitely be destroyed by the garbage collector. You can at most make an object eligible for GC by making sure that there are no references to it.*/