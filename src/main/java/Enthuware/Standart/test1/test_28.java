package Enthuware.Standart.test1;

public class test_28 {
}
/**
 * What will the following code print when compiled and run?
 * abstract class Calculator{
 * abstract void calculate();
 * public static void main(String[] args){
 * System.out.println("calculating");
 * Calculator x = null;
 * x.calculate();
 * } }
 * */


//It will print calculating and then throw NullPointerException.
//After printing, when it tries to call calculate() on x, it will throw NullPointerException since x is null.