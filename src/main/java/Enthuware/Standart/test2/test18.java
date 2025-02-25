package Enthuware.Standart.test2;

public class test18 {
}
/**Consider the following class...

 class TestClass{
 void probe(Integer x) { System.out.println("In Integer"); } //2

 void probe(Object x) { System.out.println("In Object"); } //3

 void probe(Long x) { System.out.println("In Long"); } //4

 public static void main(String[] args){
 String a = "hello";
 new TestClass().probe(a);
 }
 }
 What will be printed?*/

//In Object

/**Here, we have three overloaded probe methods but there is no probe method that takes a String parameter. The only one that is able to accept a String is the one that takes Object as a parameter. So that method will be called.

 A String cannot be assigned to a variable of class Integer or Long variable, but it can be assigned to a variable of class Object.*/

/**Question Analysis:
 The program contains three overloaded probe methods in the TestClass:

 void probe(Integer x): Handles arguments of type Integer (autoboxed int).
 void probe(Object x): Handles arguments of type Object.
 void probe(Long x): Handles arguments of type Long (autoboxed long).
 In the main method:

 java
 Copy code
 String a = "hello";
 new TestClass().probe(a);
 Variable a is of type String.
 How Java Chooses the Overloaded Method:
 Exact Match: Java first looks for a method that matches the type of the argument exactly. There is no probe(String) method here.
 Widening: Java looks for a method that accepts a superclass of the argument type. In this case, String is a subclass of Object.
 Autoboxing: If widening doesn’t work, Java considers autoboxing (e.g., int → Integer or long → Long).
 Varargs: As a last resort, Java matches varargs methods.
 What Happens in This Case:
 String a is passed to probe(String).
 The closest match is probe(Object x) because String is a subclass of Object.
 Correct Output:
 The probe(Object x) method is called, and it prints:

 css
 Copy code
 In Object
 Correct Answer:
 In Object






 You said:
 shorter and  clear
 ChatGPT said:
 ChatGPT
 The probe methods are overloaded. A String (a = "hello") is passed to the probe method. Since String is a subclass of Object and there is no exact match (probe(String)), the probe(Object x) method is chosen.

 Output: In Object*/

