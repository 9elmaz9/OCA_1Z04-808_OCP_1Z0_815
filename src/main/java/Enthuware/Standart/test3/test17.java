package Enthuware.Standart.test3;

public class test17 {
}
/**Given:

 import java.util.*;
 public class TestClass {
 public static void main(String[] args) throws Exception {
 ArrayList<Double> al = new ArrayList<>();

 //INSERT CODE HERE
 }
 }
 What can be inserted in the above code so that it can compile without any error?*/


//System.out.println(al.indexOf(1.0));
//indexOf's accepts Object as a parameter. Although 1.0 is not an object, it will be boxed into a Double object.


//System.out.println(al.contains("string"));

//Note that al is declared as ArrayList<Double>, therefore the add method is typed to accept only a Double.