package Enthuware.Standart.test1;

public class test_2 {
}
/**
 * Which of the lines will cause a compile time error in the following program?
 *
 * public class MyClass{
 *    public static void main(String args[]){
 *       char c;
 *       int i;
 *       c = 'a';//1
 *       i = c;  //2
 *       i++;    //3
 *       c = i;  //4
 *       c++;    //5
 *    }
 * }*/

//line 4


/**
 * 1. A char value can ALWAYS be assigned to an int variable, since the int type is wider than the char type. So line 2 is valid.
 *
 * 2. Line 4 will not compile because it is trying to assign an int to a char. Although the value of i can be held by the char but since  'i' is not a constant but a variable, implicit narrowing will not occur.
 *
 * Here is the rule given in JLS regarding assigment of constant values to primitive variables without explicit cast:
 *
 * A narrowing primitive conversion may be used if all of the following conditions are satisfied:
 *
 * 1. The expression is a compile time constant expression of type byte, char, short, or int.
 * 2. The type of the variable is byte, short, or char.
 * 3. The value of the expression (which is known at compile time, because it is a constant expression) is representable in the type of the variable.
 *
 * Note that implict narrowing conversion (i.e. conversion without an explicit cast) does not apply to float, long, or double.
 * For example, char ch = 30L; will fail to compile although 30 is small enough to fit into a char.*/