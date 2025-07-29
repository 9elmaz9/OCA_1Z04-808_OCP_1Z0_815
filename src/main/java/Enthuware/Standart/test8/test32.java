package Enthuware.Standart.test8;

public class test32 {
}
/**Considering the following program, which of the options are true?
 *  public class FinallyTest{
 *  public static void main(String args[]){
 *  try{
 *  if (args.length == 0) return;
 *  else throw new Exception("Some Exception");
 *  }
 *  catch(Exception e){
 *  System.out.println("Exception in Main");
 *  }
 *  finally{
 *  System.out.println("The end");
 *  }    } }*/



//If run with no arguments, the program will only print 'The end'.


//If run with one argument, the program will print 'Exception in Main' and 'The end'.

/**Copy code
 public class FinallyTest {
 public static void main(String args[]) {
 try {
 if (args.length == 0)
 return;
 else
 throw new Exception("Some Exception");
 } catch (Exception e) {
 System.out.println("Exception in Main");
 } finally {
 System.out.println("The end");
 }
 }
 }
 Code Breakdown:
 When run with no arguments (args.length == 0):

 The if condition args.length == 0 is true, so the return statement is executed, which exits the main() method immediately. However, the finally block always runs, regardless of whether an exception is thrown or not.
 Output: The finally block prints "The end", and nothing else is printed because the return prevents further execution in the try block and catch block.
 When run with one argument (args.length == 1):

 The if condition args.length == 0 is false, so the program throws a new Exception("Some Exception").
 The catch block catches the exception and prints "Exception in Main".
 The finally block runs and prints "The end".
 Output: "Exception in Main" and "The end" are printed.
 Evaluation of the Options:
 If run with no arguments, the program will only print 'The end'.

 Correct: When no arguments are provided, the program will print "The end" because the finally block always executes, and the return prevents other prints from the try block or catch block.
 If run with one argument, the program will only print 'The end'.

 Incorrect: With one argument, the exception is thrown, caught, and "Exception in Main" is printed along with "The end" from the finally block.
 If run with one argument, the program will print 'Exception in Main' and 'The end'.

 Correct: With one argument, the program will throw and catch the exception, printing "Exception in Main", followed by "The end" from the finally block.
 If run with no arguments, the program will not print anything.

 Incorrect: Even when no arguments are provided, "The end" will always be printed because the finally block is executed.
 If run with no arguments, the program will generate a stack trace on the console.

 Incorrect: No exception is thrown if no arguments are provided, so no stack trace will be generated.
 Correct Answers:
 If run with no arguments, the program will only print 'The end'.
 If run with one argument, the program will print 'Exception in Main' and 'The end'.*/