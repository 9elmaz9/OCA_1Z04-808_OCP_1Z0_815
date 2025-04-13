package Enthuware.Standart.test5;

public class test15 {
        }

        /**

         Given:
         public class LoopTest {
         int k = 5;
         public boolean checkIt(int k){
         return k-->0?true:false;
         }
         public void printThem(){
         while(checkIt(k)){
         System.out.print(k);
         }
         }
         public static void main(String[] args) {
         new LoopTest().printThem();
         }
         }
         What changes should be made so that the program will print 54321?* */


//        Replace System.out.print(k); with System.out.print(k--);

/*Observe that the method parameter k in checkIt shadows the instance variable k.
 Therefore, any changes made to k in checkIt will not affect the instance variable k.
 For checkIt method to access the instance variable k, you need to do this.k.  k-->0 means,
 first compare the value of k with 0, and then reduce it by 1. (As opposed to --k>0, which means,
 first reduce the value of k by 1 and then compare with 0).  In the printThem method, k refers to the instance variable.
  You need to reduce it by 1 after each iteration. Therefore, System.out.print(k--); will do.*/
