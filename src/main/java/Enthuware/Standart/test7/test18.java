package Enthuware.Standart.test7;

public class test18 {
}
/**What will be the result of attempting to run the following program?
 * public class StringArrayTest{
 * public static void main(String args[]){
 * String[][][] arr  ={  {   { "a", "b" , "c"}, { "d", "e", null } },
 *  { {"x"}, null },   {{"y"}},   { { "z","p"}, {} }
 *  };
 *  System.out.println(arr[0][1][2]);
 *  }
 *  }*/

//It will print null.

/**arr[0][1][2] => [0] = { { "a", "b" , "c"}, { "d", "e", null } }, [1] = { "d", "e", null } and [2] = null.
 So it will print null.
 */