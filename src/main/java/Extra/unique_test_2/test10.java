package Extra.unique_test_2;

public class test10 {
}
/**What will the following program print?
 *  public class TestClass{
 *  public static void main(String[] args){
 *  int x = 1;
 *  int y = 0;
 *  if( x/y ) System.out.println("Good");
 *  else  System.out.println("Bad");   } }*/

//It will not compile.

//You need a boolean in the 'if' condition. Here, compiler sees that there is no way x/y can produce a boolean so it generates an error at compile time.
