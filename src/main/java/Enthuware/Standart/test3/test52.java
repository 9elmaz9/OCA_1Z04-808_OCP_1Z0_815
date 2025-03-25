package Enthuware.Standart.test3;

public class test52 {
}
/**What will the following code print?

 int i = 1;
 int j = i++;
 if( (i==++j) | (i++ == j) ){
 i+=j;
 }
 System.out.println(i);*/

//5

/**This question is based on 2 concepts:  1. i == ++j is not same as i == j++; In the case of i == ++j, j is first incremented and then compared with i.
 * While in the case of i == j++;, j is first compared with i and then incremented.  2. The | operator, when applied for boolean operands,
 * ensures that both the sides are evaluated. This is opposed to || which does not evaluate the Right Hand Side if the result can be
 * known by just evaluating the Left Hand Side.  Now, let us see the values of i and j at each step:  int i = 1;*/

