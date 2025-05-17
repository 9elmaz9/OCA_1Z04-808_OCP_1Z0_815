package Enthuware.Standart.test7;

public class test9 {
}
/**Consider the following class :

 class Test{
 public static void main(String[] args){
 for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
 for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
 int i = 20;                  //3
 System.out.print(i + " ");   //4
 }
 }
 Which of the following statements are true?*/

//As such, the class will compile and print "20 " (without quotes) at the end of its output.

//It will not compile if line 3 is removed.      If //3 is removed, 'i' will be undefined for //4

//It will not compile if line 3 is removed and placed before line 1.

//It will not compile if line 3 is removed and placed before line 1.

/**The scope of a local variable declared in 'for' statement is the rest of the 'for' statement, including its own initializer. So, when line 3 is placed before line 1, there is a redeclaration of i in the first for() which is not legal.
 As such, the scope of i's declared in for() is just within the 'for' blocks. So placing line 4 before line 3 will not work since 'i' is not in scope there.*/