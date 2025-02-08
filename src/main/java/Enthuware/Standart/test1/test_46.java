package Enthuware.Standart.test1;

public class test_46 {
}
/**You have a method that currently does not handle any exception thrown from the code contained in its method body.
 * You are now changing this method to call another method that throws IOException.  What changes, independent of each other, can you make to your method so that it will compile?*/


//Declare IOException in the throws clause of your method.


//Wrap the call to another method within a try-catch block that catches Exception.
//Since IOException is an Exception, you can catch it with a catch block that catches Exception.