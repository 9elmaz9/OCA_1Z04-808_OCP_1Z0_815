package Enthuware.Standart.test1;

public class test_43 {
}
/**What can be inserted in the code below so that it will print true when run?
 *  public class TestClass{
 *  public static boolean checkList(List list, Predicate<List> p){
 *  return p.test(list);
 *  }
 *  public static void main(String[] args) {
 *  boolean b = //WRITE CODE HERE
 *  System.out.println(b);    } }
 *  */


//checkList(new ArrayList(), al -> al.isEmpty());
/*The test method of Predicate returns a boolean.
So all you need for yourbody part in your lambda expression is an expression that returns a boolean. isEmpty() is a valid method of ArrayList,
 which returns true if there are no elements in the list. Therefore, al.isEmpty() constitutes a valid body for the lambda expression in this case.*/


//checkList(new ArrayList(), al -> al.add("hello"))
/*The add method of ArrayList returns a boolean. Further, it returns true if the list is altered because of the call to add. In this case, al.add("hello")
indeed alters the list because a new element is added to the list.*/