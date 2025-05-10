package Enthuware.Standart.test6;

public class test {
}
/**What will the following code print when compiled and run?
 *  public class Data{
 *  int value;
 *  Data(int value){
 *  this.value = value;
 *  }
 *
 *  public String toString(){ return ""+value; }
 *
 *  public static void main(String[] args) {
 *  Data[] dataArr = new Data[]{ new Data(1), new Data(2),
 *  new Data(3), new Data(4) };
 *  List<Data> dataList = Arrays.asList(dataArr); //1
 *  for(Data element :  dataList){
 *  dataList.removeIf( (Data d) -> { return d.value%2 ==  0; } );  //2
 *  System.out.println("Removed "+d+", "); //3
 *  }
 *  }
 *  }
 *  */

//It will not compile due to //3

/**1. Observe that the loop is completely unnecessary. The Collection's removeIf method takes a Predicate and removes
 * all elements of the List for which the Predicate returns true. You need not put it in a loop to check for each element.
 * 2. If you remove //3, the code will compile but will throw a java.lang.UnsupportedOperationException at run time.
 * Since the list is backed by an array and the size of the array cannot change, you cannot add or remove elements from a List backed by an array.
 * You may, however, change the elements of the List using list.set(index, element); method.*/