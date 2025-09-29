package Extra.unique_test_2;

public class test5 {
}
/**What happens when you try to compile and run the following program?
 public class CastTest{
 public static void main(String args[ ] ){
 byte b = -128 ;
 int i = b ;
 b = (byte) i;
 System.out.println(i+" "+b);
 }
 }*/

//The program will compile and will print -128 and -128 when run .

//A byte can ALWAYS be assigned to an int.

//byte and int both hold signed values. So when b is assigned to i, the sign is preserved.