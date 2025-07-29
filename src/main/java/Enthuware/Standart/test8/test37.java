package Enthuware.Standart.test8;

public class test37 {
}
/**What will the following code print?

 public class BreakTest{
 public static void main(String[] args){
 int i = 0, j = 5;
 lab1 : for( ; ; i++){
 for( ; ; --j)  if( i >j ) break lab1;
 }
 System.out.println(" i = "+i+", j = "+j);
 }
 }*/


//i = 0, j = -1

/*The values of i and j in the inner most for loop change as follows:
 i = 0
 j = 5
 i = 0
 j = 4
 i = 0
 j = 3
 i = 0
 j = 2
 i = 0
 j = 1
 i = 0
 j = 0
 i = 0
 j = -1
Therefore, the final println prints i = 0, j = -1*/

