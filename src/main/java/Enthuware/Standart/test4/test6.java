package Enthuware.Standart.test4;

public class test6 {
}

//Which of these expressions will return true?

//"hello world".equals("hello world")



//"HELLO world".equalsIgnoreCase("hello world")
//equalsIgnoreCase() method treats both cases (upper and lower) as same.


//"hello".concat(" world").trim().equals("hello world")
//"hello".concat(" world") will return "hello world" and trim() won't do any change because there is no space at the beginning or end of the string.


//"Hello world".toLowerCase( ).equals("hello world")
//toLowerCase() converts all uppercase letters to lower case.

/**compareTo() does a lexicographical (like a dictionary) comparison. It stops at the first place where the strings have different letters.
 If left hand side is bigger, it returns a positive number otherwise it returns a negative number. The value is equal to the difference of their unicode values.
 If there is no difference then it returns zero. In this case,  it will return ( 'h' - 'H') which is 32.*/