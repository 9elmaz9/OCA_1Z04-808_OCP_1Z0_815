package Enthuware.Standart.test1;

public class test_35 {
}

/**
 Consider the following class and interface definitions (in separate files):

 public class Sample implements IInt{
 public static void main(String[] args){
 Sample s = new Sample();  //1
 int j = s.thevalue;       //2
 int k = IInt.thevalue;    //3
 int l = thevalue;         //4
 }
 }
 public interface IInt{
 int thevalue = 0;
 }


 What will happen when the above code is compiled and run?*/

//It will compile and run without any problem.

/*As a rule, fields defined in an interface are public, static, and final. The methods are public. Here, the interface IInt defines thevalue and thus any class that implements this interface gets this field.
Therefore, it can be accessed using s.thevalue or just thevalue inside the class. Also, since it is static, it can also be accessed using IInt.thevalue or Sample.thevalue.*/
