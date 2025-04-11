package Enthuware.Standart.test5;

public class test4 {
}
/**The following code snippet will not compile:
 *  int i = 10;
 *  System.out.println( i<20 ? out1() : out2() );
 *
 * Assume that out1 and out2 methods have the following signatures: public void out1(); and public void out2();*/

//True

/**Note that it is not permitted for the second and the third operand of the ?: operator to be an invocation of a void method.

 The type of the expression built using ?: is determined by the types of the second and the third operands.

 If one of the operands is of type byte and the other is of type short, then the type of the conditional expression is short.
 If one of the operands is of type T where T is byte, short, or char, and the other operand is a constant expression of type int whose value is representable in type T, then the type of the conditional expression is T.

 Otherwise, binary numeric promotion (5.6.2) is applied to the operand types, and the type of the conditional expression is the promoted type of the second and third operands.
 If one of the second and third operands is of the null type and the type of the other is a reference type, then the type of the conditional expression is that reference type.
 If the second and third operands are of different reference types, then it must be possible to convert one of the types to the other type (call this latter type T) by assignment conversion (5.2); the type of the conditional expression is T. It is a compile-time error if neither type is assignment compatible with the other type.

 Note that binary numeric promotion performs unboxing conversion (5.1.8) and value set conversion (5.1.13).
 */