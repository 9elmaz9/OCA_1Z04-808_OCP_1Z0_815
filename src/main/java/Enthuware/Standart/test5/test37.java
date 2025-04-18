package Enthuware.Standart.test5;

public class test37 {
}
/**What will be the result of attempting to compile and run the following code?
 *  public class PromotionTest{
 *  public static void main(String args[]){
 *  int i = 5;
 *  float f = 5.5f;
 *  double d = 3.8;
 *  char c = 'a';
 *  if (i == f) c++;
 *  if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
 *  System.out.println(c);
 *  } }
 *  */

//It will print a.

/**In the case of i == f, value of i will be promoted to a float i.e. 5.0, and so it returns false.
 (int)f+(int)d =  (int)5.5 + (int) 3.8 => 5 + 3 = 8
 (int)(f + d) => (int) (5.5 + 3.8) => (int)(9.3) => 9, so this also return false.
 So, c is not incremented at all. Hence c remains 'a'.*/