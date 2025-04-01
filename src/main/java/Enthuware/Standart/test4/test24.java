package Enthuware.Standart.test4;

public class test24 {
}
/**What willbe the output of the following program?
 *  class TestClass{
 *  public static void main(String[] args) throws Exception{
 *  try{
 *  amethod();
 *  System.out.println("try ");
 *  }
 *  catch(Exception e){
 *  System.out.print("catch ");
 *  }
 *  finally   {
 *
 *  System.out.print("finally ");
 *  }
 *  System.out.print("out ");
 *  }
 *  public static void amethod(){ }
 *  }*/


//try finally out

//Since the method amethod() does not throw any exception, try is printed and the control goes to finally which prints finally. After that out is printed.



