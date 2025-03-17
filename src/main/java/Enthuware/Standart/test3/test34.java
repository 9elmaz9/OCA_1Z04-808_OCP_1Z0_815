package Enthuware.Standart.test3;

public class test34 {
}
/**What will the following code print when compiled and run? (Assume that MySpecialException is an unchecked exception.)
 *  1. public class ExceptionTest {
 *  2.    public static void main(String[] args) {
 *  3.        try {
 *  4.            doSomething();
 *  5.        } catch (MySpecialException e) {
 *  6.            System.out.println(e);
 *  7.        }
 *  8.    }
 *  9.
 *  10.    static void doSomething() {
 *  11.        int[] array = new int[4];
 *  12.        array[4] = 4;
 *  13.        doSomethingElse();
 * 14.    }
 * 15.
 * 16.
 * static void doSomethingElse() {
 * 17.        throw new MySpecialException("Sorry, can't do something else");
 * 18.    } }*/

/***
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4 at ExceptionTest.doSomething(ExceptionTest.java:12) at ExceptionTest.main(ExceptionTest.java:4)**/