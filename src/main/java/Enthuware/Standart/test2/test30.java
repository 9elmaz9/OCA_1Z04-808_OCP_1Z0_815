package Enthuware.Standart.test2;

public class test30 {
}

/**What will be the result of attempting to compile the following program?

 public class TestClass{
 long l1;
 public void TestClass(long pLong) { l1 = pLong ; }  //(1)
 public static void main(String args[]){
 TestClass a, b ;
 a = new TestClass();  //(2)
 b = new TestClass(5);  //(3)
 }
 }*/

//A compilation error will be encountered at (3).
//Because (1) is a method and not a constructor. So there is no constructor that take a parameter.

/*The declaration at (1) declares a method, not a constructor because it has a return value.
The method happens to have the same name as the class, but that is ok.
 The class has an implicit default constructor since the class contains no constructor declarations. This allows the instantiation at (2) to work.*/

