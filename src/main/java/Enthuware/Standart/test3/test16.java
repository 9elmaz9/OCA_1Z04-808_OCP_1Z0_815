package Enthuware.Standart.test3;

public class test16 {
}

/**What will the following program print when run?
 *  public class Operators{
 *  public static int operators(){
 *  int x1 = -4;
 *  int x2 = x1--;
 *  int x3 = ++x2;
 *  if(x2 > x3){
 *  --x3;
 *  }else{
 *  x1++;
 *  }
 *  return x1 + x2 + x3;
 *  }
 *  public static void main(String[] args) {
 *  System.out.println(operators());
 *  } }
 *  */

//-10

/*You will need to work out the values of the variables at each line on your worksheet to answer such questions.
x1 is -4
x2 is (x1)-- => x2 is first assigned the value of x1 i.e. -4 and then x1 in decremented by 1 to become -5
x3  is ++(x2) => x2 becomes -3 first and  then its value i.e. -3 is assigned to x3
x2>x3 is false so x1++  => x1 becomes -4

therefore -4 + -3 + -3 => -10.*/

