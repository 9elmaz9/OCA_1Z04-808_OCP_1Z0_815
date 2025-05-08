package Enthuware.Standart.test6;

public class test47 {
}
/**What will be written to the standard output when the following program is run?
 *  public class TrimTest{
 *  public static void main(String args[]){
 *  String blank  = " ";  // one space
 *  String line = blank + "hello" + blank + blank;
 *  line.concat("world");
 *  String newLine  =  line.trim();
 *  System.out.println((int)(line.length() + newLine.length()));
 *  } }
 * */

//None of the above.
//It will print 13!!!

/**Note that line.concat("world") does not change line itself. It creates a new String object containing " hello world" but it is lost because there is no reference to it.
 *
 * Similarly, calling trim() does not change the object itself. So the answer is 8 + 5 = 13 !*/