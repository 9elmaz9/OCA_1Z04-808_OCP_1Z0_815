package Enthuware.Standart.test2;

public class test5 {
}
/**
 Consider the following code appearing in the same file:
 class Data {
 private int x = 0, y = 0;
 public Data(int x, int y){
 this.x = x; this.y = y;
 }
 }
 public class TestClass {
 public static void main(String[] args) throws Exception {
 Data d = new Data(1, 1);
 //add code here
 }
 }
 Which of the following options when applied individually will change the Data object currently
 referred to by the variable d to contain 2, 2 as values for its data fields?*/

/**✓ You answered correctly You had to select 1 option

 Add the following two statements : d.x = 2; d.y = 2;
 Note that x and y are private in class Data. Therefore, you cannot access these members from any other class.*/

/**Add the following method to Data class:
 * public void setValues(int x, int y){
 * this.x = x;
 * this.y = y; }
 * Then add the following statement:
 * d.setValues(2, 2);
 This is a good example of encapsulation where the data members of Data class are private and there is a method in Data class to manipulate its data.
 Compare this approach to making x and y as public and letting other classes directly modify the values.*/




