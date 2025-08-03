package unique_test_1;

public class test5 {
}

/**Consider the following class :

 public class Parser{
 public static void main( String[] args){
 try{
 int i = 0;
 i =  Integer.parseInt( args[0] );
 }
 catch(NumberFormatException e){
 System.out.println("Problem in " + i );
 }
 }
 }
 What will happen if it is run with the following command line:
 java Parser one*/

//It will not even compile.
//Because 'i' is defined in try block and so it is not visible in the catch block.


