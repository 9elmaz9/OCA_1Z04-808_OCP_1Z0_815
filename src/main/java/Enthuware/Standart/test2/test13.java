package Enthuware.Standart.test2;

public class test13 {
}
/**What will the following method return if called with an argument of 7?
 *  public int transformNumber(int n){
 *  int radix = 2;
 *  int output = 0;
 *  output += radix*n;
 *  radix = output/radix;
 *  if(output<14){
 *  return output;
 *  }else{
 *  output = output*radix/2;
 *  return output;
 *  }else {
 *  return output/2;
 *  }
 *  }*/

//Compilation fails.
//The if-else-else is invalid. It should be if , else if, else.