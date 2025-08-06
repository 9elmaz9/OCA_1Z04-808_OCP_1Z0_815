package unique_test_1;

public class test13 {
}
/**A java source file contains the following code:
 interface I {
 int getI(int a, int b);
 }

 interface J{
 int getJ(int a, int b, int c);
 }

 abstract class MyIJ implements J , I { }

 class MyI{
 int getI(int x, int y){ return x+y; }
 }

 interface K extends J{
 int getJ(int a, int b, int c, int d);
 }
 Identify the correct statements:*/

//It will compile without any error.
