package Enthuware.Standart.test6;

public class test37 {
}
/**Which of the following are valid declarations of the standard main method?*/


//final static public void main (String[ ] arguments ) { }


//public static void main (String[ ] args) { }

//A valid declaration of "the" main() method must be public and static, should return void, and should take a single array of Strings as a parameter.
// The order of the static and public keywords is irrelevant. But the return type should always come just before the method name.
// Applying final to the method does not change the method signature.  In some versions of JDK, even a private or protected main() method works from command line.
// However, for the purpose of Java Certification exam, it should be assumed that for the JVM to execute a class using the standard main method,
// the accessibility of the main method must be public.
