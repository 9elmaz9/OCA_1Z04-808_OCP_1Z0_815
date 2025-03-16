package Enthuware.Standart.test3;

public class test30 {
}
/**Identify the exceptions that will be received when the following code snippets are executed.
 *
 * 1. int factorial(int n){
 * if(n==1) return 1;
 * else return n*factorial(n-1);
 * } Assume that it is called with a very large integer.
 *
 * 2. void printMe(Object[] oa){
 * for(int i=0; i<=oa.length; i++)
 * System.out.println(oa[i]);
 * } Assume that it is called as such: printMe(null);
 *
 * 3. Object m1(){
 *  return new Object();
 *  }
 *  void m2(){
 *  String s = (String) m1();
 *  } Assume that method m2 is invoked.*/

/*
StackOverflowError
NullPointerException
ClassCastException*/

//Please read ExceptionClassSummary document in the "Study References" section.