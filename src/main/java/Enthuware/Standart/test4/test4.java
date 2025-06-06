package Enthuware.Standart.test4;

public class test4 {
}
/**Given the following declaration:
 *  int[][] twoD = { { 1, 2, 3} , { 4, 5, 6, 7}, { 8, 9, 10 } };
 *  What will the following lines of code print?
 *  System.out.println(twoD[1].length);
 *  System.out.println(twoD[2].getClass().isArray()); System.out.println(twoD[1][2]);*/

/**
 4 true 6*/


/**In Java, array numbering starts from 0. So in this case, twoD is an array containing 3 other arrays. twoD[0] is { 1, 2, 3} ,
 *  twoD[1] is { 4, 5, 6, 7}, and twoD[2] is{ 8, 9, 10 }.
 *  Thus, twoD[1].length is 4 and twoD[1][2] is the third element in { 4, 5, 6, 7},
 *  which is 6.  In Java, arrays are just like regular Objects and arrays of different types have different class names. For example,
 *  the class name of an int[] is [I and the class name for int[][] is [[I.  For array classes, the isArray() method of a Class returns true.
 *  For example, twoD.getClass().isArray() will return true.
 *  There are a few questions in the exam that require you to know about this.*/


