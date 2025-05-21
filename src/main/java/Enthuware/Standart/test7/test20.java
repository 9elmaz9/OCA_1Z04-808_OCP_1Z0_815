package Enthuware.Standart.test7;

public class test20 {
}
/**Given :
 *  //In Data.java
 *  public class Data{
 *  int value;
 *  Data(int value){
 *  this.value = value;
 *  } }
 *  and the following code fragments:
 *  public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p){
 *  for(Data d: dataList){
 *  if(p.test(d)) System.out.println(d.value);
 *  } }  ....
 *  ArrayList<Data> al = new ArrayList<Data>();
 *  al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
 *  //INSERT METHOD CALL HERE
 *  Which of the following options can be inserted above so that it will print 3?*/

//printUsefulData(al, (Data d)-> { return d.value>2; });

//printUsefulData(al, d-> d.value>2 );
/**1. Compiler already knows the parameter types, so Data can be omitted from the parameter list.
 *  2. When there is only one parameter in the method, you can omit the brackets because
 *  the compiler can associate the -> sign with the parameter list without any ambiguity.
 *  3. When all your method does is return the value of an expression, you can omit the curly braces,
 *  the return keyword, and the semi-colon from the method body part.
 * Thus, instead of { return d.value>2; }, you can just write d.value>2*/

/**There is a simple trick to identify invalid lambda constructs.
 * When you write a lambda expression for a functional interface,
 * you are essentially providing an implementation of the method declared in that interface
 * but in a very concise manner.Therefore, the lambda expression code that you write
 * must contain all the pieces of the regular method code except the ones that the compiler
 * can easily figure out on its own such as the parameter types, return keyword, and brackets.
 * So, in a lambda expression, just check that all the information is there and that
 * the expression follows the basic syntax -  (parameter list) OR
 * single_variable_without_type -> { regular lines of code } OR just_an_expression_without_semicolon
 * For a complete discussion on this topic please see this short tutorial - http://enthuware.com/index.php/home/115*/
