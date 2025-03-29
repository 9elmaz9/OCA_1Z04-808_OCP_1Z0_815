package Enthuware.Standart.test4;

public class test9 {
}
/**Consider the following program:
 *  public class TestClass{
 *  public static void main(String[] args){
 *  String tom = args[0];
 *  String dick = args[1];
 *  String harry = args[2];
 *  System.out.println(harry);
 *  } }
 *  What will be printed if the program is run using the command line:
 *  java TestClass 111 222 333*/



//333

//java and classname are not part of the args array. So tom gets "111", dick gets "222" and harry gets "333".
