package Enthuware.Standart.eight;

public class test45 {
}
/**Consider the following code:

 class Super{
 static{ System.out.print("super "); }
 }
 class One{
 static {  System.out.print("one "); }
 }
 class Two extends Super{
 static {  System.out.print("two "); }
 }
 class Test{
 public static void main(String[] args){
 One o = null;
 Two t = new Two();
 }
 }
 What will be the output when class Test is run ?*/


//It will print super two

/**
 It will print super two
 Super will be instantiated before Two.*/

/**As per JLS 12.4.1 - A class or interface type T will be initialized immediately before the first occurrence of any one of the following:  T is a class and an instance of T is created. T is a class and a static method declared by T is invoked. A static field declared by T is assigned. A static field declared by T is used and the field is not a constant variable. T is a top-level class, and an assert statement lexically nested within T is executed.  The statement One o = null; does not fall in either of the cases mentioned above. So class One is not initialized and its static block is not executed.
 *  Class Two is initialized only after its superclass Super has been initialized.*/