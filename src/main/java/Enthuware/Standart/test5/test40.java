package Enthuware.Standart.test5;

public class test40 {
}
/**What will the following code print when compiled and run?

 class Test{
 public static void main(String args[]){
 int c = 0;
 A: for(int i = 0; i < 2; i++){
 B: for(int j = 0; j < 2; j++){
 C: for(int k = 0; k < 3; k++){
 c++;
 if(k>j) break;
 }
 }
 }
 System.out.println(c);
 }
 }*/


//10
/**The point to note here is that a break without any label breaks the innermost outer loop. So in this case, whenever k>j, the C loop breaks.
 You should run the program and follow it step by step to understand how it progresses.*/