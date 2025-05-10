package Enthuware.Standart.test6;

public class test56 {
}
/**Consider the following lines of code:
 *
 *  boolean greenLight = true; boolean pedestrian = false;
 *  boolean rightTurn = true; boolean otherLane = false;
 *
 *  You can go ahead only if  the following expression evaluates to 'true' :
 *  (( (rightTurn && !pedestrian || otherLane)
 *  || ( ? && !pedestrian && greenLight ) )  == true )
 *
 *  What variables can you put in place of '?' so that you can go ahead?*/

//Any variable would do.

/**Observe that (rightTurn && !pedestrian || otherLane) is true, therefore ( ? && !pedestrian && greenLight ) does not matter.
 *  || and && are short circuit operators. So, if the first part of the expression ( i.e. part before || ) is true ( or false for && )
 *  the other part is not evaluated at all.  Note that this is not true for | and &.
 *  In that case, the whole expression will be evaluated even if the value of the expression can be known by just evaluating first part.*/