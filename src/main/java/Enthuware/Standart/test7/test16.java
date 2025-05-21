package Enthuware.Standart.test7;

public class test16 {
}
/**Which of the following class definitions is/are legal definition(s) of a class that cannot be instantiated?
 class Automobile{
 abstract void honk();  //(1)
 }

 abstract class Automobile{
 void honk();   //(2)
 }

 abstract class Automobile{
 void honk(){};   //(3)
 }

 abstract class Automobile{
 abstract void honk(){}   //(4)
 }

 abstract class Automobile{
 abstract void honk();   //(5)
 }*/

//3
//This is a valid abstract class although it doesn't have any abstract method.

//5
//This is a valid abstract class

/**Here are some points to remember:
 * A class is uninstantiable if the class is declared abstract.
 * If a method has been declared as abstract, it cannot provide an implementation
 * (i.e. it cannot have a method body ) and the class containing that method must be declared abstract).
 * If a method is not declared abstract, it must provide a method body (the class can be abstract but not necessarily so).
 * If any method in a class is declared abstract, then the whole class must be declared abstract.
 *  An class can still be made abstract even if it has no abstract method.*/