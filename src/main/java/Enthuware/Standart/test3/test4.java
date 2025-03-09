package Enthuware.Standart.test3;

public class test4 {
}
/**Following is a supposedly robust method to parse an input for a float :

 public float parseFloat(String s){
 float f = 0.0f;
 try{
 f = Float.valueOf(s).floatValue();
 return f ;
 }
 catch(NumberFormatException nfe){
 System.out.println("Invalid input " + s);
 f = Float.NaN ;
 return f;
 }
 finally { System.out.println("finally");  }
 return f ;
 }
 Which of the following statements about the above method is/are true?*/

//The code will not compile.

//Note that the return statement after finally block is unreachable. Otherwise, if this line were not there, choices 1, 2, 3 are valid.
