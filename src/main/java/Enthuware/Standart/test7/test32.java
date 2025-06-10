package Enthuware.Standart.test7;

public class test32 {
}
/**Consider the following method...

 public static void ifTest(boolean flag){
 if (flag)   //1
 if (flag)   //2
 if (flag)   //3
 System.out.println("False True");
 else        //4
 System.out.println("True False");
 else        //5
 System.out.println("True True");
 else        //6
 System.out.println("False False");
 }
 Which of the following statements are correct ?*/

//If run with an argument of 'false', it will print 'False False'
//It will never print 'True True'

/**Look at it like this:
 if (flag)      //1
 {
 if (flag)       // 2
 {
 if (flag)        //3
 {
 System.out.println("False True");
 }
 else            //4
 {
 System.out.println("True False");
 }
 }
 else           //5
 {
 System.out.println("True True");
 }
 }
 else           //6
 {
 System.out.println("False False");
 }
 Note that if and else do not cascade.4
 They are like opening an closing brackets.
 So, else at //4 is associated with if at //3 and else at //5 is associated with if at //2*/
