package unique_test_1;

public class test21 {
}
/**What will the following program print?
 public class TestClass{
 static boolean b;
 static int[] ia = new int[1];
 static char ch;
 static boolean[] ba = new boolean[1];
 public static void main(String args[]) throws Exception{
 boolean x = false;
 if( b ){
 x = ( ch == ia[ch]);
 }
 else x = ( ba[ch] = b );
 System.out.println(x+" "+ba[ch]);
 }
 }*/

//false false


/**This question tests your knowledge on the default values of uninitialized primitives and object references. booleans are initialized to false, numeric types to 0 and object references to null. Elements of arrays are initialized to the default values of their types. So, elements of a boolean array are initialized to false. int, char, float to 0 and Objects to null.  In this case, b is false. So the else part of if(b) is executed. ch is a numeric type so its value is 0. ba[0] = false assigns false to ba[0] and returns false which is assigned to x. Finally, x and ba[0] are printed as false false.*/