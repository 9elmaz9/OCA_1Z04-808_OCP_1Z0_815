package Enthuware.Standart.eight;

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

