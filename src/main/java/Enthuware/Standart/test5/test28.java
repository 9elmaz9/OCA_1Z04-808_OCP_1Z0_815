package Enthuware.Standart.test5;

public class test28 {
}
/**Which of the changes given in options can be done (independent of each other) to let the following code compile
 * and run without errors when its generateReport method is called?
 * class SomeClass{
 * String s1 = "green mile";   // 0
 *  public void generateReport( int n ){
 *  String local;   // 1
 *  if( n > 0 ) local = "good";   //2
 *  System.out.println( s1+" = " + local );   //3
 *  } }*/


//Insert after line 2 : else local = "bad";

//Move line 1 and place it after line 0.

/**The problem is that local is declared inside a method is therefore local to that method. It is called a local variable
 *  (also known as automatic variable) and it cannot be used before initialized. Further, it will not be initialized unless
 *  you initialize it explicitly because local variables are not initialized by the JVM on its own. The compiler spots the
 *  usage of such uninitialized variables and ends with an error message.
 *  1. Making it a member variable (choice "Move line 1 and place it after line 0.") will initialize it to null.
 *  2. Putting an else part (choice "Insert after line 2 : else local = "bad";")
 *  will ensure that it is initialized to either 'good' or 'bad'. So this also works.
 *  Choice "Insert after line 2 : if(n <= 0) local = "bad";"doesn't work because the second 'if' will actually be another statement and is
 *  not considered as a part of first 'if'. So, compiler doesn't realize that 'local' will be initialized even though it does get initialized.*/
