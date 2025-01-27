package Enthuware.Standart.test1;

public class test_12 {
}
/**What will be the output when the following program is run?

 public class TestClass{
 public static void main(String args[]){
 int i;
 int j;
 for (i = 0, j = 0; j < i; ++j, i++){
 System.out.println(i + " " + j);
 }
 System.out.println(i + " " + j);
 }
 }*/


//0 0 will be printed once.

/**++j and i++ do not matter in this case.
 The loop will not execute even once since j is not less than i at the start of the loop so the condition fails and the program will print 0 0 just once.*/