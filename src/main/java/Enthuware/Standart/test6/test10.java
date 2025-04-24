package Enthuware.Standart.test6;

public class test10 {
}
/**What will the following program print?
 *  public class TestClass{
 *  static String str = "Hello World";
 *  public static void changeIt(String s){
 *  s = "Good bye world";
 *  }
 *  public static void main(String[] args){
 *  changeIt(str);
 *  System.out.println(str);
 *  } }*/


//"Hello World"


/**Theoretically, java supports Pass by Value for everything ( i.e. primitives as well as Objects).
 * Remember that:
 * 1. Primitives are always passed by value.
 * 2. Object "references" are passed by value. So it looks like the object is passed by reference but actually it is the value of the reference that is passed.
 * An example:
 * Object o1 = new Object();
 * Let us say, this object is stored at memory location 15000.Since o1 actually stores just the address of the memory location where the object is stored, it contains 15000.
 * Now, when you call someMethod(o1); the value 15000 is passed to the method.
 * Therefore, this is what happens inside the method someMethod():
 * someMethod( Object localVar) {  localVar now contains 15000, which means localVar also points to the same memory location where the object is stored.
 * Therefore, when you call a method on localVar, it will be executed on the same object.  However, when you change the value of localVar itself, for example,
 * if you do localVar=null,then localVar starts pointing to a different memory location. But the original variable o1 still contains 15000 so it still points to the same object. }
 *  If you need even more detailed explanation, please check http://www.javaranch.com/campfire/StoryPassBy.jsp*/