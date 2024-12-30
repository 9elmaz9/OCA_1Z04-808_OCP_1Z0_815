package Enthuware.Standart.one;

public class test11 {
}
/**
 *
 * Given:
 *
 *
 * package strings;
 * public class StringFromChar {
 *
 *     public static void main(String[] args) {
 *         String myStr = "good";
 *         char[] myCharArr = {'g', 'o', 'o', 'd' };
 *
 *         String newStr = null;
 *         for(char ch : myCharArr){
 *             newStr = newStr + ch;
 *         }
 *
 *         System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
 *
 *     }
 * }
 *
 * What will it print when compiled and run?*/
//false false

/*
* Since newStr is null at the beginning, the first iteration of the loop assigns "nullg" to newStr. Therefore, at the end of the loop, newStr is actually "nullgood". Had newStr been defined as String newStr = ""; then the program would have printed false for newStr == myStr because both the references are pointing to two different objects, and true for newStr.equals(myStr) because both the objects contain the exact same String. */