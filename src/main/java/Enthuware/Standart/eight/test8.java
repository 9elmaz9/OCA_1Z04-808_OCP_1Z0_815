package Enthuware.Standart.eight;

public class test8 {
}
/**What will the following code print?
 *  public class TestClass {
 *  public static void main(String[] args) {
 *  int x = 1____3;   //1
 *  long y = 1_3;     //2
 *  float z = 3.234_567f; //3
 *  System.out.println(x+" "+y+" "+z);
 *  } }*/


//13 13 3.234567

//The number at //1 and //2 are actually the same. Although confusing, it is legal to have multiple underscores between two digits.

/**The code will compile and run successfully. Here's the breakdown of each line:

 int x = 1____3;:

 The underscores (_) in numeric literals are used to improve readability and are ignored by the compiler. So, 1____3 is treated as 13, and x will be assigned the value 13.
 long y = 1_3;:

 Similarly, 1_3 is treated as 13, and y will be assigned the value 13L.
 float z = 3.234_567f;:

 The underscore in the decimal part (3.234_567) is also ignored, so z will be assigned the value 3.234567f (a float).
 Output:*/
