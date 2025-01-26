package Enthuware.Standart.test1;

public class test_13 {
}
/**Consider following classes:

 //In File Other.java
 package other;
 public class Other { public static String hello = "Hello"; }

 //In File Test.java
 package testPackage;
 import other.*;
 class Test{
 public static void main(String[] args){
 String hello = "Hello", lo = "lo";
 System.out.print((testPackage.Other.hello == hello) + " ");    //line 1
 System.out.print((other.Other.hello == hello) + " ");   //line 2
 System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
 System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
 System.out.println(hello == ("Hel"+lo).intern());          //line 5
 }
 }
 class Other { static String hello = "Hello"; }
 What will be the output of running class Test?*/


//true true true false true


/*
* These are the six facts on Strings:
1. Literal strings within the same class in the same package represent references to the same String object.
2. Literal strings within different classes in the same package represent references to the same String object.
3. Literal strings within different classes in different packages likewise represent references to the same String object.
4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals.
5. Strings computed at run time are newly created and therefore are distinct. (So line 4 prints false.)
6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 5 prints true.)

We advise you to read section 3.10.5 String Literals in Java Language Specification.*/