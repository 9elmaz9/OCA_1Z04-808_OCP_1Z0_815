package Enthuware.Standart.test7;

public class test12 {
}

/**What will be the result of attempting to compile and run the following class?

 public class IfTest{
 public static void main(String args[]){
 if (true)
 if (false)
 System.out.println("True False");
 else
 System.out.println("True True");
 }
 }*/


//The code will compile correctly and will display True True.

/**This code can be rewritten as follows:
 public class IfTest{
 public static void main(String args[]) {
 if (true) {
 if (false) {
 System.out.println("True False");
 } else {
 System.out.println("True True");
 }
 }
 }
 }
 Notice how the last "else" is associated with the last "if" and not the first "if".
 Now, the first if condition returns true so the next 'if' will be executed.
 In the second 'if' the condition returns false so the else part will be evaluated which prints 'True True'.*/