package Enthuware.Standart.test2;

public class test2 {
}
/**Given:  package loops;
 * public class JustLooping {
 *  private int j;
 *  void showJ(){
 *  while(j<=5){
 *  for(int j=1; j <= 5;){
 *  System.out.print(j+" ");
 *  j++;
 *  }
 *  j++;
 *  }
 *  }
 *  public static void main(String[] args) {
 *  new JustLooping().showJ();
 *  } }
 *  What is the result?*/

//It will print 1 2 3 4 5 six times.

/**The point to note here is that the j in for loop is different from the instance member j. Therefore, j++ occuring in the for loop doesn't affect the while loop. The for loop prints 1 2 3 4 5.
 The while loop runs for the values 0 to 5 i.e. 6 iterations. Thus, 1 2 3 4 5 is printed 6 times. Note that after the end of the while loop the value of j is 6.*/

/*Поле класса j (инициализируется 0).
Локальная переменная j в цикле for.
Цикл while работает, пока поле j <= 5. В каждом проходе while выполняется for, который печатает числа 1 2 3 4 5. После завершения for поле j увеличивается на 1.

Так как while выполняется 6 раз (с j = 0 до j = 5), строка 1 2 3 4 5 печатается 5 раз.

Ответ: "It will print 1 2 3 4 5 five times."*/