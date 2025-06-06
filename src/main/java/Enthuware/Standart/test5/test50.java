package Enthuware.Standart.test5;

public class test50 {
}
/**What will the following code snippet print?

 int count = 0, sum = 0;
 do{
 if(count % 3 == 0) continue;
 sum+=count;
 }
 while(count++ < 11);
 System.out.println(sum);*/



//48
/**1. The while condition uses post increment operator, which means count is first compared with 11
 *  (and based on this comparison a decision is made whether to execute the loop again or not)
 *  and then incremented. So when count is 10, the condition 10<11 is true (that means the loop needs to be executed again)
 *  and count is incremented to 11.  2. When count is completely divisible by 3, (i.e. when count is 0, 3, 6, 9) sum+=count;
 *  is not executed.  Thus, the result is the summation of: 1 2 4 5 7 8 10 11*/
