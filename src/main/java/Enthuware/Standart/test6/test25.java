package Enthuware.Standart.test6;

public class test25 {
}
/**What will the following code print?

 void crazyLoop(){
 int c = 0;
 JACK: while (c < 8){
 JILL: System.out.println(c);
 if (c > 3) break JACK; else c++;
 }
 }*/

//It will print numbers from 0 to 4

/**This is a straight forward loop that contains a labelled break statement. A labelled break breaks out of the loop that is marked with the given label. Therefore, a labelled break is used to break out from deeply nested loops to the outer loops. Here, there is only one nested loop so the break; and break JACK; are same, but consider the following code:
 public static void crazyLoop(){
 int c = 0;
 JACK: while (c < 8){
 JILL: System.out.println("c = "+c);
 for(int k = 0; k<c; k++){
 System.out.println(" k = "+k+" c = "+c);
 if (c > 3) break JACK;
 }
 c++;
 }
 }
 This code prints:
 c = 0
 c = 1
 k = 0 c = 1
 c = 2
 k = 0 c = 2
 k = 1 c = 2
 c = 3
 k = 0 c = 3
 k = 1 c = 3
 k = 2 c = 3
 c = 4
 k = 0 c = 4
 As you can see, in this case, break JACK; will break out from the outer most loop (the while loop). If break JACK; is replaced by break; it will print:
 c = 0
 c = 1
 k = 0 c = 1
 c = 2
 k = 0 c = 2
 k = 1 c = 2
 c = 3
 k = 0 c = 3
 k = 1 c = 3
 k = 2 c = 3
 c = 4
 k = 0 c = 4
 c = 5
 k = 0 c = 5
 c = 6
 k = 0 c = 6
 c = 7
 k = 0 c = 7
 This shows that a break without a label only breaks out of the current loop.*/