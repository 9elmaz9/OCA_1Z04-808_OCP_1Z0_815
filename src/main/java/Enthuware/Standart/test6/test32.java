package Enthuware.Standart.test6;

public class test32 {
}
/**What will be the result of attempting to compile and run the following program?

 class TestClass{
 public static void main(String args[]){
 int i = 0;
 for (i=1 ;  i<5  ; i++) continue;  //(1)
 for (i=0 ;       ; i++) break;       //(2)
 for (    ; i<5?false:true ;    );     //(3)
 }
 }*/

//The code will compile without error and will terminate without problem when run.

/**A continue statement can occur in and only in loops i.e. for/enhanced-for, while, and do-while loop.
 * A continue statement means: Forget about the rest of the statements in the loop and start the next iteration.
 * So, for (i=1 ;i<5; i++) continue; just increments the value of i up to 5 because of i++.  for (i=0 ;; i++) break;
 * iterates only once because of the break so the value of i becomes 0.  for (; i<5?false:true ;);
 * never iterates because i is less than 5 (it is 0 because of //2)
 * and the condition expression is false!  At the end of the code, the value of i is 0.*/