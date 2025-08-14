package unique_test_1;

public class test25 {
}
/**Which line, if any, will give a compile time error ?

 void test(byte x){
 switch(x){
 case 'a':   // 1
 case 256:   // 2
 case 0:     // 3
 default :   // 4
 case 80:    // 5
 }
 }*/

//Line 2 as 256 cannot fit into a byte.

/**Every case constant expression in a switch block must be assignable to the type of switch expression. Meaning :
 byte by = 10;
 switch(by){
 case 300 :  //some code;
 case 56 :   //some code;
 }
 This will not compile as 300 is not assignable to 'by ' which can only hold values from -128 to 127. This gives compile time error as the compiler detects it while compiling. The use of break keyword is not mandatory, and without it the control will simply fall through the labels of the switch statement.*/
