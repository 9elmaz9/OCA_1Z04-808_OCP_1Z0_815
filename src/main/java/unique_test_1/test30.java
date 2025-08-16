package unique_test_1;

public class test30 {
}
/**Consider the following two classes (in the same package but defined in different source files):

 public class Square {
 double side = 0;
 double area;

 public Square(double length){        this.side = length;    }

 public double getSide() {  return side;    }

 public void setSide(double side) {  this.side = side;   }

 double getArea() {   return area;   }
 }
 public class TestClass {
 public static void main(String[] args) throws Exception {
 Square sq = new Square(10.0);
 sq.area = sq.getSide()*sq.getSide();
 System.out.println(sq.getArea());
 }
 }
 You are assigned the task of refactoring the Square class to make it better in terms of encapsulation.
 What changes will you make to this class?*/

//Make the side field private and remove the area field.

/**Change getArea method to:
 *  public double getArea(){ return side*side; }*/

/**There can be multiple ways to accomplish this. The exam asks you questions on the similar pattern.
 The key is that your data variable should be private and the functionality that is to be exposed outside should be public.
 Further, your setter methods should be coded such that they don't leave the data members inconsistent with each other.*/