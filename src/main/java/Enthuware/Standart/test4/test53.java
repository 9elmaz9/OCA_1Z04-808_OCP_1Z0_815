package Enthuware.Standart.test4;

public class test53 {
}
/**What will the following program print when run?
 * class Super{   public String toString(){
 * return "4";
 * } }
 * public class SubClass extends Super{
 * public String toString(){
 return super.toString()+"3";
 *  }
 *  public static void main(String[] args){
 *  System.out.println( new SubClass() );
 *  } */

//43

/**This is quite simple, toString() is called on the Object of class SubClass. Subclass's toString() calls super
 * class's toString() which returns String 4 (not an integer 4!). It then appends "3" to it. So the final value is "43".*/
