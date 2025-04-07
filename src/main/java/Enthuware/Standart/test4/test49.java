package Enthuware.Standart.test4;

public class test49 {
}
//    Which of the following are valid code fragments:

//new Object[]{ "aaa", new Object(), new ArrayList(), 10};

//10 is a primitive and not an Object but due to auto-boxing it will be converted into an Integer object and that object will then be stored into the array of Objects.


//new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
//Every array is an Object so new String[]{""} is also an Object and can be placed in an array of objects.

/**1. An array of objects can store Objects of any class.
 2. Primitives (i.e. int, byte, char, short, boolean, long, double, and float) are NOT objects.
 3. An array (of primitives as well as of objects) is an Object.*/