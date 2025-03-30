package Enthuware.Standart.test4;

public class test13 {
}

/**Consider the following class definition:

 public class TestClass{
 public static void main(String[] args){
 new TestClass().sayHello(); }   //1

 public static void sayHello(){
 System.out.println("Static Hello World"); }  //2

 public void sayHello() { System.out.println("Hello World "); }  //3
 }
 What will be the result of compiling and running the class?*/

//Compilation error at line 3.
//It will say, method sayHello() is already defined.

/**You cannot have two methods with the same signature (name and parameter types) in one class.
 * Also, even if you put one sayHello() method in other class which is a subclass of this class,
 * it won't compile because you cannot override/hide a static method with a non static method and vice versa.*/

