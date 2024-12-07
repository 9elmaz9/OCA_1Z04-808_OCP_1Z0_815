package Enthuware.Standart;

public class Test14 {
}

/**
 * 1. while (false) { x = 3; }
 * Analysis: while(false) is a compile-time constant condition that makes the loop body unreachable.
 * Java Rule: Unreachable code in loops causes a compile-time error in Java.
 * Compilation: Does not compile.
 * 2. if (false) { x = 3; }
 * Analysis: In if(false), the block is unreachable, but Java allows unreachable code in if statements.
 * Compilation: Compiles successfully.
 * 3. do { x = 3; } while (false);
 * Analysis: A do-while loop always executes the body once before evaluating the condition, so it is not unreachable.
 * Compilation: Compiles successfully.
 * 4. for (int i = 0; i < 0; i++) x = 3;
 * Analysis: A for loop with a condition i < 0 will never execute, but it is syntactically valid.
 * Compilation: Compiles successfully.
 * Final Answer:
 * The three snippets that compile successfully are:
 *
 * if (false) { x = 3; }
 * do { x = 3; } while (false);
 * for (int i = 0; i < 0; i++) x = 3;
 * Correct Answer:
 * These are the three options you should select!
 */
