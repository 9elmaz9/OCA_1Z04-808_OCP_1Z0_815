package Enthuware.Standart.test1;

public class test_15 {
}
/**What will the following code print when compiled and run?
 * public class OrderTest {
 *  public void initData(String[] arr){
 *  int ind = 0;         for(String str : arr){
 *  str.concat(str+" "+ind);
 *  ind++;
 *  }
 *  }
 *  public void printData(String[] arr){
 *  for(String str : arr){
 *  System.out.println(str);
 *  }
 *  }
 *  public static void main(String[] args) {
 *  OrderTest ot = new OrderTest();
 *  String[] arr = new String[2];
 *  ot.initData(arr);
 *  ot.printData(arr);
 *  }
 *  }
 *  */


//It will throw a RuntimeException at run time.
