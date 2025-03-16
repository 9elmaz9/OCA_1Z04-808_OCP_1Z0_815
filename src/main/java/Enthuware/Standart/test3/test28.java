package Enthuware.Standart.test3;

public class test28 {
}
/**Consider the following classes in one file named A.java...
 *  abstract class A{
 *  protected int m1(){
 *  return 0;
 *  } }
 *  class B extends A{
 *  int m1(){
 *  return 1;
 *  } }
 *  Which of the following statements are correct...*/

//The code will not compile because class B does not override the method m1() correctly.
//The overriding method cannot decrease the accessibility.

/**The concept here is that an overriding method cannot make the overridden method more private.
 The access hierarchy in increasing levels of accessibility is:
 private->'no modifier'->protected->public ( public is accessible to all and private is accessible to none except itself.)
 Here, class B has no modifier for m1() so it is trying to reduce the accessibility of protected to default.
 'protected' means the method will be accessible to all the classes in the same package and all the subclasses (even if the subclass is in a different package).
 No modifier (which is the default level) means the method will be accessible only to all the classes in the same package. (i.e. not even to the subclass if the subclass is in a different package.)*/

