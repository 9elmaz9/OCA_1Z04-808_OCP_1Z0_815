package Enthuware.Standart.eight;

public class test43 {
}

/**Which of the following are true regarding overloading of a method?*/

/**If there is another method with the same name but with
 *  a different number of arguments in a class then that method can be called as overloaded.*/

/**What is Method Overloading?
 Method overloading in Java refers to having multiple methods in the same class with the same name but with different parameter lists (different number or types of parameters). This allows you to call the same method name with different arguments.

 Option Analysis:
 Option 1: "An overloading method must have a different parameter list and same return type as that of the overloaded method."

 Incorrect: While the parameter list must be different, the return type does not need to be the same for overloading. The return type is not considered when checking for overloaded methods. Overloading is determined by differences in the method signature, which includes method name, number, and types of parameters.
 Option 2: "If there is another method with the same name but with a different number of arguments in a class, then that method can be called as overloaded."

 Correct: This is the correct definition of method overloading. In Java, you can overload a method by changing the number or type of parameters (argument types). The return type is irrelevant for overloading.
 Option 3: "If there is another method with the same name and same number and type of arguments but with a different return type in a class, then that method can be called as overloaded."

 Incorrect: Method overloading is determined based on parameters (number, type, or order of parameters). If the method has the same name, same number, and type of arguments but a different return type, it does not constitute overloading because the method signature is still considered identical, which leads to a compile-time error.
 Option 4: "An overloaded method means a method with the same name and same number and same type of arguments exists in the super class and sub class."

 Incorrect: This is describing method overriding, not overloading. Method overloading occurs within the same class, whereas method overriding is when a subclass provides a specific implementation for a method that is already defined in its superclass.
 Conclusion:
 The correct option is:

 Option 2: "If there is another method with the same name but with a different number of arguments in a class, then that method can be called as overloaded."

 */