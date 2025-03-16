package Enthuware.Standart.test3;

public class test32 {
}
/**In the following code, after which statement (earliest), the object originally held in s, may be garbage collected ?
 *  1. public class TestClass{
 *  2.   public static void main (String args[]){
 *  3.Student s = new Student("Vaishali", "930012");
 *  4.      s.grade();
 *  5.      System.out.println(s.getName());
 *  6.      s = null;
 *  7.      s = new Student("Vaishali", "930012");
 *  8.      s.grade();
 *  9.      System.out.println(s.getName());
 *  10      s = null;
 *  }
 *  }
 *  public class Student{
 *  private String name, rollNumber;
 *  public Student(String name, String rollNumber) {
 *  this.name = name;
 *  this.rollNumber = rollNumber;
 *  }
 *  //valid setter and getter for name and rollNumber follow
 *  public void grade() {    }  } */


//Line 6

/**In this case, since there is only one reference to Student object, as soon as it is set to null, the object held by the reference is eligible for GC, here it is done at line 6.
 Note that although an object is created at line 7 with same parameters, it is a different object and it will be eligible for GC after line 10.*/