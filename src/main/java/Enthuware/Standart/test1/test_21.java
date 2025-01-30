package Enthuware.Standart.test1;

public class test_21 {
}
/**What will be the result of compiling and running the following code?
 *
 * class Base{
 * public Object getValue(){
 * return new Object(); }
 * //1
 * }
 * class Base2 extends Base{
 * public String getValue(){
 * return "hello";
 * }
 * //2 }
 * public class TestClass{
 * public static void main(String[] args){
 * Base b = new Base2();
 * System.out.println(b.getValue());
 * //3
 * }
 * }
 * */


//It will print hello.

/*
It will print hello.
Covariant returns are allowed since Java 1.5, which means that an overriding method can change the return type to a subclass of the return type declared in the overridden method. But remember than covarient returns does not apply to primitives.*/