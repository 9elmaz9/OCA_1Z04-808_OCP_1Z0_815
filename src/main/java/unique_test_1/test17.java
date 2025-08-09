package unique_test_1;

public class test17 {
}
/**What will be the result of attempting to compile and run the following code?
 *  class SwitchTest{
 *  public static void main(String args[]){
 *  for ( int i = 0 ; i < 3 ; i++){
 *  boolean flag  = false;
 *  switch (i){
 *  flag  = true;
 *  }
 *  if ( flag )
 *  System.out.println( i );
 *    }
 *  } }*/

//Compilation error.

//It will say 'case', 'default' or '}' expected at compile time.

/**You cannot have unlabeled block of code inside a switch block. Any code block must succeed a case label (or default label). Since there is no case statement in this switch block, there is no way the line flag = true; can be reached! Therefore, it will not compile.
 *
 * */



