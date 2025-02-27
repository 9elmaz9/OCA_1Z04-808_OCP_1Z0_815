package Enthuware.Standart.test2;

public class test29 {
}
/**Identify the valid for loop constructs assuming the following declarations:

 Object o = null;
 Collection c = //valid collection object.
 int[][] ia = //valid array*/


//for(final Object o2 :c){ }
//final is the only modifier (excluding annotations) that is allowed here.



//for(int i : ia[0]){ }
//Since ia[0] is an array of ints, this is valid. (It may throw a NullPointerException or ArrayIndexOutOfBoundsException at runtime if ia is not appropriately initialized.)
