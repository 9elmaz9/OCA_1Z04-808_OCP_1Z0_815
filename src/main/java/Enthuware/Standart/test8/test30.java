package Enthuware.Standart.test8;

public class test30 {
}
/**Which statements regarding the following code are correct ?
 * class Base{    void method1() throws java.io.IOException, NullPointerException{
 * someMethod("arguments");       // some I/O operations
 * }    int someMethod(String str){
 * if(str == null) throw new NullPointerException();
 * else return str.length();
 *  } } public class NewBase extends Base{
 *  void method1(){
 *  someMethod("args");
 *  } }*/


//method1 in class NewBase does not need to specify any exceptions.

//There is no problem with the code.

/**Overriding method only needs to specify a subset of the list of exception classes the overridden method can throw.
 * A set of no classes is a valid subset of that list.
 *  Remember that NullPointerException is a subclass of RuntimeException, while IOException is a subclass of Exception.*/

/**class Base {
 void method1() throws java.io.IOException, NullPointerException {
 someMethod("arguments");
 // some I/O operations
 }

 int someMethod(String str) {
 if (str == null)
 throw new NullPointerException();
 else
 return str.length();
 }
 }

 public class NewBase extends Base {
 void method1() {
 someMethod("args");
 }
 }
 Разбор утверждений:
 method1() в классе NewBase не нужно указывать исключения в throws.

 Правильно: В методе method1() класса NewBase не требуется указывать исключения в throws, потому что:
 NullPointerException и IOException — это непроверяемые (runtime) исключения.
 В Java непроверяемые исключения можно не указывать в throws для переопределённых методов, даже если они есть в исходном методе.
 Код не скомпилируется, потому что исключение RuntimeException не может быть указано в throws.

 Неверно: Исключения, производные от RuntimeException, такие как NullPointerException, не требуют указания в throws. Метод может не указывать их в throws и всё равно будет компилироваться.
 method1() в классе NewBase должен хотя бы указать IOException в throws.

 Неверно: В данном случае, IOException является проверяемым исключением, но метод method1() в классе NewBase может не указывать это исключение в throws, так как это исключение указано в методе Base. Переопределение метода не требует обязательного указания этого исключения.
 method1() в классе NewBase должен хотя бы указать NullPointerException в throws.

 Неверно: NullPointerException — это непроверяемое исключение, и его не нужно указывать в throws, даже если оно появляется в базовом классе. Это не требуется.
 С кодом нет проблем.

 Неверно: Есть одна небольшая потенциальная проблема, если бы в method1() в классе NewBase был указан список проверяемых исключений, но так как они являются непроверяемыми исключениями (например, NullPointerException), это не вызывает ошибок компиляции.
 Итог:
 Правильные варианты:
 method1() в классе NewBase не нужно указывать исключения в throws.
 С кодом нет проблем.*/

