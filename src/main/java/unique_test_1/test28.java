package unique_test_1;

public class test28 {
}
/**Consider :

 class A {  public void perform_work(){}  }
 class B extends A {  public void perform_work(){}  }
 class C extends B {  public void perform_work(){}  }
 How can you let perform_work() method of A to be called from an instance method in C?*/

/**It is not possible.*/

/**The method in C needs to call a method in a superclass two levels up. But super is a keyword and not an attribute so super.super.perform_work( ) strategy will not work. There is no way to go more than one level up for methods. Remember that this problem doesn't occur for instance variables because variable are never overridden. They are hidden (by instance variables of a subclass) or shadowed (by local variables or method parameters of a method). So to access any of the super class's variable, you must unhide it using a cast.
 *  For example, ((A) c).data; This will give you the data variable defined in A even if it is hidden in B as well as in C.*/