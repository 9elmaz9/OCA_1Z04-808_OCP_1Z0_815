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