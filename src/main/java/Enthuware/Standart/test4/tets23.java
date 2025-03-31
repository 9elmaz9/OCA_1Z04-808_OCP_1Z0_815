package Enthuware.Standart.test4;

public class tets23 {
}
/**What will be printed when the following code is compiled and run?

 public class LoadTest{

 public static void main(String[] args) throws Exception {
 LoadTest t = new LoadTest();
 int i = t.getLoad();
 double d = t.getLoad();
 System.out.println( i + d );
 }

 public int getLoad() {
 return 1;
 }

 public double getLoad(){
 return 3.0;
 }

 }*/

//The code will not compile.

/*You cannot have more than one method in a class with the same signature. Method signature includes method name and the argument
list but does not include return type. Therefore, the two getLoad() methods have the same signature and will not compile.
This shows that method overloading cannot be done on the basis of the return types.*/
