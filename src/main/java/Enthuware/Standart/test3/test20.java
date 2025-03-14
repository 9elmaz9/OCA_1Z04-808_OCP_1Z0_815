package Enthuware.Standart.test3;

public class test20 {
}
/**What will be the output of the following program (excluding the quotes)?
 *  public class SubstringTest{
 *  public static void main(String args[]){
 *  String String = "string isa string";
 *  System.out.println(String.substring(3, 6));
 *  } }*/

//None of the above.
//It will print 'ing'. (No space after 'g')

/**Remember, indexing always starts from 0.
 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"

 "01234".substring(1, 1) returns "". This shows that beginIndex and endIndex can be same.
 "01234".substring(1, 0) throws java.lang.StringIndexOutOfBoundsException. This shows that endIndex cannot be less than beginIndex.

 Parameters:
 beginIndex - the beginning index, inclusive.
 endIndex - the ending index, exclusive.
 Returns:
 the specified substring.
 Throws:
 IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.*/