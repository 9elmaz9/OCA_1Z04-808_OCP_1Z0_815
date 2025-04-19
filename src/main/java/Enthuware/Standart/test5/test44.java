package Enthuware.Standart.test5;

public class test44 {
}
/**Consider the following method...
 *  public void ifTest(boolean flag){
 *  if (flag)   //1
 *  if (flag)   //2
 *  System.out.println("True False");
 * else        // 3
 * System.out.println("True True");
 * else        // 4
 * System.out.println("False False");
 * }
 * Which of the following statements are correct ?*/

//If run with an argument of 'false', it will print 'False False'

//If run with an argument of 'true', it will print 'True False'

//It will never print 'True True'

/**Note that if and else do not cascade. They are like opening and closing braces.
 *  if (flag)//1
 *  if (flag)//2
 *  System.out.println("True False"); else//
 *  3 This closes //2
 *  System.out.println("True True");
 *  else// 4 This closes //1
 *  System.out.println("False False");
 *
 *  So, else at //3 is associated with if at //2 and else at //4 is associated with if at //1*/
