package Extra.unique_test_2;

public class test11 {
}
/**Note: Although Wrapper classes are not explicitly mentioned in the exam objectives, we have seen some candidates get questions on this aspect of Wrapper classes.  What will be the output of the following program?
 *  public class EqualTest{
 *  public static void main(String args[]){
 *  Integer i = new Integer(1) ;
 *  Long m = new Long(1);
 *  if( i.equals(m)) System.out.println("equal");   // 1
 *  else System.out.println("not equal");    } }*/

//not equal

/**Signature of equals method is : boolean equals(Object o); So it can take any object.
 *  The equals methods of all wrapper classes first check if the two object are of same class or not.
 *  If not, they immediately return false. Hence it will print not equal.*/