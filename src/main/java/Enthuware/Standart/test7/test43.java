package Enthuware.Standart.test7;

public class test43 {
}
/**Consider the code shown below:

 public class TestClass{
 public static int switchTest(int k){
 int j = 1;
 switch(k){
 case 1: j++;
 case 2: j++;
 case 3: j++;
 case 4: j++;
 case 5: j++;
 default : j++;
 }
 return j + k;
 }
 public static void main(String[] args){
 System.out.println( switchTest(4) );
 }
 }
 What will it print when compiled and run?*/


//8

/**The control in the case falls through till reaches the break statement.
 Here, switch(4) will take the control to case 4:.
 Now since there is no break statement, all the statements till the end will be executed.
 So j will be incremented 3 time making it 4. finally 4 + 4 i.e. 8 will be returned.*/