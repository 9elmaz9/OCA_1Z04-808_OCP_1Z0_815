package Enthuware.Standart.test5;

public class test12 {
}

/**Given the following code, which method declarations can be inserted at line 1 without any problems?

 public class OverloadTest{
 public int sum(int i1, int i2) { return i1 + i2; }
 // 1
 }*/


//public int sum(long i1, long i2) { return (int) i1; }

//public int sum(int i1, long i2) { return (int) i2; }


//public long sum(long i1, int i2) { return i1 + i2; }

/**The rule is that you cannot have methods that create ambiguity for the compiler in a class. It is illegal for a class to have two methods having same name and having same type of input parameters in the same order.
 Name of the input variables and return type of the method are not looked into.
 1. Option 1 is wrong because, then both the methods will be same (as their method name and the class/type and order of the input parameters will be same). So this amounts to duplicate method which is not allowed.
 As mentioned, name of the input parameters does not matter. Only the type of parameters and their order matters.
 2. 2 is valid because the type of input parameters are different. So this is a different method and does not amount to duplication.
 3 and 4 are valid for the same reason
 5 is not valid because it leads to duplicate method(as their method name and the class/type and order of the input parameters will be same). Note that as mentioned in the comments, return type does not matter.*/

