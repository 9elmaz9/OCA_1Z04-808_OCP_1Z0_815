package Enthuware.Standart.test6;

public class test45 {
}
/**Given:
 * int a = 1 + 2 + 3 * 4;
 * int b = 2 * 3 + 4;
 * int total = a + b;
 * What will be the value of total?*/

//25
/**Multiplication has more precedence than addition.
 *  So this will be evaluated as:
 *  int a = 1 + 2 + (3 * 4);
 *  3+12 15
 *  int b = 2 * 3 + 4;
 *  6+4 10
 *  So, total = 25*/

/**You may get a few very simple questions about operator preference. Simple school math trick of BODMAS can be used to evaluate the expressions.

 B Brackets first
 O Orders (i.e. Powers and Square Roots, etc.)
 DM Division and Multiplication (left-to-right)
 AS Addition and Subtraction (left-to-right)
 */