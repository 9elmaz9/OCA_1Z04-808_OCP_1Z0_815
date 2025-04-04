package Enthuware.Standart.test2;

public class test46 {
}

/**Given:

 class StaticTest{

 void m1(){
 StaticTest.m2();  // 1
 m4();             // 2
 StaticTest.m3();  // 3
 }

 static void m2(){ }  // 4

 void m3(){
 m1();            // 5
 m2();            // 6
 StaticTest.m1(); // 7
 }

 static void m4(){ }
 }
 Which of the lines will fail to compile?*/

//3
//7

/**To call an instance method you need a reference that points to the object on which you want to call that method.
 *  Now, within an instance method a reference named "this" pointing to the current object is always available.
 *  So to call another instance method from within an instance method, you can either use the this reference
 *  explicitly (for example, you may call this.m3() from within m1) , or leave out the this reference altogether
 *  (for example, you can directly call m3() from within m1()) because the compiler automatically adds the "this." part implicitly.
 *  The "this" variable is available only within an instance method and not in static methods because static methods
 *  are not invoked within the context of an object of that class.  You can call a static method of a class
 *  from either a static or an instance method of the same class . No object reference is required.
 *  You can call it by using the name of the class or you can omit that as well. To call a static method of another class,
 *  you must use the name of the other class, for example OtherClass.staticMethod();  At //3, you are trying to call an
 *  instance method from another instance method. Therefore, you need to either specify an object reference or you can
 *  rely on this if you omit it. However, you cannot do StaticTest.m3() because StaticTest is not a valid
 *  reference that points to an object of class StaticTest.
 * Same thing happens at //7.*/
