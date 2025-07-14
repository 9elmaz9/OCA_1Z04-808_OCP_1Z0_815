package Enthuware.Standart.eight;

public class test25 {
}
/**Given the following pairs of method declarations, which of the statements are true?
 *  1. void perform_work(int time){ } int  perform_work(int time, int speed){ return time*speed ;}
 *  2. void perform_work(int time){ } int  perform_work(int speed){return speed ;}
 *  3. void perform_work(int time){ } void Perform_work(int time){ }*/

//The first pair of methods will compile correctly and overload the method 'perform_work'.

//The second pair of methods will not compile correctly.

/**Overloading of a method occurs when the name of more than one methods is exactly same but the parameter lists are different.

 The first and the third pairs of methods will compile correctly as they follow the above stated rule.

 The second pair of methods will not compile correctly, since their method signatures are same and the compiler cannot differentiate between the two methods as it does not look for return type. Also, only name and input parameters are the part of method declaration . Names of the parameters don't matter.

 Both methods in the first pair are named perform_work but have different parameter list so they overload this method name i.e. perform_work.

 The method named 'perform_work' is distinct from the method named 'Perform_work', as identifiers in Java are case-sensitive.*/

/**Let's analyze the given pairs of method declarations to determine which statements are true.

 1. First pair of methods:
 java
 Copy code
 void perform_work(int time) { }
 int perform_work(int time, int speed) { return time * speed; }
 Method Overloading: These methods are valid for overloading because:
 The first method takes one parameter (int time), and the second one takes two parameters (int time, int speed).
 The method signatures differ in the number of parameters, which is a valid form of method overloading.
 Conclusion: The first pair of methods will compile correctly and overload the method perform_work because the method signatures are different (number of parameters).
 2. Second pair of methods:
 java
 Copy code
 void perform_work(int time) { }
 int perform_work(int speed) { return speed; }
 Method Overloading: These methods are not valid for overloading because:
 Both methods have the same method name (perform_work), but the parameter types (int time vs. int speed) do not provide enough distinction for overloading.
 The first method takes one parameter (int time), and the second one takes a single parameter as well (int speed), but their signatures are essentially the same because the types are not distinct enough for overloading (it's still a single int).
 Conclusion: The second pair of methods will not compile correctly because the methods are not distinguishable enough by their parameters.
 3. Third pair of methods:
 java
 Copy code
 void perform_work(int time) { }
 void Perform_work(int time) { }
 Method Overloading: This is not valid for overloading because:
 The only difference between these two methods is the case of the method name (perform_work vs. Perform_work).
 In Java, method names are case-sensitive, so perform_work and Perform_work are treated as two different methods. However, this is not valid overloading because overloading requires the methods to have different signatures, and Java doesn't consider the case of the method name to create valid overloading. Thus, you cannot have two methods in the same class with only a case difference.
 Conclusion: The third pair of methods will not compile correctly due to case sensitivity conflicts in method overloading.
 Correct answers:
 The first pair of methods will compile correctly and overload the method 'perform_work'.
 The second pair of methods will not compile correctly.*/
