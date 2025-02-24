package Enthuware.Standart.test2;

public class test8 {
}
/**What will be the result of trying to compile and execute the following program?
 * public class TestClass{
 *  public static void main(String args[] ){
 *  int i = 0 ;
 *  int[] iA = {10, 20} ;
 *  iA[i] = i = 30 ;
 *
 *  System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
 *  }
 *  }
 *  */

//It will print 30 20 30

/**The statement iA[i] = i = 30 ; will be processed as follows:
 iA[i] = i = 30; => iA[0] = i = 30 ;  =>  i = 30; iA[0] = i ; =>   iA[0] = 30 ;

 Here is what JLS says on this:
 1 Evaluate Left-Hand Operand First
 2 Evaluate Operands before Operation
 3 Evaluation Respects Parentheses and Precedence
 4 Argument Lists are Evaluated Left-to-Right

 For Arrays: First, the dimension expressions are evaluated, left-to-right. If any of the expression evaluations completes abruptly, the expressions to the right of it are not evaluated.*/

/**
 java
 Copy code
 iA[i] = i = 30;
 Важный момент:
 Операторы присваивания (=) в Java работают справа налево. Это значит, что сначала вычисляется то, что справа от =, а потом результат присваивается слева.

 Пошаговый разбор:
 i = 30:

 Первым делом переменной i присваивается значение 30. Теперь i = 30.
 iA[i]:

 Так как i был изначально равен 0 (см. int i = 0;), выражение iA[i] на этом этапе означает iA[0].
 iA[0] = 30:

 После вычисления i = 30, значение 30 также присваивается первому элементу массива (iA[0]).
 Почему первый элемент массива стал 30?
 Мы изменяем тот элемент массива, на который указывает индекс i. Так как i = 0 в начале, то iA[0] становится равным 30.
 После выполнения операции:

 iA = {30, 20} (массив обновлен: первый элемент теперь 30).
 i = 30 (значение переменной i обновлено).
 Итог:
 Первый 30 — это значение первого элемента массива iA[0], которое было изменено на 30 из-за присваивания в строке iA[i] = i = 30;.*/