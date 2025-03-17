package Enthuware.Standart.test3;

public class test35 {
}
/**What can be added to the following Person class so that it is properly encapsulated and the code prints 29?
 * class Person{
 *  //Insert code here } public class Employee extends Person{
 *  public static void main(String[] args) {
 *  Employee e = new Employee();
 *  e.setAge(29);
 *  System.out.println(e.getAge());
 *  } }*/
/**You had to select 2 options

private int age; public int getAge() { return age; } public void setAge(int age) { this.age = age; }*/

/**private int age; public int getAge() { return age; } protected void setAge(int age) { this.age = age; }*/

/*This is a ambiguous question because it doesn't give all the information. It really depends on the business logic of the class and the whole application whether the accessor methods (and specially the setter) should be public or protected or even private. The field should be private.
Expect such questions in the exam.
*/