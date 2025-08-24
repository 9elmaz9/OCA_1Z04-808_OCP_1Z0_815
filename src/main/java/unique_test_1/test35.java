package unique_test_1;

public class test35 {
}
/**Given: //Insert code here
 *  public abstract void draw(); }
 *  //Insert code here
 *  public void draw(){
 *  System.out.println("in draw..."); } }
 *  Which of the following lines of code can be used to complete the above code?*/

/**
 public abstract class Shape {
 and
 class Circle extends Shape {*/

/**
 public interface Shape {  and
 class Circle implements Shape {
 By default all the methods of an interface are public and abstract so there is no need to explicitly specify the "abstract" keyword for the draw() method if you make Shape an interface. But it is not wrong to do so.
 */