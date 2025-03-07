package Enthuware.Standart.test1;

public class test_55 {
}
//Which of the following are true about the enhanced for loop?

//It can iterate over an array or a Collection but not a Map.
/*An enhanced for loop needs either an array or an object of a class that implements java.lang.Iterable.
Map does not implement Iterable, though you can use keySet() or values() methods to get a Collection (which extends Iterable) and then iterate over that Collection.*/

//Using an enhanced for loop prevents the code from going into an infinite loop.
/*Since there is no explicit condition check written in the code, it provides less opportunity to write code that causes infinite loop.*/

//You cannot find out the number of the current iteration while iterating.
/**Unlike in a regular for loop, there is no iteration variable available in an enhanced for loop, so it is not possible to determine the number of the iteration just by using the enhanced for loop.
 * You will need to do something like:
 * int i = 0;
 * for(Object obj : collectionOrArray){
 * System.out.println("Iteration number = "+i+" Object = "+obj);
 * i++; */

