package Enthuware.Standart.test7;

public class test47 {
}
/**Identity correct statement about the following code -
 *  class X{
 *  int val = 10;
 *  }
 *
 *  class Y extends X{
 *  Y val = null; //1
 *  }
 *
 *  public class TestClass extends X{
 *
 *  public static void main(String[] args){
 *  Y y = new Y();
 *  int k = (X) y.val ; //2
 *  System.out.println(k);
 *  } }*/

//It will fail to compile due to line marked //2.

/**This code pits the precedence of the cast operator and the dot operator against each other.
 * In Java, the dot operator has higher precedence than the cast operator.
 * That is why, while evaluating (X) y.val, y.val is evaluated first.
 * This returns the val variable defined in class Y, which is of type Y.
 * Since Y extends X, it is ok to cast y.val to X. However, you can't assign an object of type X to an variable of type int.
 * Therefore, the compiler generates an error message saying, error: incompatible types: X cannot be converted to int.
 * Had the cast operator had higher precedence than the dot operator,
 * y would have been cast to X first. ((X)y).val would then have evaluated to X's val, which is of type int.
 * Thus, k would have been assigned the value 10.*/

