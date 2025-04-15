package Enthuware.Standart.test5;

public class test19 {
}

/**What letters will be printed by this program?
 public class ForSwitch{
 public static void main(String args[]){
 char i;
 LOOP: for (i=0;i<5;i++){
 switch(i++){
 case '0': System.out.println("A");
 case 1: System.out.println("B"); break LOOP;
 case 2: System.out.println("C"); break;
 case 3: System.out.println("D"); break;
 case 4: System.out.println("E");
 case 'E' : System.out.println("F");
 }
 }
 }
 }*/

//C


//F

/*1. Defining i as char doesn't mean that it can only hold characters (a, b, c etc). It is an integral data type which can take any +ive integer value from 0 to 2^16 -1.
2. Integer 0 or 1, 2 etc. is not same as char '0', '1' or '2' etc.
so when i is equal to 0, nothing gets printed and i is incremented to 1 (due to i++ in the switch).
 i is then incremented again by the for loop for next iteration. so i becomes 2.
when i = 2, "C" is printed and i is incremented to 3 (due to i++ in the switch) and then i is incremented to 4 by the for loop so i becomes 4.
when i = 4, "E" is printed and since there is no break, it falls through to case 'E' and "F" is printed.
i is incremented to 5  (due to i++ in the switch) and then it is again incremented to 6 by the for loop. Since i < 5 is now false, the for loop ends.*/