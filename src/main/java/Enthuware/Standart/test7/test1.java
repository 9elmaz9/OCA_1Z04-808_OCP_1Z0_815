package Enthuware.Standart.test7;

public class test1 {
}
/**Given :
 * interface Process{
 *  public void process(int a, int b); }
 *  public class Data{
 *  int value;
 *  Data(int value){
 *  this.value = value;
 *  } }
 *  and the following code fragments:
 *  public void processList(ArrayList<Data> dataList, Process p){
 *  for(Data d: dataList){
 *  p.process(d.value, d.value);
 *  } }  ....
 *  ArrayList<Data> al = new ArrayList<Data>();
 *  al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
 *  //INSERT METHOD CALL HERE
 *  Which of the following options can be inserted above so that it will print 1 4 9?*/


//processList(al, (int a, int b)->System.out.println(a*b) );



//processList(al, (a, b)->System.out.println(a*b));
//It is ok to omit the parameter types in case of a functional interface because
// the compiler can determine the type of the parameters by looking at the interface method.



//processList(al, (a, b) ->{System.out.println(a*b); } );
//If you enclose your method body within curly braces, you must write complete lines of code
// including the semi-colon. FYI, if the method is supposed to return a value, then you must include
// a return statement just like you do in a regular method if you are using the curly braces syntax.

/**There is a simple trick to identify invalid lambda constructs.
 *  When you write a lambda expression for a functional interface, you are essentially
 *  providing an implementation of the method declared in that interface but in a very concise manner.
 *  Therefore, the lambda expression code that you write must contain all the pieces of the regular
 *  method code except the ones that the compiler can easily figure out on its own such as the parameter types,
 *  return keyword, and brackets. So, in a lambda expression, just check that all the information is there
 *  and that the expression follows the basic syntax -  (parameter list) OR
 *  single_variable_without_type -> { regular lines of code } OR
 *  For a complete discussion on this topic please see this short tutorial - https://enthuware.com/lambda-for-ocajp*/



