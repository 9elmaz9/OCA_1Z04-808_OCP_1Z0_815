package Enthuware.Standart.test2;

public class test26 {
}
/**Given:
 *  public static boolean getBool(){
 *  return true;}
 *  public static String getString(){
 *  return "true";
 *  }
 *  public static void main(String args[]){
 *  switch( getBool() ){
 *  case true :
 *  System.out.println("true");
 *  break;
 *  default :
 *  System.out.println("none");
 *  break;
 *  }
 *  }
 *  What changes can be done so that it will print only true?*/


//Call getString instead of getBool in the switch and also change the case label from true to "true".
//Strings can be used in a switch.