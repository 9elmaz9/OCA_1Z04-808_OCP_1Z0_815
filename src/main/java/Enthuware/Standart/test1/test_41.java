package Enthuware.Standart.test1;

public class test_41 {
}
/**Consider the following class hierarchy shown in the image.
 * (B1 and B2 are subclasses of A and C1, C2 are subclasses of B1)  Assume that method public void m1(){ ... }
 * is defined in all of these classes EXCEPT B1 and C1.  Assume that "objectOfXX" means a variable that points to an object of class XX.
 * So, objectOfC1 means a reference variable that is pointing to an object of class C1.  Which of the following statements are correct?*/


//objectOfC1.m1(); will cause A's m1() to be called.

//C1 will inherit B1's m1() which in turn inherits m1() from A.