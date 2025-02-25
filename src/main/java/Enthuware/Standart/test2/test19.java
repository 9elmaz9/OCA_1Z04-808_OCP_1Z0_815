package Enthuware.Standart.test2;

public class test19 {
}
/**What will the following code print?
 void crazyLoop(){
 int c = 0;
 JACK: while (c < 8){
 JILL: System.out.println(c);
 if (c > 3) break JILL; else c++;
 }
 }*/

//It will not compile.
/**Because break JILL; would be valid only when it is within the block of code under the scope of the label JILL.
 *  In this case, the scope of JILL extends only up till System.out.println(c); and break JILL; is out of the scope of the label.*/

/**Code Explanation:
 The code contains two labeled loops: JACK (outer loop) and JILL (inner loop). Here's the breakdown:

 int c = 0;:

 Variable c starts at 0.
 JACK: while (c < 8):

 This is the outer loop that continues until c is less than 8.
 Inside the loop:

 System.out.println(c);:
 Prints the current value of c.
 if (c > 3) break JILL; else c++;:
 If c > 3, the program attempts to break the JILL loop.
 However, JILL is not a valid labeled loop; it's just a label, not a loop structure.
 This causes a compilation error because break is referencing an invalid loop.
 Correct Answer:
 It will not compile.

 The error is due to the invalid use of the break JILL; statement*/