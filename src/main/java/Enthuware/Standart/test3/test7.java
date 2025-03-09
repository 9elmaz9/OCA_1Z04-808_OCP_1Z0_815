package Enthuware.Standart.test3;

public class test7 {
}
/**What will the following program print?

 class Test{
 public static void main(String[] args){
 int i = 4;
 int ia[][][] = new int[i][i = 3][i];
 System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
 }
 }*/

//4, 3, 3

/**In an array creation expression, there may be one or more dimension expressions, each within brackets. Each dimension expression is fully evaluated before any part of any dimension expression to its right. The first dimension is calculated as 4 before the second dimension expression sets 'i' to 3.
 Note that if evaluation of a dimension expression completes abruptly, no part of any dimension expression to its right will appear to have been evaluated.*/