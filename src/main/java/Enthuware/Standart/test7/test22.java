package Enthuware.Standart.test7;

public class test22 {
}
/**What will be the result of attempting to compile and run the following class?

 public class TestClass{
 public static void main(String args[ ] ){
 int i = 1;
 int[] iArr = {1};
 incr(i) ;
 incr(iArr) ;
 System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
 }
 public static void incr(int   n ) { n++ ; }
 public static void incr(int[ ] n ) { n [ 0 ]++ ; }
 }*/


//The code will print i = 1 iArr[0] = 2

/**Arrays are proper objects (i.e. iArr instanceof Object returns true) and Object
 * references are passed by value (so effectively, it seems as though objects are being passed by reference).
 * So the value of reference of iArr is passed to the method incr(int[] i);
 *  This method changes the actual value of the int element at 0.*/

