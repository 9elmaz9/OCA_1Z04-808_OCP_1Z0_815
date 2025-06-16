package Enthuware.Standart.test7;

public class test40 {
}

/**Given the following code:
 *  class M { } class N{
 *  private M m = new M();
 *  public void makeItNull(M pM){
 *  pM = null;
 *   }
 *  public void makeThisNull(){
 *  makeItNull(m);
 *   }
 *  public static void main(String[] args){
 *  N n = new N();
 *  n.makeThisNull();
 *     }
 *   }
 *  Which of the following statements are correct?*/

//There are no instances of M to be garbage collected till the program ends.

/**The official exam objectives now explicitly mention Garbage collection. All you need to know is:

 1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
 2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();*/