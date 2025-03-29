package Enthuware.Standart.test4;

public class test3 {
}
/**What will the following code print when compiled and run?
 *  public class DaysTest{
 *  static String[] days = {"monday", "tuesday", "wednesday", "thursday",     "friday", "saturday", "sunday" };
 *  public static void main(String[] args) {
 *  int index = 0;
 *  for(String day : days){
 *  if(index == 3){
 *  break;
 *  }else {
 *  continue;
 *  }
 *  index++;
 *  if(days[index].length()>3){
 *  days[index] = day.substring(0,3);
 *  }
 *  }
 *  System.out.println(days[index]);
 *  } }*/


//It will not compile.

/**Notice the statement :
 *  if(index == 3){ break;}else { continue;} In no situation can the control go beyond this statement in the for loop.
 * Therefore,rest of the statements in the for loop are unreachable and so the code will not compile.*/
