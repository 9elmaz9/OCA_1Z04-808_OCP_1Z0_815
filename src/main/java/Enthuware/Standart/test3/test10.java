package Enthuware.Standart.test3;

public class test10 {
}

//You want to find out whether two strings are equal or not,  in terms of the actual characters within the strings. What is the best way to do this?

//use String's equals method.
/**For example:
 * String x1 = "a";
 * String x2 = new String("a");
 *
 *  x1.equals(x2) will return true. Because even though x1 and x2 are pointing to different objects, the content of the objects are same,
 *  which is what String's equals method checks.
 *
 * x1 == x2 will return false, because == only checks if the two references are pointing to the same object or not. In this case, they are not.*/