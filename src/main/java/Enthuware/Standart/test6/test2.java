package Enthuware.Standart.test6;

public class test2 {
}
/**Consider the following code:
 *  interface Bar{
 *  void bar();
 *  }
 *  abstract class FooBase{
 *  public static void bar(){
 *  System.out.println("In static bar");
 *  }
 *  }
 *  public class Foo extends FooBase implements Bar
 *  {
 *
 *   }
 *
 *   What can be done to the above code so that it will compile without any error?*/

//Neither of the two approaches presented above will work.

/*The problem with the code is that since Foo extends FooBase, Foo gets the static method bar() from FooBase in its scope
and since Foo also says it implements Bar interface, it needs to have an instance method bar() with the same signature.
 This causes a conflict. A class cannot have two methods with the same signature in its scope where one is static and one is instance.
 Therefore, class Foo cannot be a subclass of FooBase and implement Bar at the same time.  Making the bar method in Bar interface
 a default method will not help either.Because even though class Foo will not need have a definition of the bar method in Foo class itself,
 it will inherit that method from the Bar interface and the same conflict will occur.  One way to fix the problem is to make the static bar method
 in class FooBase private. In this case, class Foo will not have this method in its scope and will therefore be free to implement an instance method with the same signature.*/