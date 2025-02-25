package Enthuware.Standart.test2;

public class test14 {
}
/**Which of the following code snippets will compile without any errors? (Assume that the statement int x = 0; exists prior to the statements below.)*/


//if (false) { x=3; }


//do{ x = 3; } while(false);

/*In a do- while, the block is ALWAYS executed at least once because the condition check is done after the block is executed.
 Unlike a while loop, where the condition is checked before the execution of the block.*
 */


//for( int i = 0; i< 0; i++) x = 3;

/**while (false) { x=3; } is a compile-time error because the statement x=3; is not reachable; Similarly, for( int i = 0; false; i++) x = 3;
 * is also a compile time error because x= 3 is unreachable.  In if(false){ x=3; }, although the body of the condition is unreachable,
 * this is not an error because the JLS explicitly defines this as an exception to the rule.
 * It allows this construct to support optimizations through the conditional compilation.
 * For example,  if(DEBUG){ System.out.println("beginning task 1"); }
 * Here, the DEBUG variable can be set to false in the code while generating the production version of the class file,
 * which will allow the compiler to optimize the code by removing the whole if statement entirely from the class file.*/


/**1. while (false) { x = 3; }
 Analysis: while(false) is a compile-time constant condition that makes the loop body unreachable.
 Java Rule: Unreachable code in loops causes a compile-time error in Java.
 Compilation: Does not compile.
 2. if (false) { x = 3; }
 Analysis: In if(false), the block is unreachable, but Java allows unreachable code in if statements.
 Compilation: Compiles successfully.
 3. do { x = 3; } while (false);
 Analysis: A do-while loop always executes the body once before evaluating the condition, so it is not unreachable.
 Compilation: Compiles successfully.
 4. for (int i = 0; i < 0; i++) x = 3;
 Analysis: A for loop with a condition i < 0 will never execute, but it is syntactically valid.
 Compilation: Compiles successfully.
 Final Answer:
 The three snippets that compile successfully are:

 if (false) { x = 3; }
 do { x = 3; } while (false);
 for (int i = 0; i < 0; i++) x = 3;
 Correct Answer:
 These are the three options you should select!*/
