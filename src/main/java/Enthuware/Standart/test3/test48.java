package Enthuware.Standart.test3;

public class test48 {
}
/**What will the following code print when compiled and run?

 class Base{
 void methodA(){
 System.out.println("base - MethodA");
 }
 }

 class Sub extends Base{
 public void methodA(){
 System.out.println("sub - MethodA");
 }
 public void methodB(){
 System.out.println("sub - MethodB");
 }
 public static void main(String args[]){
 Base b=new Sub(); //1
 b.methodA(); //2
 b.methodB(); //3
 }
 }*/

//Compile time error at //3
/**The point to understand here is, b is declared to be a reference of class Base and methodB() is not defined in Base.
 * So the compiler cannot accept the statement b.methodB() because it only verifies the validity of a call by looking
 * at the declared class of the reference. For example, the compiler is able to verify that b.methodA() is a valid call
 * because class Base has method methodA. But it does not "bind" the call. Call binding is done at runtime by the jvm and
 * the jvm looks for the actual class of object referenced by the variable before invoking the method.*/

