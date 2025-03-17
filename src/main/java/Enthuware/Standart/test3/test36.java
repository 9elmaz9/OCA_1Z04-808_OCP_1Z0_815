package Enthuware.Standart.test3;

public class test36 {
}
/**What is the result of compiling and running the following code ?
 *  public class TestClass{    static int si = 10;
 *  public static void main (String args[]){
 *  new TestClass();    }
 *  public TestClass(){
 *  System.out.println(this);
 *  }    public String toString(){
 *  return "TestClass.si = "+this.si;
 *  } }*/


//It will print TestClass.si = 10

/*The toString method for class Object returns a String consisting of the name of the class of which the object is an instance,
the at-sign character '@', and the unsigned hexadecimal representation of the hash code of the object.
In other words, this method returns a string equal to the value of: getClass().getName() + '@' + Integer.toHexString(hashCode())*/

