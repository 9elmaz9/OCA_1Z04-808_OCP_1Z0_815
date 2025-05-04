package Enthuware.Standart.test6;

public class test38 {
}
/**Which of the following code fragments will successfully initialize a two-dimensional array of chars named cA with a size such that cA[2][3] refers to a valid element?
 *  1.   char[][] cA = {  { 'a', 'b', 'c' },  { 'a', 'b', 'c' }   };
 *  2.   char cA[][] = new char[3][];   for (int i=0; i<cA.length; i++) cA[i] = new char[4];
 *  3.   char cA[][] = { new char[ ]{ 'a', 'b', 'c' }  ,   new char[ ]{ 'a', 'b', 'c' }  };
 * 4   char cA[3][2] = new char[][] {  { 'a', 'b', 'c' },   { 'a', 'b', 'c' }   };
 * 5.   char[][] cA = { "1234", "1234",  "1234"  };*/

//2

/**Remember that array indexing starts with 0, therefore, to access element cA[2][3], cA must refer to an array whose length in the first dimension must be at least 3 and in the second dimension must be at least 4.

 Options 1 and 3 declare a two dimensional array correctly but they create the dimensions of the array that they create are [2][3].  Thus, trying to access cA[2] will cause an ArrayIndexOutOfBoundsException.

 Option 4 is syntactically incorrect. You cannot put array size information on left hand side of equals sign.

 The instantiation expression on the right hand side in option 5 creates a one dimensional array and that too of Strings and therefore, it cannot be assigned to cA. Note that a java String is not equivalent to a one dimensional array of chars.

 This leaves us with only one choice 2.*/