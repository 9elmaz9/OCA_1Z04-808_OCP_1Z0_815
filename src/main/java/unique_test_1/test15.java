package unique_test_1;

public class test15 {
}
/**Which line(s) of code in the following program will cause a compilation error?
 public class TestClass{
 static int value = 0; //1
 public static void main(String args[]) //2
 {
 int 2ndArgument = Integer.parseInt(args[2]); //3
 if( true == 2 > 10 ) //4
 {
 value = -10;
 }
 else{
 value =  2ndArgument;
 }
 for( ; value>0; value--) System.out.println("A"); //5
 }
 }*/

//3

//2ndArgument is not a valid identifier name because an identifier must not start with a digit (although it can contain a digit.) An identifier may start with and contain the underscore character _.

