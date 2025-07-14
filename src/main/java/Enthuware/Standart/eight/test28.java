package Enthuware.Standart.eight;

public class test28 {
}
/**What will the following code print when run?
 *  public class Test{ static String j = "";
 *  public static void method( int i){
 *  try{
 *  if(i == 2){
 *  throw new Exception();
 *  }
 *  j += "1";
 *  }
 *  catch (Exception e){
 *  j += "2";
 *  return;
 *  }
 *  finally{
 *  j += "3";
 *  }
 *  j += "4"; }
 *  public static void main(String args[]){
 *  method(1);
 *  method(2);
 *  System.out.println(j); } } */


//13423

/**Try to follow the flow of control :
 1. in method(1) : i is not 2 so, j gets "1" then finally is executed which makes j = "13" and then the last statement (j +=4) is executed which makes j = "134".
 2. in method(2) : i is 2, so it goes in the if block which throws an exception. So none of the statements of try block are executed and control goes to catch which makes j = "1342", then finally makes j = "13423" and the control is returned. Note that the last statement ( j+=4) is not executed as there was an exception thrown in the try block, which cause the control to go to the catch block, which in turn has a return.
 */

/**Try to follow the flow of control :
 1. in method(1) : i is not 2 so, j gets "1" then finally is executed which makes j = "13" and then the last statement (j +=4) is executed which makes j = "134".
 2. in method(2) : i is 2, so it goes in the if block which throws an exception. So none of the statements of try block are executed and control goes to catch which makes j = "1342", then finally makes j = "13423" and the control is returned. Note that the last statement ( j+=4) is not executed as there was an exception thrown in the try block, which cause the control to go to the catch block, which in turn has a return.
 */