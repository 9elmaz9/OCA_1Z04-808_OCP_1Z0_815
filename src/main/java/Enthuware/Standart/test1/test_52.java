package Enthuware.Standart.test1;

public class test_52 {
}
/**Given :
 *  //In Data.java
 *  public class Data{
 *  int value;
 *  Data(int value){
 *  this.value = value;
 *  }
 *  public String toString(){
 *  return ""+value;
 *  }
 *  }
 *
 *  and the following code fragments:
 *  public  void filterData(ArrayList<Data> dataList, Predicate<Data> p){
 *  Iterator<Data> i = dataList.iterator();
 *  while(i.hasNext()){
 *  if(p.test31(i.next())){
 *  i.remove();
 *  }
 *  } } ....
 *  Data d = new Data(1); al.add(d);
 *  d = new Data(2); al.add(d);
 *d = new Data(3); al.add(d);
 *  //INSERT METHOD CALL HERE
 *  System.out.println(al);
 *  Which of the following options can be inserted above so that it will print [1, 3]?*/


//filterData(al, (Data x) -> x.value%2 == 0 );

/*When all your method does is return the value of an expression, you can omit the curly braces, the return keyword, and the semi-colon from the method body part.
Thus, instead of { return x.value%2 == 0; }, you can just write x.value%2 == 0*/

/**There is a simple trick to identify invalid lambda constructs.
 * When you write a lambda expression for a functional interface, you are essentially providing an implementation
 * of the method declared in that interface but in a very concise manner.
 * Therefore, the lambda expression code that you write must contain all the pieces of the regular method code except
 * the ones that the compiler can easily figure out on its own such as the parameter types, return keyword, and brackets.
 * So, in a lambda expression, just check that all the information is there and that the expression follows the basic syntax -
 * (parameter list) OR single_variable_without_type -> { regular lines of code }
 * OR just_an_expression_without_semicolon  For a complete discussion on this topic please see this short tutorial - http://enthuware.com/index.php/home/115*/