package Enthuware.Standart.test4;

public class test56 {
}
/**What will the following code snippet print:
 * Float f = null; try{
 * f = Float.valueOf("12.3");
 *  String s = f.toString();
 *  int i = Integer.parseInt(s);
 *  System.out.println(""+i);
 *  }
 *  catch(Exception e){
 *  System.out.println("trouble : "+f);
 *  }
 *  */

//trouble : 12.3

/**f = Float.valueOf("12.3"); executes without any problem.
 * int i = Integer.parseInt(s); throws a NumberFormatException because 12.3 is not an integer.
 * Thus, the catch block prints trouble : 12.3
 * */
