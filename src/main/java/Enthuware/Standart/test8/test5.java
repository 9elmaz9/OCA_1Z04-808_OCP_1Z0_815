package Enthuware.Standart.test8;

public class test5 {
}
/**Consider the following classes...

 class Car{
 public int gearRatio = 8;
 public String accelerate() {  return "Accelerate : Car";  }
 }
 class SportsCar extends Car{
 public int gearRatio = 9;
 public String accelerate() {  return  "Accelerate : SportsCar";  }
 public static void main(String[] args){
 Car c = new SportsCar();
 System.out.println( c.gearRatio+"  "+c.accelerate() );
 }
 }
 What will be printed when SportsCar is run?*/


//8 Accelerate : SportsCar

/**The concept is : variables are hidden and methods are overridden.
        Method to be executed depends on the class of the actual object the variable is referencing to. Here, c refers to object of class SportsCar so SportsCar's accelerate() is selected.
*/