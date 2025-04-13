package Enthuware.Standart.test5;

public class test18 {
}
/**What will be the output when the following program is run?

 public class TestClass{
 char c;
 public void m1(){
 char[ ] cA = { 'a' , 'b'};
 m2(c, cA);
 System.out.println( ( (int)c)  + "," + cA[1] );
 }
 public void m2(char c, char[ ] cA){
 c = 'b';
 cA[1] = cA[0] = 'm';
 }
 public static void main(String args[]){
 new TestClass().m1();
 }
 }*/


//0,m
//Because of the explicit cast to int in the println() call, c will be printed as 0.

