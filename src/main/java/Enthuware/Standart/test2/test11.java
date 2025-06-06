package Enthuware.Standart.test2;

public class test11 {
}
/**Consider the following class :
 *  public class Test{
 *  public static void main(String[] args){
 *  if (args[0].equals("open"))
 *  if (args[1].equals("someone"))
 *  System.out.println("Hello!");
 *  else System.out.println("Go away "+ args[1]);
 *  } }
 *  Which of the following statements are true if the above program is run with the command line :
 *  java Test closed*/

//It will end without exceptions and will print nothing.

/**As in C and C++, the Java if statement suffers from the so-called "dangling else problem," The problem is that both the outer if statement
 *  and the inner if statement might conceivably own the else clause. In this example, one might be tempted to assume that the programmer
 *  intended the else clause to belong to the outer if statement.  The Java language,
 *  like C and C++ and many languages before them, arbitrarily decree that an else clause belongs to the innermost
 *  if so as the first if() condition fails (args[0] not being "open") there is no else associated to execute. So, the program does nothing.
 *  The else actually is associated with the second if. So had the command line been : java Test open, it would have executed the second
 *  if and thrown ArrayIndexOutOfBoundsException.
 * If the command line had been: java Test open xyz, it would execute the else part(which is associated with the second if) and would have printed "Go away xyz".*/