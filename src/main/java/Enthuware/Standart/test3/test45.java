package Enthuware.Standart.test3;

public class test45 {
}
//    Which of these statements concerning the charAt() method of the String class are true?


//    The charAt( ) method can take a char value as an argument.
//Yes, it can because it takes an int and char will be implicitly promoted to int.


//    The index of the first character is 0.

/**Since indexing starts with 0, the maximum value that you can pass to charAt is length-1.
 *  As per the API documentation for charAt, it throws IndexOutOfBoundsException if you pass an invalid value.
 *  Both - ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException, extend IndexOutOfBoundsException
 *  and although in practice, the charAt method throws StringIndexOutOfBoundsException,
 *  it is not a valid option because the implementation is free to throw some other exception as
 *  long as it is an IndexOutOfBoundsException. There are questions in the exam on this aspect.*/

