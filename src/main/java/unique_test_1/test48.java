package unique_test_1;

public class test48 {
}
/**What will the following program print?

 class Test{
 public static void main(String args[]){
 int i=0, j=0;
 X1: for(i = 0; i < 3; i++){
 X2: for(j = 3; j > 0; j--){
 if(i < j) continue X1;
 else break X2;
 }
 }
 System.out.println(i+" "+j);
 }
 }*/

// 3 3

/*The statement:  if(i < j) continue X1; else break X2; only makes sure that the inner loop
does not iterate more than once. i.e. for each iteration of i, j only takes the value of 3 and then
 the j loop terminates, either because of continue X1; or because of break X2;. Now, the point to remember
  here is that when the loop for(i = 0; i < 3; i++) ends, the value of i is 3 and not 2. Similarly,
  if there were no statement inside inner loop, the value of j after the end of the loop would have been 0 and not 1.**/


