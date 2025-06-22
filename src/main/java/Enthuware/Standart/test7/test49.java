package Enthuware.Standart.test7;

public class test49 {
}
/**Given:  package abc;
 *
 * class Fruit{
 * int seeds;
 * String taste;
 * boolean edible;
 *  }
 *
 *
 * class TropicalFruit extends Fruit{
 * double weight;
 * TropicalFruit(){
 * seeds = 0;
 * taste = "sweet";
 * weight = 10.0;
 *   }
 *  }
 *
 *
 * class Banana extends TropicalFruit{
 * double calories;
 * Banana(){
 * seeds = 10;
 * weight = 20.0;
 * calories = 200;
 *   }
 *  }
 *
 *
 * public class TestClass {
 * public static void main(String[] args) {
 *  Banana b = new Banana();
 *  System.out.println(b.edible+" "+b.weight+" "+b.calories);
 *     }
 *   }
 *
 *
 *  Which constructor initializes Fruit's field edible?*/


//None of the constructors initialize Fruit's fruit edible.

/**Note: This is not a well written question but some candidates have reported getting similar question without the last option.
 *  As explained below, the last option is correct. But if this option is not available, the correct option is anybody's guess.
 *
 *  1. The "default" constructor for a class is provided by the compiler if a class does not declare any constructor explicitly.
 *  It does not take any argument and it does not contain any code except a call to super(). Thus, it does not initialize any field.
 *  Class Fruit does not declare any constructor explicitly, and so, it gets the default constructor from the compiler.
 *  However, it does not contain any code to initialize the fields of the Fruit class.
 *
 *  2. A class is free to provide a no-args constructor explicitly as well. This constructor may contain code to initialize
 *  its fields (as done by classes TropicaFruit and Banana).
 *
 *  3. All instance and static fields of a class are always initialized to their default values (integral types to 0, boolean to false,
 *  and reference types to null) by the JVM. Thus, even though there is no code that initializes the fields of the Fruit class,
 *  they are initilized by the JVM as soon as an instance of Fruit (or any of its subclasses) is created.
 *  Therefore, technically, none of the constructors given in the code or the default constructor of Fruit, initializes the Fruit's edible.*/