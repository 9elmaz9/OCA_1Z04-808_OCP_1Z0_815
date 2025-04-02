package Enthuware.Standart.test4;

public class test34{
}
/**What will the following code print?
 *
 * public class Test{
 *  public int luckyNumber(int seed){
 *  if(seed > 10) return seed%10;
 *  int x = 0;
 *  try{
 *  if(seed%2 == 0) throw new Exception("No Even Number Please.");
 *  else return x;
 *  }
 *  catch(Exception e){
 *  return 3;
 *  }
 *  finally{
 *  return 7;
 *  }
 *  }
 *
 *  public static void main(String args[]){
 *  int amount = 100, seed = 6;
 *  switch( new Test().luckyNumber(6) ){
 *  case 3: amount = amount * 2;
 *  case 7: amount = amount * 2;
 *  case 6: amount = amount + amount;
 *  default :
 *  }
 *  System.out.println(amount);
 *  } }  */


//400

/**Remember that when a finally clause has a return statement then this return statement supersedes any return statement that the
 * try block or the catch blocks might have.  Now, in this case, when you pass 6 to luckyNumber(int seed), if(seed%2 == 0)
 * throw new Exception("No Even Number Please."); is executed and the exception is caught by the catch block where it tries to return 3.
 * But since there is a finally block associated with the try/catch block, it is executed before anything is actually returned to the caller.
 * Now, since the finally clause has a return statement, this return statement supersedes the return statements of the try or catch blocks.
 * Thus, the final return value will be the value returned by the finally block, which is 7. In fact, irrespective of whether
 * the try block throws an exception or not, this code will always return 7.
 * Now, in the switch there is no break statement.
 * So both - case 7: amount = amount * 2; and case 6: amount = amount + amount; are executed. so the final amount becomes 400.*/