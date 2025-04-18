package Enthuware.Standart.test5;

public class test36 {
}
/**What will be the result of attempting to compile and run the following code?
 public class InitClass{
 public static void main(String args[ ] ){
 InitClass obj = new InitClass(5);
 }
 int m;
 static int i1 = 5;
 static int i2 ;
 int  j = 100;
 int x;
 public InitClass(int m){
 System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
 }
 { j = 30; i2 = 40; }  // Instance Initializer
 static { i1++; }      // Static Initializer
 }*/


//The code will compile without error and will print 6 40 0 30 5 when run.

/**The value 5 is passed to the constructor to the local (automatic) variable m. So the instance variable m is shadowed. Before the body of the constructor is executed, the instance initializer is executed and assigns values 30 and 40 to variables j and i2, respectively. A class is loaded when it is first used. For example,
 class A1{
 static int i = 10;
 static { System.out.println("A1 Loaded "); }
 }
 public class A{
 static { System.out.println("A Loaded "); }
 public static void main(String[] args){
 System.out.println(" A should have been loaded");
 A1 a1 = null;
 System.out.println(" A1 should not have been loaded");
 System.out.println(a1.i);
 }
 }


 When you run it you get the output:
 A Loaded
 A should have been loaded
 A1 should not have been loaded
 A1 Loaded
 10
 Now, A should be loaded first as you are using its main method. Even though you are doing A1 a1 = null;
 A1 will not be loaded as it is not yet used (so the JVM figures out that it does not need to load it yet.)
 When you do a1.i, you are using A1, so before you use it, it must be loaded. That's when A1 is loaded.
 Finally 10 is printed.*/
