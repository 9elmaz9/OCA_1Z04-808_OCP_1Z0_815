package Enthuware.Standart.test2;

public class test39 {
}
/**What will the following code print when compiled and run?
 *  import java.util.*; public class ClassnameTest {
 *  public static void main(String[] args) {
 *  List<String> list = new ArrayList<>();
 *  StringBuilder sb = new StringBuilder("mrx");
 *  String s = sb.toString();
 *  list.add(s);
 *  System.out.println(s.getClass());
 *  System.out.println(list.getClass());
 *  } }*/

/**
 class java.lang.String
 class java.util.ArrayList*/

/* The getClass method always returns the Class object for the actual object on which the method is called
 irrespective of the type of the reference. Since s refers to an object of class String, s.getClass returns Class object for String and similarly list.getClass returns Class object for ArrayList.*/