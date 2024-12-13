package Enthuware.Standart.eight;



   // What, if anything, is wrong with the following code?

    //Filename: TestClass.java
 // class TestClass implements T1, T2{
 //     public void m1(){}
 // }
 // interface T1{
 //     int VALUE = 1;
 //     void m1();
 // }
 // interface T2{
 //     int VALUE = 2;
 //     void m1();
 // }


//What will be the result of attempting to compile and run the following program?
public class TestClass{
    public static void main(String args[]){
        int x  = 0;
        labelA:   for (int i=10; i<0; i--){
            int j = 0;
            labelB:
            while (j < 10){
                if (j > i) break labelB;
                if (i == j){
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
}