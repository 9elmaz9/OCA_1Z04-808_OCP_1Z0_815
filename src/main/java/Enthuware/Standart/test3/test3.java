package Enthuware.Standart.test3;

public class test3 {
}
/** Which of the following classes have a default constructor?
 class A{  }
 class B {  B(){ } }
 class C{  C(String s){ } }
 */

//A

/**There is only one rule regarding the "default" constructor: The Java compiler automatically adds a constructor that takes no
 *  argument and has the same access as the class, if and only if the programmer does not define ANY constructor in the class.
 *  In this case, the programmer has not defined any constructor for class A, hence it will have the default constructor.  For class B,
 *  the programmer has defined a constructor that is exactly same as the default constructor that would have been provided automatically.
 *  It is a matter of interpretation whether it can be called a default constructor or not.  Based on Java Language Specification section 8.8.9,
 *  quoted below, our interpretation is that class B will not get a default constructor:  (http://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html )
 *  8.8.9 Default Constructor If a class contains no constructor declarations, then a default constructor with no formal parameters and no throws clause
 *  is implicitly declared.  If the class being declared is the primordial class Object, then the default constructor has an empty body. Otherwise,
 *  the default constructor simply invokes the superclass constructor with no arguments.  It is a compile-time error if a default constructor is
 *  implicitly declared but the superclass does not have an accessible constructor (6.6) that takes no arguments and has no throws clause.
 *  It follows that if the nullary constructor of the superclass has a throws clause, then a compile-time error will occur.*/