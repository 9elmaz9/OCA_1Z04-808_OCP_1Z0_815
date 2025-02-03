package Enthuware.Standart.test1;

public class test_33 {
}
/**What will the following code print when compiled and run?
 *  class StringWrapper {
 *  private String theVal;
 *  public StringWrapper(String str){ this.theVal = str; }
 *  } public class Tester{
 *  public static void main(String[] args) {
 *  StringWrapper sw = new StringWrapper("How are you?");
 *  StringBuilder sb = new StringBuilder("How are you?");
 *  System.out.println("Hello, "+sw);
 *  System.out.println("Hello, "+sb);
 *  } } */


//Hello, StringWrapper@<hashcode>
//Hello, How are you?


/*1. When one of the operands of the + operator is a String and other is an object (other than String),
toString method is called on the other operand and then both the Strings are concatenated to produce the result of the operation.
2. Object class contains an implementation of toString that returns the name of the class (including the package name)
and the hash code of the object in the format <classname>@<hashcode>. For example, System.out.println("Hello, "+new Object());
will print Hello, java.lang.Object@3cd1a2f1, where 3cd1a2f1 is the hash code of the object.
3. StringBuilder class provides its own implementation of toString method, which returns the String value of its contents.
In this question, StringWrapper class does not implement toString method and so Object class's version is used.*/