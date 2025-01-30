package Enthuware.Standart.test1;

public class test_18 {
}
/**Consider the following interface definition:
 * interface Bozo{
 *  int type = 0;
 *  public void jump(); }
 *  Now consider the following class: public class Type1Bozo implements Bozo{
 *  public Type1Bozo(){
 *  type = 1;
 *  }
 *  public void jump(){
 *  System.out.println("jumping..."+type);
 *  }
 *  public static void main(String[] args){
 *  Bozo b = new Type1Bozo();
 *  b.jump();
 *  }
 *  }
 *  What will the program print when compiled and run?
 * */

//This program will not compile.

/*Fields defined in an interface are ALWAYS considered as public, static, and final. Even if you don't explicitly define them as such. In fact, you cannot even declare a field to be private or protected in an interface. Therefore, you cannot assign any value to 'type' outside the interface definition. */
