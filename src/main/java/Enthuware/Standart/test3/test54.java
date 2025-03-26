package Enthuware.Standart.test3;

public class test54 {
}
/**Note: This question may be considered too advanced for this exam.  Which statements can be inserted at line 1 in the following code to make the program write x on the standard output when run?

 public class AccessTest{
 String a = "x";
 static char b = 'x';
 String  c = "x";
 class Inner{
 String  a = "y";
 String  get(){
 String c = "temp";
 // Line 1
 return c;
 }
 }

 AccessTest() {
 System.out.println(  new Inner().get()  );
 }

 public static void main(String args[]) {  new AccessTest();  }
 }*/


//c = ""+AccessTest.b;

//c = AccessTest.this.a;

//c = ""+b;
