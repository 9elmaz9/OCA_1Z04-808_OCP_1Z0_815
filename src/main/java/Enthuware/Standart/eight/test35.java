package Enthuware.Standart.eight;

public class test35 {
}
/**Consider the following code:
 *  public class Logger{
 *  private StringBuilder sb = new StringBuilder();
 *  public void logMsg(String location, String message){
 *  sb.append(location);
 *  sb.append("-");
 *  sb.append(message);
 *  }
 *  public void dumpLog(){
 *
 *  System.out.println(sb.toString());     //Empty the contents of sb here
 *  }
 *  }
 *  Which of the following options will empty the contents of the StringBuilder
 *  referred to by variable sb in method dumpLog()?*/


//sb.delete(0, sb.length());

/**public StringBuilder delete(int start, int end) Removes the characters in a substring of this sequence.
 *  The substring begins at the specified start and extends to the character at index end - 1 or to the end of
 *  the sequence if no such character exists. If start is equal to end, no changes are made.
 *  Parameters: start - The beginning index, inclusive. end - The ending index, exclusive. Returns: This object.
 * Throws: StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.*/

/**Options for Emptying the StringBuilder:
 sb.delete(0, sb.length());

 Correct: The delete(int start, int end) method removes the characters from the StringBuilder between the specified indices. Here, 0 is the starting index, and sb.length() represents the length of the StringBuilder, effectively removing all characters from the StringBuilder.
 This will empty the StringBuilder.
 sb.clear();

 Incorrect: The StringBuilder class does not have a clear() method. This would result in a compilation error.
 sb.empty();

 Incorrect: There is no empty() method in the StringBuilder class. This would result in a compilation error.
 sb.removeAll();

 Incorrect: The StringBuilder class does not have a removeAll() method. This would result in a compilation error.
 sb.deleteAll();

 Incorrect: There is no deleteAll() method in the StringBuilder class. This would result in a compilation error.
 Correct Answer:
 sb.delete(0, sb.length()); is the correct option to empty the contents of StringBuilder.
 */