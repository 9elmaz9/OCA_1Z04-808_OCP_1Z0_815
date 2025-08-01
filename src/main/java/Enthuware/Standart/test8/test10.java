package Enthuware.Standart.test8;

public class test10 {
}
/**Assuming that the following method will always be called with a phone number in the format ddd-ddd-dddd
 *  (where d stands for a digit), what can be inserted at //1 so that it will return a String
 *  containing the same number except its last four digits will be masked with xxxx?
 *
 *  public static String hidePhone(String fullPhoneNumber){
 *  //1 Insert code here


// return new StringBuilder(fullPhoneNumber).substring(0, 8)+"xxxx";


// return new StringBuilder(fullPhoneNumber).replace(8, 12, "xxxx").toString();



// return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();


 /**This is a simple question if you know how the various methods of StringBuilder operate. You need to go through the JavaDoc API descriptions
 of the methods used in this question. This is important for the exam.
 The following are the details for your convenience - -------------------------- public StringBuilder append(CharSequence s,
 int start, int end) Appends a subsequence of the specified CharSequence to this sequence. Characters of the argument s
 starting at index start, are appended, in order, to the contents of this sequence up to the (exclusive) index end.
 The length of this sequence is increased by the value of end - start. Let n be the length of this character sequence
 just prior to execution of the append method. Then the character at index k in this character sequence becomes equal to
 the character at index k in this sequence, if k is less than n; otherwise, it is equal to the character at index k+start-n in the argument s.
 If s is null, then this method appends characters as if the s parameter was a sequence containing the four characters "null".*/

/**Parameters: s - the sequence to append. start - the starting index of the subsequence to be appended. end - the end index of the subsequence to be appended.  Returns: a reference to this object.  Throws: IndexOutOfBoundsException - if start is negative, or start is greater than end or end is greater than s.length()  --------------------------  public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) Inserts a subsequence of the specified CharSequence into this sequence. The subsequence of the argument s specified by start and end are inserted, in order, into this sequence at the specified destination offset, moving up any characters originally above that position. The length of this sequence is increased by end - start. The character at index k in this sequence becomes equal to: the character at index k in this sequence, if k is less than dstOffset the character at index k+start-dstOffset in the argument s, if k is greater than or equal to dstOffset but is less than dstOffset+end-start the character at index k-(end-start) in this sequence, if k is greater than or equal to dstOffset+end-start The dstOffset argument must be greater than or equal to 0, and less than or equal to the length of this sequence. The start argument must be nonnegative, and not greater than end. The end argument must be greater than or equal to start, and less than or equal to the length of s. If s is null, then this method inserts characters as if the s parameter was a sequence containing the four characters "null".  Parameters: dstOffset - the offset in this sequence. s - the sequence to be inserted. start - the starting index of the subsequence to be inserted. end - the end index of the subsequence to be inserted.  Returns: a reference to this object.  Throws: IndexOutOfBoundsException - if dstOffset is negative or greater  --------------------------  public StringBuilder replace(int start, int end, String str) Replaces the characters in a substring of this sequence with characters in the specified String. The substring begins at the specified start and extends to the character at index end - 1 or to the end of the sequence if no such character exists. First the characters in the substring are removed and then the specified String is inserted at start. (This sequence will be lengthened to accommodate the specified String if necessary.)  Parameters: start - The beginning index, inclusive. end - The ending index, exclusive. str - String that will replace previous contents.  Returns: This object.  Throws: StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.  --------------------------  public String substring(int start, int end) Returns a new String that contains a subsequence of characters currently contained in this sequence. The substring begins at the specified start and extends to the character at index end - 1.  Parameters: start - The beginning index, inclusive. end - The ending index, exclusive.  Returns: The new string.  Throws: StringIndexOutOfBoundsException - if start or end are negative or greater than length(), or start is greater than end. */