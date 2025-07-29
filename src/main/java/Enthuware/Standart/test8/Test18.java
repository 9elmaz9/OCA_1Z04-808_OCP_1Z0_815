package Enthuware.Standart.test8;

public class Test18 {
//The probe methods are overloaded. A String (a = "hello") is passed to the probe method. Since String is a subclass of Object and there is no exact match (probe(String)), the probe(Object x) method is chosen.
//
//Output: In Object

   // Consider the following class...

        void probe(Integer x) { System.out.println("In Integer"); } //2

        void probe(Object x) { System.out.println("In Object"); } //3

        void probe(Long x) { System.out.println("In Long"); } //4

        public static void main(String[] args){
            String a = "hello";
            new Test18().probe(a);
        }
    }
   // What will be printed?
//In Object

/**
 *
 * Question Analysis:
 * The program contains three overloaded probe methods in the TestClass:
 *
 * void probe(Integer x): Handles arguments of type Integer (autoboxed int).
 * void probe(Object x): Handles arguments of type Object.
 * void probe(Long x): Handles arguments of type Long (autoboxed long).
 * In the main method:
 *
 * java
 * String a = "hello";
 * new TestClass().probe(a);
 *
 * Variable a is of type String.
 * How Java Chooses the Overloaded Method:
 * Exact Match: Java first looks for a method that matches the type of the argument exactly. There is no probe(String) method here.
 * Widening: Java looks for a method that accepts a superclass of the argument type. In this case, String is a subclass of Object.
 * Autoboxing: If widening doesn’t work, Java considers autoboxing (e.g., int → Integer or long → Long).
 * Varargs: As a last resort, Java matches varargs methods.
 * What Happens in This Case:
 * String a is passed to probe(String).
 * The closest match is probe(Object x) because String is a subclass of Object.
 * Correct Output:
 *
 * The probe(Object x) method is called, and it prints:
 *
 * In Object

 */

/**
 * */

