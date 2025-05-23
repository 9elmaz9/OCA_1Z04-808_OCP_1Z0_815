package Enthuware.Standart.test5;

public class test30 {
}

/**What will the following program print when run?
 public class ChangeTest {

 private int myValue = 0;

 public void showOne(int myValue){
 myValue = myValue;
 System.out.println(this.myValue);
 }

 public void showTwo(int myValue){
 this.myValue = myValue;
 System.out.println(this.myValue);
 }
 public static void main(String[] args) {
 ChangeTest ct = new ChangeTest();
 ct.showOne(100);
 ct.showTwo(200);
 }
 }*/


//0 followed by 200.

/**There are a couple of important concepts in this question:
 * 1. Within an instance method, you can access the current object of the same class using 'this'.
 * Therefore, when you access this.myValue, you are accessing the instance member myValue of the ChangeTest instance.
 * 2. Within the showOne() method, there are two variables accessible with the same name myValue.
 * If you declare a local variable (or a method parameter) with the same name as the instance field name,
 * the local variable "shadows" the member field. One is the method parameter and another is the member field of ChangeTest object.
 * Ideally, you should be able to access the member field in the method directly by using the name of the member (in this example, myValue).
 * However, because of shadowing, when you use myValue, it refers to the local variable instead of the instance field.
 * Therefore, when you do : myValue = myValue; you are actually assigning the value contained in method parameter myValue to itself.
 * You are not changing the member field myValue. Hence, when you do System.out.println(this.myValue); in the next line, it prints 0.
 * Now, in showTwo(), you are assigning the value contained in myValue (i.e. 200) to this.myValue, which is the instance member.
 * Therefore, in the next line, when you print this.myValue, it prints 200.*/

