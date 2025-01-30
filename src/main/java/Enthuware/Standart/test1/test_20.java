package Enthuware.Standart.test1;

public class test_20 {
}
/**What will the following code print?
 * String abc = "";
 *  abc.concat("abc");
 *  abc.concat("def");
 *  System.out.print(abc);
 *  */

//It will print empty string (or in other words, nothing).

//Strings are immutable so doing abc.concat("abc") will create a new string "abc" but will not affect the original string "".