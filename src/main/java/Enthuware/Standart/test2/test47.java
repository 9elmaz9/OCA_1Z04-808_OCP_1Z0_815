package Enthuware.Standart.test2;

public class test47 {
}
/**Which of the following are features of Java?
 Some candidates have reported a similar question being asked with a slightly different (and ambiguous) wording:
 Which of the following are objected oriented features of Java?*/

//Every class belongs to a package.
/**This is true because as per Section 7.4.2 of JLS, "A compilation unit that has no package declaration is part of an unnamed package.
 * " Thus, if you omit the package statement, the class will belong to the unnamed package.
 * Remember that classes in the unnamed package are accessible only to other classes in the unnamed package.
 * It is not possible to import this unnamed package in classes that belong to a named package.*/


//A class may inherit from another class.