package Enthuware.Standart.test4;

public class test45 {
}
/**
 * What will the following code print when compiled and run:
 *  public class TestClass {
 *  public static void main(String[] args){
 *  while(int k = 5; k<7){
 *  System.out.println(k++);
 *  }
 *  } }*/




//It will not compile.
/*In Java, a while or do/while construct takes an expression that returns a boolean. But unlike a for loop, you cannot put
 instantiation and increment sections in the while condition.
 Therefore, for(int k=5;k<7;) is valid but while(int k=5;k<7;) is not.*/