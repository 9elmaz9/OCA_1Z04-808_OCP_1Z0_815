package Enthuware.Standart.test2;

public class test50 {
}

/**Consider the following method which is called with an argument of 7:

 public void method1(int i){
 int j = (i*30 - 2)/100;

 POINT1 : for(;j<10; j++){
 boolean flag  = false;
 while(!flag){
 if(Math.random()>0.5) break POINT1;
 }
 }
 while(j>0){
 System.out.println(j--);
 if(j == 4) break POINT1;
 }
 }
 What will it print? (Assume that Math.random() return a double between 0.0 and 1.0, not including 1.0)*/

//It will not compile.

/*Remember that a labeled break or continue statement must always exist inside the loop where the label is declared.
Here, if(j == 4) break POINT1; is a labelled break that is occurring in the second loop while the label POINT1 is declared for the first loop.*/

