package Enthuware.Standart.test6;

public class test48 {
}
/**What will the following code print when run?
 *  public class Test {
 *  static String s = "";
 *  public static void m0(int a, int b) {
 *  s += a;
 *  m2();
 *  m1(b);
 *  }
 *  public static void m1(int i) {
 *  s += i;
 *  }
 *  public static void m2() {
 *  throw new NullPointerException("aa");
 *  }
 *  public static void m() {
 *  m0(1, 2);
 *  m1(3);
 *  }
 *  public static void main(String args[]) {
 *  try {
 *  m();
 *  } catch (Exception e) {
 *
 *     }
 *     System.out.println(s);
 *     } }
 *     */

//1

/**Try to follow the control flow:
 *  1. m() calls m0(1, 2).
 *  2. m0(1, 2) first executes s += 1 (so s is now 1)
 *  and then calls m2().
 *  3. Now, m2() throws an exception which is not caught by m2() so it is propagated back
 *  to m0(1, 2). Since, within m0 method, the call to m2() is not wrapped in a try catch block,
 *  this exception further propagates up to m(). ( The next line in m0(1, 2), which is m1(2), is not executed ).
 *  4. Again, m() also does not have the try catch block so the same exception is further propagated
 *  up to the main() method. (The next line in m(), which is a call to m1(3) is not called).
 *  4. In main method, the call to m() is wrapped in a try catch block and so the exception is handled here.
 *  5. Finally, s stays as "1".  The point to note here is that if you do not catch an exception,
 *  it is propagated up the stack of method calls until it is handled. If nobody handles it, the JVM handles
 *  that exception and kills the thread.
 *
 * If that thread is the only user thread running, the program ends.*/