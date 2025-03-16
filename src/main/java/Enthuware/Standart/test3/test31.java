package Enthuware.Standart.test3;

public class test31 {
}

/**What will the following code print?
 * int i = 0;   int j = 1;
 * if( (i++ == 0) & (j++ == 2) ){
 * i = 12;
 * }
 * System.out.println(i+" "+j);*/

//1 2
/**The | and & operators, when applied to boolean operands, ensure that both the sides are evaluated. This is opposed to || and && operators,

which do not evaluate the Right Hand Side operand if the result can be known by just evaluating the Left Hand Side.
 Now, let us see the values of i and j at each step:  int i = 0; int j = 1; if( (i++ == 0) & (j++ == 2) )
 /* First, compare i with 0 and increment i, this comparison returns true and i becomes
 1. Now Evaluate next condition: compare j with 2 and increment j, this comparison return false and j becomes

2. true & false returns false so i = 12 is not executed. / { i = 12; } System.out.println(i+" "+j)); //print 1 and 2*/