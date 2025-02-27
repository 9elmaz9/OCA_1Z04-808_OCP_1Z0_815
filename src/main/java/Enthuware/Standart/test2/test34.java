package Enthuware.Standart.test2;

public class test34 {
}
/*Which lines contain a valid constructor in the following code?

public class TestClass{
   public TestClass(int a, int b) { } // 1
   public void TestClass(int a) { }   // 2
   public TestClass(String s); // 3
   private TestClass(String s, int a) { }     //4
   public TestClass(String s1, String s2) { }; //5
}*/

//Line // 1

//Line // 4
/*You may apply public, private, and protected modifiers to a constructor.
But not static, final, synchronized, native and abstract. It can also be package private i.e. without any access modifier*/

//Line // 5
//The compiler ignores the extra semi-colon.



//It is interesting to note that public void TestClass(int a) {} // 2 will actually compile. It is not a constructor, but compiler considers it as a valid method!

