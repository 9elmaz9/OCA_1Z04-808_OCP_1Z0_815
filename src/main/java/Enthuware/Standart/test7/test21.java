package Enthuware.Standart.test7;

public class test21 {
}
/**Consider the following code:
 *
 *  public class ArrayTest {
 *  static int[][] table = new int[2][3];
 *  public static void init() {
 *  for (int x = 0; x < table.length; x++) {
 *  for (int y = 0; y < table[x].length; y++) {
 *  //insert code to initialize
 *    }
 *   }
 *  }
 *  public static void multiply() {
 *  for (int x = 0; x < table.length; x++) {
 *  for (int y = 0; y < table[x].length; y++) {
 *  //insert code to multiply
 *       }
 *     }
 *    }
 *  }
 *  Which of the following options can be used in the code above so that the init
 *  method initializes each table element to the sum of its row and column number and
 *  the multiply method just multiplies the element value by 2?*/

/**
 table[x][y] = x+y;
 and
 table[x][y] = table[x][y]*2;*/

//This code snippet illustrates correct syntax for accessing array elements in a multi dimensional array.
// All other options are syntactically incorrect and will not compile.
