package unique_test_1;

public class test23 {
}
/**Which statements about the following code are correct?
 * interface House{
 * public default String getAddress(){
 * return "101 Main Str";
 *   }
 *  }
 * interface Bungalow extends House{
 * public default String getAddress(){
 * return "101 Smart Str";
 *   }
 * }
 * class MyHouse implements Bungalow, House{  }
 * public class TestClass {
 * public static void main(String[] args) {
 *  House ci = new MyHouse();  //1
 *  System.out.println(ci.getAddress()); //2
 *    }
 *  } */

//The code will compile successfully.

/**There is no problem with the code. It is perfectly valid for a subinterface
 * to override a default method of the base interface. A class that implements
 * an interface can also override a default method. It is valid for MyHouse
 * to say that it implements Bungalow as well as House even though House is
 * redundant because Bungalow is a House anyway.  It will actually print 101 Smart str.*/




