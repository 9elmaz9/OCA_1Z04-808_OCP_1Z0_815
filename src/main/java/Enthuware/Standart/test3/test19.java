package Enthuware.Standart.test3;

public class test19 {
}
/**Given the following set of member declarations, which of the following is true?

 int a;    //  (1)
 static int a;    //  (2)
 int f( )   { return a; }    //  (3)
 static int f( ) { return a; }    //  (4)*/

//Declarations (1) and (4) cannot occur in the same class definition.
//because method f() is static and a is not.


//Declarations (1) and (2) cannot occur in the same class definition.
//variable names must be different.

/**Local variables can have same name as member variables. The local variables will simply shadow the member variables with the same names.
 Declaration (4) defines a static method that tries to access a variable named 'a' which is not locally declared.
 Since the method is static, this access will only be valid if variable 'a' is declared static within the class. Therefore declarations (1) and (4) cannot occur in the same definition.*/