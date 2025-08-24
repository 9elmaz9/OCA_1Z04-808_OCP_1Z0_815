package unique_test_1;

public class test38 {
}
/**Given the following code, which statements can be placed at the indicated position
 *  without causing compile and run time errors?
 *  public class Test{
 *  int i1;
 *  static int i2;
 *  public void method1(){
 *  int i;
 *
 *  // ... insert statements here    } }*/

/**i = this.i1;
 As i1 is an instance variable, it is accessible through 'this'.*/

/**i = this.i2;
 Although 'this' is not needed to access i2, it is not an error to do so.*/

/**this.i1 = i2;
 You are just assigning a static field's value to non-static field.*/


