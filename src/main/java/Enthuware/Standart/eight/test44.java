package Enthuware.Standart.eight;

public class test44 {
}
/**What will be the result of attempting to compile and run the following program?

 class TestClass{
 public static void main(String args[]){
 int i = 0;
 loop :         // 1
 {
 System.out.println("Loop Lable line");
 try{
 for (  ;  true ;  i++ ){
 if( i >5) break loop;       // 2
 }
 }
 catch(Exception e){
 System.out.println("Exception in loop.");
 }
 finally{
 System.out.println("In Finally");      // 3
 }
 }
 }
 }*/