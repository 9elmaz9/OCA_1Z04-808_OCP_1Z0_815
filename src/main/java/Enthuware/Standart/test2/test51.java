package Enthuware.Standart.test2;

public class test51 {
}
/**When is the Object created at line //1 eligible for garbage collection?
 *  public class TestClass{
 *  public Object getObject(){
 *  Object obj = new String("aaaaa");   //1
 *  Object objArr[] = new Object[1]; //2
 *  objArr[0] = obj; //3
 *  obj = null;      //4
 *  objArr[0] = null;//5
 *  return obj;      //6
 *  } }*/

//Just after line 5.

/*The official exam objectives now explicitly mention Garbage collection.All you need to know is:
 1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
 2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
  After line
   3, both, obj and objArr[0] are pointing to the same String object. After line
   4, obj points to null but objArr[0] is still pointing to the String object. After line
   5, objArr[0] also starts pointing to null so there is no reference left that is pointing to the String object. So it is now available for Garbage collection.*/
