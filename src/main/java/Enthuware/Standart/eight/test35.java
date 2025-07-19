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

