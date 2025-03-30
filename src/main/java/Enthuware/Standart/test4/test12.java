package Enthuware.Standart.test4;

public class test12 {
}
/**What will the following program print?

 class Test{
 public static void main(String args[]){
 int c = 0;
 boolean flag = true;
 for(int i = 0; i < 3; i++){
 while(flag){
 c++;
 if(i>c || c>5) flag = false;
 }
 }
 System.out.println(c);
 }
 }*/

//6

//In the first iteration of for loop, the while loop keeps running till c becomes 6. Now, for all next for loop iteration, the while loop never runs as the flag is false. So final value of c is 6.