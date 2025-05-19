package Enthuware.Standart.test7;

public class test14 {
}
/**What will the following program print when run?

 // Filename: TestClass.java
 public class TestClass{
 public static void main(String args[] ){ A b = new B("good bye");  }
 }
 class A{
 A() { this("hello", " world");  }
 A(String s) { System.out.println(s); }
 A(String s1, String s2){ this(s1 + s2); }
 }
 class B extends A{
 B(){ super("good bye"); };
 B(String s){ super(s, " world"); }
 B(String s1, String s2){ this(s1 + s2 + " ! "); }
 }*/


// It will print "good bye world".

/**new B("good bye"); will call class B's one args constructor which in turn calls super(s, " world");
 * (i.e. class A's two args constructor) which in turn calls this(s1 + s2);
 *  (i.e. class A's one arg constructor with parameter "good bye world") which prints it.*/