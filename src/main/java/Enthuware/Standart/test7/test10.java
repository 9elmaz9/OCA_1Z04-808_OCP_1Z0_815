package Enthuware.Standart.test7;

public class test10 {
}
/**Which of the following lines of code that, when inserted at line 1, will make the overriding method in SubClass invoke the overridden method in BaseClass on the current object with the same parameter.

 class BaseClass{
 public void print(String s) {  System.out.println("BaseClass :"+s); }
 }
 class SubClass extends BaseClass{
 public void print(String s){
 System.out.println("SubClass :"+s);
 // Line 1
 }
 public static void main(String args[]){
 SubClass sc = new SubClass();
 sc.print("location");
 }
 }*/



//super.print(s);


/**This is the right syntax to call the base class's overridden method.
 *  However, note that there is no way to call a method if it has been overriden more than once.
 *  For example, if you make BaseClass extend from another base class SubBase,
 *  and if SubBase also has the same method, then there is no way to invoke SubBase's print method from
 *  SubClass's print method. You cannot have something like super.super.print(s);*/