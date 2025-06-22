package Enthuware.Standart.test7;

public class test50 {
}

/**Given:
 *
 * String[][] matrix = new String[2][2];
 * matrix[0][0] = "petrol";
 * matrix[1][0] = "diesel";
 * matrix[0][1] = "manual";
 * matrix[1][1] = "auto";
 *
 * Which option will print petrol:diesel:manual:auto:?*/

/*
for(int i = 0; i<2; i++) {
for(int j = 0; j<2; j++){
System.out.print(matrix[j][i]+":");
     }
   }*/


/**Array indexing starts with 0.
 * Thus, the given code really creates the following array structure:
 * matrix ==>{ matrix[0] , matrix[1] }
 * matrix[0] ==>{ matrix[0][0],matrix[0][1]} ==> { "petrol", "manual"}
 * matrix[1] ==>{ matrix[1][0],matrix[1][1]} ==> { "diesel", "auto"}*/