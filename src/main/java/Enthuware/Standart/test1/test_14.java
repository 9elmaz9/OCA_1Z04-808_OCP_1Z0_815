package Enthuware.Standart.test1;

public class test_14 {
}
/**Given the following code :

 public class TestClass {

 int[][] matrix = new int[2][3];

 int a[] = {1, 2, 3};
 int b[] = {4, 5, 6};

 public int compute(int x, int y){
 //1 : Insert Line of Code here
 }

 public void loadMatrix(){
 for(int x=0; x<matrix.length; x++){
 for(int y=0; y<matrix[x].length; y++){
 //2: Insert Line of Code here
 }
 }
 }
 }
 What can be inserted at //1 and //2?*/

/**
 return a[x]*b[y]; and matrix[x][y] = compute(x, y);*/

/*The correct syntax to access any element within an array is to use the square brackets - [ ]. Thus, to access the first element in an array, you would use array[0].  For a multi dimensional array, to reach an individual item, you need to specify index for each dimension. For example, since matrix is a two dimensional array, matrix is an array of array and matrix[0] will give you the first array of the arrays. matrix[0][0] will give you the first element of the first array of the arrays.*/