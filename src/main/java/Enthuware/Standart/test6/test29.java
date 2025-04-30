package Enthuware.Standart.test6;

public class test29 {
}
/**What will be the output of the following class.
 *  class Test{    public static void main(String[] args){
 *  int j = 1;
 *  try{
 *  int i = doIt() / (j = 2);
 *  } catch (Exception e){
 *  System.out.println(" j = " + j);
 *  }
 *  }
 *  public static int doIt() throws Exception {
 *  throw new Exception("FORGET IT");
 *  } }
 *  */



//It will print j = 1;
/**If evaluation of the left-hand operand of a binary operator completes abruptly, no part of the right-hand operand appears to have been evaluated.
 * 4So, as doIt() throws exception, j = 2 never gets executed.*/

