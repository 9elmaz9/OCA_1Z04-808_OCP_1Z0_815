package Enthuware.Standart.test6;

public class test33 {
}
/**Consider the following code:
 * public class MyClass {
 * protected int value = 10;
 * }
 *
 * Which of the following statements are correct regarding the field value?*/

//It can be read and modified from any class within the same package.

/**Note that since value is protected, a class in another package which extends MyClass will only inherit this variable,
 *  but it cannot read or modify the value of a variable of a MyClass instance.
 For example:
 //in different package class X extends MyClass{ public static void main(String[] args){ int a = new MyClass().value;
 //This will not compile
 //because X does not own MyClass's value.
 * a = new X().value;
 * //This will compile fine because X inherits value. } }*/