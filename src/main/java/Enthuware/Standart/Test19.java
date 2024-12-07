package Enthuware.Standart;

public class Test19 {
}

/*
What will the following code print?
void crazyLoop(){
    int c = 0;
    JACK: while (c < 8){
        JILL: System.out.println(c);
        if (c > 3) break JILL; else c++;
    }
}*/

/**
 * Code Explanation:
 * The code contains two labeled loops: JACK (outer loop) and JILL (inner loop). Here's the breakdown:
 *
 * int c = 0;:
 *
 * Variable c starts at 0.
 * JACK: while (c < 8):
 *
 * This is the outer loop that continues until c is less than 8.
 * Inside the loop:
 *
 * System.out.println(c);:
 * Prints the current value of c.
 * if (c > 3) break JILL; else c++;:
 * If c > 3, the program attempts to break the JILL loop.
 * However, JILL is not a valid labeled loop; it's just a label, not a loop structure.
 * This causes a compilation error because break is referencing an invalid loop.
 * Correct Answer:
 * It will not compile.
 *
 * The error is due to the invalid use of the break JILL; statement*/
