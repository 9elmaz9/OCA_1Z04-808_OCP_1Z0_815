package Enthuware.Standart.test5;

public class test32 {
}
/**
 What will be the result of attempting to compile and run the following program?
 public class TestClass{
 public static void main(String args[]){
 int x  = 0;
 labelA:   for (int i=10; i<0; i--){
 int j = 0;
 labelB:
 while (j < 10){
 if (j > i) break labelB;
 if (i == j){
 x++;
 continue labelA;
 }
 j++;
 }
 x--;
 }
 System.out.println(x);
 }
 }*/


//The program will write 0 to the standard output.

/**This is just a simple code that is meant to confuse you. Notice the for statement: for(int i=10; i<0; i--). i is being initialized to 10 and the test is i<0, which is false.
 *  Therefore, the control will never get inside the for loop, none of the weird code will be executed, and x will remain 0, which is what is printed.*/
