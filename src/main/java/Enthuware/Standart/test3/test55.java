package Enthuware.Standart.test3;

public class test55 {
}
/**Given:  double daaa[][][] = new double[3][][]; double d = 100.0; double[][] daa = new double[1][1];
 *  Which of the following statements can be added to the above code, independent of each other, without causing compilation or runtime errors?*/


//daaa[0] = daa;


//daa = daaa[0];

/**While assigning array objects to array references, you need to keep in mind the type as well as dimensions
 * of the array object and the array reference. They must be the same. For example, only a two dimensional
 * array object can be assigned to a reference whose type is a two dimensional array.  Also keep in mind that
 * an element of a multi-dimensional array is an array of one less number of dimensions of the same type.
 * For example, each element of a two dimensional array of doubles is a reference to a one dimensional array
 * of doubles. Every element of a one dimensional array, on the other hand, is not an array but just a variable
 * of the type of the array.  So, daa = daaa[0];
 * is valid because both are pointing to arrays of same dimension and type. and daa[0]0] = d; is valid because
 * both sides are variables of the same type i.e. double.*/
