package Enthuware.Standart.test5;

public class test29 {
}

/**Consider the following class...
 *  class TestClass{
 *  int x;
 *  public static void main(String[] args){
 *  // lot of code.
 *  } }*/


//main cannot access this.x as it is declared now.
//Because main() is a static method. It does not have 'this'!


//It is not possible to access x from main without making it static. Because main is a static method and only static members are accessible from static methods.
// There is no 'this' available in main so none of the this.x are valid.
