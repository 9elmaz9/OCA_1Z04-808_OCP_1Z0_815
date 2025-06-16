package Enthuware.Standart.test7;

public class test42 {
}
/**What will the following code print?
 *  boolean flag = true;
 *  if(flag = false){
 *  System.out.println("1");
 *  }else if(flag){
 *  System.out.println("2");
 *  }else if(!flag){
 *  System.out.println("3");
 *  }else
 *  System.out.println("4");*/


//3

/**At the beginning, flag is true. In the first if, we do flag = false. Notice that it is not flag == false.
 *  It is a single =, which assigns false to flag. Thus, flag becomes false and the condition becomes false
 *  therefore 1 is not printed. In the first 'else if', again since flag is false, 2 is not printed. In second 'else if',
 * !flag implies !false, which is true, so 3 is printed. Finally, since an else-if condition has been satisfied,
 * the last else is not executed.*/
