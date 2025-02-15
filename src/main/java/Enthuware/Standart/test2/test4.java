package Enthuware.Standart.test2;

public class test4 {
}
/**What is the result of compiling and running this code?
 * class MyException extends Throwable{}
 * class MyException1 extends MyException{}
 * class MyException2 extends MyException{}
 * class MyException3 extends MyException2{}
 *
 * public class ExceptionTest{
 * void myMethod() throws MyException{
 * throw new MyException3();  // Выбрасываем исключение MyException3
 * }
 * public static void main(String[] args){
 * ExceptionTest et = new ExceptionTest();
 *
 * try{
 * et.myMethod();
 * }
 * catch(MyException me){    // Ловит все исключения типа MyException и его подклассы
 * System.out.println("MyException thrown");
 * }
 * catch(MyException3 me3){  // Этот catch никогда не выполнится!
 *
 *  System.out.println("MyException3 thrown");
 *  }
 *  finally{
 *  System.out.println(" Done");
 *  }    } }*/

//It fails to compile


/**You can have multiple catch blocks to catch different kinds of exceptions, including exceptions that are subclasses of other exceptions.
 * However, the catch clause for more specific exceptions (i.e. a SubClassException) should come before the catch clause for more general exceptions
 * ( i.e. a SuperClassException). Failure to do so results in a compiler error as the more specific exception is unreachable.
 * In this case, catch for MyException3 cannot follow catch for MyException because if MyException3 is thrown,
 * it will be caught by the catch clause for MyException. And so, there is no way the catch clause for MyException3 can ever execute.
 * And so it becomes an unreachable statement.*/

/**Почему код не компилируется?
 В myMethod() выбрасывается MyException3, который является подклассом MyException.
 В try-блоке код сначала проверяет catch(MyException).
 Но MyException3 является наследником MyException, поэтому он поймает все исключения этого типа.
 Когда исключение MyException3 выброшено, оно сразу же перехватывается catch(MyException me).
 catch(MyException3 me3) никогда не выполнится, потому что раньше уже срабатывает catch(MyException me).
 Ошибка компиляции: "exception MyException3 has already been caught" (компилятор видит, что MyException3 уже обработан выше).*/


//Как исправить код?

//catch(MyException me) { }
//catch(MyException3 me3) { }  // Ошибка: MyException3 уже пойман раньше!

//✅ Правильный порядок (меняем catch местами):

//catch(MyException3 me3) { }  // Сначала ловим MyException3
// catch(MyException me) { }    // Потом более общий MyException

/**Вывод после исправления (если поменять местами catch-блоки):*/
//MyException3 thrown
//Done

/*Если же оставить код без изменений, он не скомпилируется из-за недостижимого блока catch(MyException3).*/

/**Ты можешь использовать несколько блоков catch, чтобы перехватывать разные типы исключений, включая исключения, которые являются подклассами других исключений. Однако, catch для более конкретных исключений (например, SubClassException) должен стоять перед catch для более общих исключений (например, SuperClassException).

 Если это правило нарушить, возникнет ошибка компиляции, так как catch для более специфичного исключения станет недостижимым кодом.

 В данном случае catch для MyException3 не может идти после catch для MyException, потому что если выбрасывается MyException3, то оно будет поймано блоком catch(MyException).
 Из-за этого catch(MyException3) никогда не выполнится, и он становится недостижимым кодом (unreachable statement).

 */