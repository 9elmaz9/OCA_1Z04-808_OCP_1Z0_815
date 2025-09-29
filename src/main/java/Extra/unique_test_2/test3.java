package Extra.unique_test_2;

public class test3 {
}

/**
 Given:

 public class Switcher{

 public static void main(String[] args){
 switch(Integer.parseInt(args[1]))  //1
 {
 case 0 :
 boolean b = false;
 break;

 case 1 :
 b = true; //2
 break;
 }

 if(b) System.out.println(args[2]);
 }
 }
 What will the above program print if compiled and run using the following command line: java Switcher 1 2 3 */

//It will not compile for some other reason.


/**It will not compile because of if(b) because b is declared in the switch block and it is out of scope after the switch block ends. Pay close attention to question text. It may seem to test you on one concept but actually it could be testing something entirely different.
 */
