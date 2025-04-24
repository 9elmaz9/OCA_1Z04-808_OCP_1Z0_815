package Enthuware.Standart.test6;

public class test9 {
}
/**Given the following source code, which of the lines that are commented out may be reinserted without introducing errors?

 abstract class Bang{
 //abstract void f();  //(0)
 final    void g(){}
 //final    void h(){} //(1)
 protected static int i;
 private int j;
 }

 final class BigBang extends Bang{
 //BigBang(int n) { m = n; } //(2)
 public static void main(String args[]){
 Bang mc = new BigBang();
 }
 void h(){}
 //void k(){ i++; } //(3)
 //void l(){ j++; } //(4)
 int m;
 }*/


//void k( ) { i++; }//(3)

/**Default constructor (having no arguments) is automatically created only if the class does not define any constructors.
 * So as soon as //2 is inserted the default constructor will not be created.*/