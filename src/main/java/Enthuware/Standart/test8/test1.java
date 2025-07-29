package Enthuware.Standart.test8;

public class test1 {
}
/**What will the following code print when compiled and run?
 *  int[][] ab = { {1, 2, 3}, {4, 5} };
 *  for(int i=0; i<ab.length; i++){
 *  for(int j=0; j<ab[i].length; j++){
 *  System.out.print(ab[i][j]+" ");
 *  if(ab[i][j] == 2){
 *
 *   break;
 *    }
 *   }
 *   continue;
 *   }*/

//1 2 4 5

/**For answering such questions, it is best to use a pen and a paper and start executing the code line by line.
 The i of the outer loop runs from 0 to < ab.length, which is 2. i.e. i will be 0 and then 1.
 The j of the inner loop runs from 0 to < ab[i].length, which is 3 for the first iteration of the outer for loop and 2 for the second iteration of the outer for loop.
 Thus, for the first iteration of the outer for loop - the inner for loop prints ab[0][0] i.e. 1 , ab[0][1] i.e. 2 and then since the if condition is satisfied, the inner loop ends and thesecond iteration of the outer for loop begins.
 For the second iteration of the outer for loop - the inner for loop prints ab[1][0] i.e. 4 , ab[1][1] i.e. 5.

 The continue statement in this case is redundant because there is no statement left to execute after continue in the for loop anyway.*/


/**Три не выводится, потому что после того, как напечатано 2, срабатывает оператор break, который прерывает внутренний цикл. В результате внутренний цикл для первой строки завершает свою работу до того, как достигает элемента 3.

 Вот что происходит:

 Внешний цикл идет по строкам массива. Для первой строки {1, 2, 3}:
 Напечатается 1.
 Напечатается 2.
 Когда встречается 2, выполняется break, и цикл прерывается. Поэтому 3 уже не печатается.
 Переходит ко второй строке {4, 5}, где печатаются 4 и 5.
 Таким образом, 3 не выводится, потому что внутренний цикл останавливается при встрече с 2.*/

