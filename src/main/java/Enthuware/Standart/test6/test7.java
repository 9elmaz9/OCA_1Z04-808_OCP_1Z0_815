package Enthuware.Standart.test6;

public class test7 {
}
/**In the following code what will be the output if 0 (integer value zero) is passed to loopTest()?

 public class TestClass{
 public void loopTest(int x){
 loop: for (int i = 1; i < 5; i++){
 for (int j = 1; j < 5; j++){
 System.out.println(i);
 if (x == 0) {  continue loop;  }
 System.out.println(j);
 }
 }
 }
 }*/

//It will print 1 2 3 4

/**When x is 0, the statement continue loop; is executed. Note that loop: is for the outer loop. So, only one iteration (that too, not fully) is performed for the inner loop.
 So, the inner loop prints the value of i only once and then next iteration of outer loop starts. 'j' is never printed. So, it prints 1 2 3 4.*/

