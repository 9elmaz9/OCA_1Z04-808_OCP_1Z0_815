package Enthuware.Standart.test6;

public class test42 {
}
/**What will the following code print?
 *  String s = "blooper";
 *  StringBuilder sb = new StringBuilder(s);
 *  sb.append(s.substring(4)).delete(3, 5);
 *  System.out.println(sb);*/

//bloerper

/**Please read the following description of substring method of String and delete method of StringBuilder:
 * public String substring(int beginIndex) Returns a new string that is a substring of this string.
 * The substring begins with the character at the specified index and extends to the end of this string.
 * Examples: "unhappy".substring(2) returns "happy" "Harbison".substring(3) returns "bison" "emptiness".substring(9) returns "" (an empty string)
 * StringBuilder delete(int start, int end) Removes the characters in a substring of this sequence.
 * The substring begins at the specified start and extends
 * to the character at index end - 1 or to the end of the sequence if no such character exists. If start is equal to end, no changes are made. */