package Enthuware.Standart.test1;

public class test_45 {
}
/**What will be the result of compiling and running the following code?

 class Base{
 public short getValue(){ return 1; } //1
 }
 class Base2 extends Base{
 public byte getValue(){ return 2; } //2
 }
 public class TestClass{
 public static void main(String[] args){
 Base b = new Base2();
 System.out.println(b.getValue()); //3
 }
 }*/

//Compile time error at //2

/*In case of overriding, the return type of the overriding method must match exactly to the return type of the overridden method if the return type is a primitive.
(In case of objects, the return type of the overriding method may be a subclass of the return type of the overridden method.)*/