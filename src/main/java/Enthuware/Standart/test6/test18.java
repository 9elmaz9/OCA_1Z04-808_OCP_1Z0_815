package Enthuware.Standart.test6;

public class test18 {
}
/**What will the code shown below print when run?
 class Wrapper{
 int w = 10;
 }

 public class TestClass{

 static Wrapper changeWrapper(Wrapper w){
 w = new Wrapper();
 w.w += 9;
 return w;
 }


 public static void main(String[] args){
 Wrapper w = new Wrapper();
 w.w = 20;
 changeWrapper(w);
 w.w += 30;
 System.out.println(w.w);
 w = changeWrapper(w);
 System.out.println(w.w);
 }
 }*/

//19


//50

/**Remember that when you pass an object in a method, only its reference is passed by value. So when changeWrapper() does w = new Wrapper();
 *  and then w.w +=9; it does not affect the original wrapper object that was passed to this method. Therefore, it prints 50.
 *  Calling w = changeWrapper(w); replaces the original Wrapper object with the one created in the changeWrapper(w); method.
 *  Therefore, in the second print statement, it prints 19.*/

