package Enthuware.Standart.test7;

public class test38 {
}
/**What will the following program snippet print?
 int i=0, j=11;
 do{
 if(i > j) { break; }
 j--;
 }while( ++i < 5);
 System.out.println(i+"  "+j);*/

//5 6


/**++i < 5 means, increment the value of i and then compare with 5. Now, Try to work out the values of i and j at every iteration. To start with, i=0 and j=11. At the time of evaluation of the while condition, i and j are as follows:
 j = 10 and i=1 (loop will continue because i<5) (Remember that comparison will happen AFTER increment i because it is ++i and not i++.
 j = 9 and i=2 (loop will continue because i<5).
 j = 8 and i=3 (loop will continue because i<5).
 j = 7 and i=4 (loop will continue because i<5).
 j = 6 and i=5 (loop will NOT continue because i not <5).
 So it will print 5 6. (It is print i first and then j).*/