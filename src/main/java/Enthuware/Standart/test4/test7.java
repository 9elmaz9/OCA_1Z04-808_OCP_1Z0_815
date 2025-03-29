package Enthuware.Standart.test4;

public class test7 {
}
/**Which of the following are correct ways to initialize the static variables MAX and CLASS_GUID ?
 class Widget{
 static int MAX;     //1
 static final String CLASS_GUID;   // 2
 Widget(){
 //3
 }
 Widget(int k){
 //4
 }
 }*/


//Modify lines //1 and //2 as : static int MAX = 111; static final String CLASS_GUID = "XYZ123";
//You can initialize both the variables at declaration itself.


//Add the following line just after //2 : static {MAX = 111; CLASS_GUID = "XYZ123"; }
//Initializing the static variables in a static block ensures that they are initialized even when no instance of the class is created.

/**The rules are:
 *  1. static variables can be left without being explicitly initialized. (They will get default values).
 * 2. final variables must be explicitly initialized. Now, here CLASS_GUID is a 'static final' variable and not just final or static.
 * As static fields can be accessed even without creating an instance of the class, it is entirely possible that this field can be
 * accessed before even asingle instance is created. In this case, no constructor or non-static initializer had ever been called.
 * And so, the field (as it is final and so must be initialized explicitly) remains uninitialized. This causes the compiler to complain.
 *  Had CLASS_GUID been just a final variable, option 4 would work but as it is also static, it cannot wait till the constructor executes to be initialized.*/
