package Enthuware.Standart.eight;

public class test39 {
}
/**Given:
 class Triangle{
 public int base;
 public int height;
 private final double ANGLE;

 public  void setAngle(double a){  ANGLE = a;  }

 public static void main(String[] args) {
 Triangle t = new Triangle();
 t.setAngle(90);
 }
 }
 Identify the correct statement(s).*/

//The code will not compile.

/**The given code has two problems:
 * 1. If you declare a field to be final, it must be explicitly initialized
 * by the time the creation of an object of the class is complete.
 * So you can either initialize it immediately:
 * private final double ANGLE = 0;
 * or you can initialize it in the constructor or an instance block.
 * 2. Since ANGLE is final, you can't change its value once it is set.
 * Therefore the setAngle method will also not compile.*/