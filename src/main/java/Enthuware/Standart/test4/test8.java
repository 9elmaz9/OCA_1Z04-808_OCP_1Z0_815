package Enthuware.Standart.test4;

public class test8 {
}
/**The options below contain the complete contents of a file. Which of these options can be run with the following command line once compiled? java main*/

/**

 //in file main.java
 class anothermain{ public static void main(String[] args)
 { System.out.println("hello2");
 } }
 class main { public final static void main(String[] args)
 { System.out.println("hello");
 } }*/

/**Observe that there is no public class in file main.java. This is ok. It is not necessary for a java file to have a public class.
 *  The requirement is that if a class (or enum) is public then that class (or enum) must be defined in a file by the same name and
 *  that there can be only one public class (or enum) in a file.  class main's main method will be executed. final is a valid modifier
 *  for the standard main method.  Note that final means a method cannot be overridden. Although static methods can never be overridden
 *  (they can be hidden),
 * making a static method final prevents the subclass from implementing the same static method.*/