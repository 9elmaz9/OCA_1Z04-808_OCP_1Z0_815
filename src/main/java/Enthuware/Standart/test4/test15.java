package Enthuware.Standart.test4;

public class test15 {
}

/**What will the following program print?

 public class TestClass{
 public static void main(String[] args){
 for : for(int i = 0; i< 10; i++){
 for (int j = 0; j< 10; j++){
 if ( i+ j > 10 )  break for;
 }
 System.out.println( "hello");
 }
 }
 }*/


//It will not compile.

/**Note that for is a keyword and so cannot be used as a label. But you can use any other identifier as a label. For example, The following code is valid even though String is a class name and String is also used as an identifier!
 String String = "";   //This is valid.
 String : for(int i = 0; i< 10; i++) //This is valid too!
 {
 for (int j = 0; j< 10; j++){
 if ( i+ j > 10 )  break String;
 }
 System.out.println( "hello");
 }
 It will print hello 2 times.*/