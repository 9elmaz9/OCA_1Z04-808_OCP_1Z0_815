package unique_test_1;

public class test47 {
}
/*What will be printed when the following program is compiled and run?

class Super{
  public int getNumber( int a){
     return 2;
  }
}
public class SubClass extends Super{
  public int getNumber( int a, char ch){
     return 4;
  }
  public static void main(String[] args){
    System.out.println( new SubClass().getNumber(4) );
  }
}
What will be printed?**/

//2

/*Note that the parameters of SubClass's getNumber are different than Super's getNumber. So it is not overriding it. So the super class's getNumber() will be called which returns 2.*/