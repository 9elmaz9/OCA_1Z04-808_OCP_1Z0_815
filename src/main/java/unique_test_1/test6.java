package unique_test_1;

public class test6 {
}
/**What will the following code print when run?
 *  import java.util.function.Predicate; class Employee{
 *  int age;   //1 }  public class TestClass{
 *  public static boolean validateEmployee(Employee e, Predicate<Employee> p){
 *  return p.test(e);    }
 *  public static void main(String[] args) {
 *  Employee e = new Employee(); //2
 *  System.out.println(validateEmployee(e, e->e.age<10000)); //3
 *  } }*/

//It will fail to compile at line marked //3

/**Remember that the parameter list part of a lambda expression declares new variables
 * that are used in the body part of that lambda expression. However, a lambda expression
 * does not create a new scope for variables. Therefore, you cannot reuse the local variable
 * names that have already been used in the enclosing method to declare the variables in you lambda expression.
 * It would be like declaring the same variable twice. Here, the main method has already declared
 * a variable named e. Therefore, the parameter list part of the lambda expression must not declare another
 * variable with the same name. You need to use another name. For example, if you change //3 to the following, it will work.
 * System.out.println(validateEmployee(e, x->x.age<10000));  It would print true.*/