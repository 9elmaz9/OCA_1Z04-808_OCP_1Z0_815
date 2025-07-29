package Enthuware.Standart.test8;

public class test38 {
}
/**Which of the following is/are valid double values for 10 million? (A million has 6 zeros)*/


//double d = 10_000_000;

/**Beginning with Java 7, you can include underscores in between the digits.
 * This helps in writing long numbers. For example, if you want to write 1 million,
 * you can write: 1_000_000, which is easier than 1000000 for humans to interpret.
 * Note that you cannot start or end a value with an underscore though.
 * Thus, 100_ or _100 are invalid values. _100 is actually a valid variable name!
 * You may use underscore for all kinds of numbers including long, double, float,
 * binary, as well as hex.
 * For example, the following are all valid numbers -
 * int hex = 0xCAFE_BABE;
 * float f = 9898_7878.333_333f;
 * int bin = 0b1111_0000_1100_1100;*/

/**Let's break down the options to understand which one correctly represents a valid double value for 10 million in Java.

 Explanation of double in Java:
 A double is a floating-point data type that can store large numbers and decimal values.
 In Java, you can write a double literal using either a decimal point or scientific notation.
 Commas or spaces are not allowed in numeric literals in Java, but you can use an underscore (_) as a separator in numeric literals (starting from Java 7).
 Options Analysis:
 double d = 10,000,000.0;

 Incorrect: In Java, you cannot use commas to separate digits. This will result in a compilation error.
 double d = 10-000-000;

 Incorrect: The - signs between digits will be interpreted as a subtraction operation, not as a valid number. This will lead to a compilation error.
 double d = 10_000_000;

 Correct: In Java, you can use underscores (_) as digit separators for readability (available from Java 7). This is a valid syntax for 10 million.
 double d = 10 000 000;

 Incorrect: Java does not allow spaces between digits in numeric literals. This will result in a compilation error.
 Correct Answer:
 double d = 10_000_000; is the correct option*/
