package Enthuware.Standart.test4;

public class test27 {
}
/**What will the following code print when compiled and run:

 public class TestClass {

 public static void main(String[] args){
 int k = 2;
 do{
 System.out.println(k);
 }while(--k>0);
 }
 }*/

//2
// 1

/**     --k>0 implies, decrement the value of k and then compare with 0. Therefore, the loop will only execute twice, printing 2 and 1.
 * Had it been k-->0, it would imply, first compare k with 0, and then decrement k. In this case, the loop would execute thrice, printing 2, 1, and 0.*/