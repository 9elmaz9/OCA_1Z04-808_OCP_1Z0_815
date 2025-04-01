package Enthuware.Standart.test4;

public interface test {
}
/**Consider the following code:

 public class SubClass extends SuperClass{
 int i, j, k;
 public SubClass( int m, int n )     {  i = m ;  j = m ;  } //1
 public SubClass( int m )  {   super(m );   } //2
 }
 Which of the following constructors MUST exist in SuperClass for SubClass to compile correctly?*/

//public SuperClass(int a)
//Because it is called in the second constructor of SubClass


//public SuperClass()
//The default no args constructor will not be provided because SuperClass has to define one arg constructor.

