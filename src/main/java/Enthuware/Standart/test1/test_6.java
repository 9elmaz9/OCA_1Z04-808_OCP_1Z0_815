package Enthuware.Standart.test1;

public class test_6 {
}
/**What will be the result of attempting to compile and run the following class?
 * public class TestClass{
 *  public static void main(String args[ ] ){
 *  int i, j, k;
 *  i = j = k = 9;
 *  System.out.println(i);
 *  } }*/


//The code will compile correctly and will display '9' when run.

//All the variables will get a value of 9.

/**Every expression has a value, in this case the value of the expression is the value that is assigned
 * to the right hand side of the equation. k has a value of 9 which is assigned to j and then to i.
 * Another implication of this is : boolean b = false; if( b = true) { System.out.println("TRUE");}
 * The above code is valid and will print TRUE. Because b = true has a boolean value, which is what an if statement expects.
 * Note that if( i = 5) { ... } is not valid because the value of the expression i = 5 is an int (5) and not a boolean.*/