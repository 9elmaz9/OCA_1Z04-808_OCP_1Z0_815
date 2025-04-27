package Enthuware.Standart.test6;

public class test14 {
}
/**Consider the following hierarchy of Exception classes :
 *  java.lang.RuntimeException
 *  +---- IndexOutOfBoundsException
 *  +----ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
 *
 *  Which of the following statements are correct for a method that can throw ArrayIndexOutOfBounds
 *  as well as StringIndexOutOfBounds Exceptions but does not have try catch blocks to catch the same?*/


//It is ok if it declares just throws ArrayIndexOutOfBoundsException


//It is ok if it declares just throws IndexOutOfBoundsException

//It does not need to declare any throws clause.


//Note that both the exceptions are RuntimeExceptions so there is no need to catch these. But it is ok even if the method declares them explicitly.