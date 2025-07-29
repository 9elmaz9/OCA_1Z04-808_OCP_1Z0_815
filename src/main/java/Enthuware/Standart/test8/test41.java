package Enthuware.Standart.test8;

public class test41 {
}
/**The following are the complete contents of TestClass.java file. Which packages are automatically imported?
 *
 *  class TestClass{
 *  public static void main(String[] args){
 *  System.out.println("hello");
 *  } }*/

//java.lang

//The package with no name.

/**If there is no package statement in the source file,
 * the class is assumed to be created in an unnamed package that has no name.
 * In this case, all the types created in this package will be available to this class
 * without any import statement.  However, note that this unnamed package cannot be
 * imported in classes that belong to any other package at all, not even with any import statement.
 * So for example, if you have a class named SomeClass in package test, you cannot access TestClass defined
 * in the problem statement (as it belongs to the unnamed package) at all because there is no way to import it.
 * As per JLS Section 7.5: A type in an unnamed package has no canonical name, so the requirement for a canonical
 * name in every kind of import declaration implies that (a) types in an unnamed package cannot be imported,
 * and (b) static members of types in an unnamed package cannot be imported.
 */


