package Enthuware.Standart.test4;

public class test51 {
}

/**Consider the following code:

 public static void main(String[] args) {
 int[] values = { 10, 30, 50 };
 for( int val : values ){
 int x = 0;
 while(x<values.length){
 System.out.println(x+" "+val);
 x++;
 }
 }
 }
 How many times is 2 printed out in the output?*/


//3

/**This is a simple while loop nested inside a for loop. The for loop loops three times - once for each value in values array.
 * Since, values.length is 3, x is incremented two times for each for loop iteration before the condition x<values.length returns false.
 * Therefore, it prints:
 * 0 10
 * 1 10
 * 2 10
 * 0 30
 * 1 30
 * 2 30
 * 0 50
 * 1 50
 * 2 50*/

