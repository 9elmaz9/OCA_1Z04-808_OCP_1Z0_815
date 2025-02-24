package Enthuware.Standart.test2;

public class test8 {
}
/**What will be the result of trying to compile and execute the following program?
 * public class TestClass{
 *  public static void main(String args[] ){
 *  int i = 0 ;
 *  int[] iA = {10, 20} ;
 *  iA[i] = i = 30 ;
 *
 *  System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
 *  }
 *  }
 *  */

//It will print 30 20 30

/**The statement iA[i] = i = 30 ; will be processed as follows:
 iA[i] = i = 30; => iA[0] = i = 30 ;  =>  i = 30; iA[0] = i ; =>   iA[0] = 30 ;

 Here is what JLS says on this:
 1 Evaluate Left-Hand Operand First
 2 Evaluate Operands before Operation
 3 Evaluation Respects Parentheses and Precedence
 4 Argument Lists are Evaluated Left-to-Right

 For Arrays: First, the dimension expressions are evaluated, left-to-right. If any of the expression evaluations completes abruptly, the expressions to the right of it are not evaluated.*/