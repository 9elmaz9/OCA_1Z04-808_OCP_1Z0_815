package Enthuware.Standart.test2;

public class test41 {
}
/**What will the following code print when compiled and run:
 * public class TestClass {
 *  public static void main(String[] args){
 *  int k = 2;
 *  while(--k){
 *  System.out.println(k);
 *  }     } }*/


//It will not compile.

/*In Java, a while or do/while construct takes an expression that returns a boolean. The expression --k is an integer, which is invalid and so the compilation fails.
 You could change it to: while( --k>0 ){ ... }. In this case, --k>0 is a boolean expression and is valid.*/