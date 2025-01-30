package Enthuware.Standart.eight;

public class Test20 {

   // Given the following code, which of these statements are true?
   // class TestClass{
        public static void main(String args[]){
            int k = 0;
            int m = 0;
            for ( int i = 0; i <= 3; i++){
                k++;  // k is incremented in every iteration of the loop
                if ( i == 2){
                    continue;  // Skips the remaining code in this iteration when i == 2
                }
                m++;  // m is incremented only if `continue` is not executed
            }
            System.out.println( k + ", " + m );// 4, 4
        }
    }
//}
/**
 * Variable Explanation:
 * k: Incremented once per loop iteration (i++).
 * m: Incremented at the end of every loop iteration, unless a continue skips that iteration.
 * Options Analysis:
 * It will print 3, 2 when line 1 is replaced by break;
 *
 * When break; is used, the loop terminates as soon as i == 2.
 * By that point:
 * k = 2 (loop ran for i = 0 and i = 1).
 * m = 2 (incremented twice before breaking).
 * Output: 3, 2.
 * Correct.
 * It will print 3, 2 when line 1 is replaced by continue;
 *
 * When continue; is used, the rest of the loop body (including m++) is skipped when i == 2.
 * By the end:
 * k = 4 (loop runs for i = 0, 1, 2, 3).
 * m = 3 (incremented for i = 0, 1, 3, skipping i = 2).
 * Output: 4, 3.
 * Incorrect.
 * It will print 4, 3 when line 1 is replaced by continue.
 *
 * Same reasoning as option 2.
 * Output: 4, 3.
 * Correct.
 * It will print 4, 4 when line 1 is replaced by i = m + i;
 *
 * When i = m + i; is used:
 * i is incremented dynamically based on m.
 * The loop runs less predictably.
 * This leads to:
 * Output: 4, 4.
 * Correct.
 * It will print 3, 3 when line 1 is replaced by i = 4;
 *
 * When i = 4; is used, i immediately becomes 4, and the loop condition (i <= 3) fails.
 * Loop terminates after i == 0, 1.
 * Output: 3, 2.
 * Incorrect.
 * Correct Options:
 * It will print 3, 2 when line 1 is replaced by break;
 * It will print 4, 3 when line 1 is replaced by continue.
 * It will print 4, 4 when line 1 is replaced by i = m + i;*/