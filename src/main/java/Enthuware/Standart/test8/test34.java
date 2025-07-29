package Enthuware.Standart.test8;

public class test34 {
}
/**Which of the following methods does not return any value?*/

/**
 public void doStuff() throws FileNotFoundException, IllegalArgumentException{
 //valid code not shown } */

/**A method that does not return anything should declare its return type as void.
 * Note that this is different from constructors. A constructor also doesn't return anything but for a constructor,
 * you don't specify any return type at all. That is how a constructor is differentiated from a regular method.*/


/**Option 1:

 java
 Copy code
 public doStuff() throws FileNotFoundException, IllegalArgumentException {
 // valid code not shown
 }
 Некорректно: Метод не указывает тип возвращаемого значения. В Java метод должен либо возвращать значение, либо быть помечен как void, если не возвращает ничего. Это вызовет ошибку компиляции, так как не указан тип возвращаемого значения.
 Option 2:

 java
 Copy code
 public null doStuff() throws FileNotFoundException, IllegalArgumentException {
 // valid code not shown
 }
 Некорректно: null не может быть типом возвращаемого значения в Java. Это приведет к ошибке компиляции, потому что null не является допустимым типом.
 Option 3:

 java
 Copy code
 public doStuff() {
 // valid code not shown
 }
 Некорректно: Как и в первом варианте, здесь не указан тип возвращаемого значения. В Java это также вызовет ошибку компиляции.
 Option 4:

 java
 Copy code
 public void doStuff() throws FileNotFoundException, IllegalArgumentException {
 // valid code not shown
 }
 Правильно: Этот метод явно указывает тип возвращаемого значения void, что означает, что он не возвращает ничего.
 Option 5:

 java
 Copy code
 private doStuff() {
 // valid code not shown
 }
 Некорректно: Этот метод тоже не указывает возвращаемый тип, что приведет к ошибке компиляции.
 Заключение:
 Метод, который не возвращает ничего, это Option 4:

 public void doStuff()*/