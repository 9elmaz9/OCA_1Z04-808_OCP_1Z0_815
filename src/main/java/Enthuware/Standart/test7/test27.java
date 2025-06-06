package Enthuware.Standart.test7;

public class test27 {
}
/**Which of the following code snippets will print exactly 10?
 * 1.  Object t = new Integer(106);
 * int k = ((Integer) t).intValue()/10;
 * System.out.println(k);
 *  2.  System.out.println(100/9.9);
 *  3.  System.out.println(100/10.0);
 *  4.  System.out.println(100/10);
 *  5.  System.out.println(3 + 100/10*2-13);*/

//1
//4
//5

/**1. int k = ((Integer) t).intValue()/10; Since both the operands of / are ints, it is a integer division.
 * This means the resulting value is truncated (and not rounded).
 * Therefore, the above statement will print 10 and not 11. 5. 3 + 100/10*2-13 will be parsed as: 3 + (100/10)*2-13.
 * This is because the precedence of / and * is same (and is higher than + and -) and since the expression is evaluated from left to right,
 * the operands are grouped on first come first served basis.
 *  [This is not the right terminology but you will be able to answer the questions if you remember this rule.]*/