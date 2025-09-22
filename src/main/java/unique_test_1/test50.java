package unique_test_1;

public class test50 {
}
/**
 A new Java programmer has written the following method that takes an array of integers and sums up all the integers that are less than 100.


 public void processArray(int[] values){
 int sum = 0;
 int i = 0;
 try{
 while(values[i]<100){
 sum = sum +values[i];
 i++;
 }
 }
 catch(Exception e){ /* Ignore  }
        System.out.println("sum = "+sum);
        }

        Which of the following are best practices to improve this code?*/

//Use ArrayIndexOutOfBoundsException for the catch argument.
/**The intention of the code is to keep iterating the while loop as long as there are elements
 *  in the values array. Every iteration increments the index i and once i becomes equal to the
 *  length of the values array, values[i] will throw an ArrayIndexOutOfBoundsException, thereby
 *  ending the loop.  Since the code depends on the raising of an ArrayIndexOutOfBoundsException,
 *  that is the exception class that should be used in the catch block. Raising of
 *  an ArrayIndexOutOfBoundsException is not really an exceptional situation for this code.
 *  Therefore, there is no need to log it.  The code does not expect any other class of exception
 *  to be raised during the execution and therefore, if any exception other than ArrayIndexOutOfBoundsException
 *  is raised, that will truely be an exceptional situation. Such an exception should either not be caught
 *  at all (i.e. declared in the throws clause) or if the code catches any such exception,
 *  then it should at least be logged*/

//Use flow control to terminate the loop.
/**It is considered a bad practice to use exceptions to control the flow of execution.
 * In this case, values[i] will throw an ArrayIndexOutOfBoundsException once it goes
 * beyond the array length and the programmer is using this fact to control the loop. Instead of doing this,
 * the programmer should use something like: for(int i=0; i<values.length; i++) to control the execution of the loop.*/