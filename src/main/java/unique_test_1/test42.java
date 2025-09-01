package unique_test_1;

public class test42 {
}
/**The following program will print
 java.lang.ArithmeticException: / by zero

 class Test{
 public static void main(String[] args){
 int d = 0;
 try{
 int i = 1 / (d* doIt());
 } catch (Exception e){
 System.out.println(e);
 }
 }
 public static int doIt() throws Exception{
 throw new Exception("Forget It");
 }
 }*/

//False

//It will print Forget It because before the division can take place doIt() will throw an exception.
