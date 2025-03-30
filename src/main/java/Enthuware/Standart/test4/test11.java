package Enthuware.Standart.test4;

public class test11 {
}
/**Given the following program, which statement is true?
 * class SomeClass{    public static void main( String args[ ] ){
 * if (args.length == 0 ){
 *  System.out.println("no arguments") ;
 *  }
 *  else{
 *  System.out.println( args.length + " arguments") ;
 *  }    } }*/


//The program will print no arguments when called with zero arguments and 1 arguments when called with one argument.
//        The word java and class name are not a part of the argument list.


//When the program is called with no arguments, the args array will be of length zero. Unlike in C/C++, args[0] is not the name of the program or class.
// his is because the name of the class is always the same as defined in the java file.
// So there is no need for passing its name as an argument to main method.