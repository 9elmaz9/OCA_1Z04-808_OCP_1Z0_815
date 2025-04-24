package Enthuware.Standart.test6;

public class test3 {
}
/**Given the complete contents of TestClass.java file:

 package x;
 public class TestClass {
 ArrayList<String> al;
 public void init(){
 al = new ArrayList<>();
 al.add("Name 1");
 al.add("Name 2");
 }
 public static void main(String[] args) throws Exception {
 TestClass tc = new TestClass();
 tc.init();
 System.out.println("Size = "+tc.al.size());
 }
 }
 Which import statement should be added to make it compile?*/


//import java.util.ArrayList;

/*Only java.lang package and the package in which the current class exists are automatically imported. Class ArrayList is in java.util package,
which is not imported automatically.  Note that classes in the default package (i.e. the package with no name) cannot be imported by classes
 in other (i.e. non default) packages. This is why you should not use the default package for creating classes.*/

