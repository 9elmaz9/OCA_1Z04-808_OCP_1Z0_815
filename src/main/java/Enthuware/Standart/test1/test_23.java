package Enthuware.Standart.test1;

public enum test_23 {
}

/**What will the following code print when compiled and run?
 class ABCD{
 int x = 10;
 static int y = 20;
 }
 class MNOP extends ABCD{
 int x = 30;
 static int y = 40;
 }

 public class TestClass {
 public static void main(String[] args) {
 System.out.println(new MNOP().x+", "+new MNOP().y);
 }
 }*/

//
//30, 40

/*Access to static and instance fields and static methods depends on the class of reference variable and not the actual object to which the variable points to.
Observe that this is opposite of what happens in the case of instance methods.In case of instance methods the method of the actual class of the object is called.
 Therefore, in case of System.out.println(new MNOP().x); the reference is of type MNOP and so MNOP's x will be accessed.  Had it been like this: ABCD a = new MNOP();
 System.out.println(a.x); System.out.println(a.y);
 ABCD's x and y would have been accessed because a is of type ABCD even though the actual object is of type MNOP.*/