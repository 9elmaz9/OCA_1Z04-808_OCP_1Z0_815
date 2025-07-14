package Enthuware.Standart.eight;

public class test26 {
}
/**Given: public class CrazyMath {
 *  public static void main(String[] args) {
 *  int x = 10, y = 20;
 *  int dx, dy;
 *  try{
 *  dx = x % 5;
 *  dy =  y/dx;
 *  }catch(ArithmeticException ae){
 *  System.out.println("Caught AE");
 *  dx = 2;
 *  dy = y/dx;
 *  }
 *  x = x/dx;
 *  y = y/dy;
 *  System.out.println(dx+" "+dy);
 *  System.out.println(x+" "+y);
 *  } } What is the output?*/

/**
 Caught AE
 2 10
 5 2*/

/**% is the modulus operator. It returns the remainder of a division. Thus, dx = x%5 assigns 0 to dx because 5 divides 10 perfectly (no remainder).
 y/dx therefore throws an ArithmeticException because of division by 0, which is caught by the catch block.
 In the catch block, "Caught AE" is printed" and then dx is set to 2 and dy becomes 20/2 i.e.10
 x = x/dx => x becomes 10/2 i.e. 5 and y = y/dy => becomes 20/10 i.e. 2
 */

/**Давайте подробно разберем, почему именно такой результат будет при выполнении программы.

 Инициализация:
 java
 Copy code
 int x = 10, y = 20;
 int dx, dy;
 Переменные x и y инициализируются значениями 10 и 20, соответственно.
 Переменные dx и dy объявляются, но еще не инициализированы.
 Блок try:
 java
 Copy code
 dx = x % 5;   // dx = 10 % 5 => dx = 0
 dy = y / dx;  // dy = 20 / 0 (ошибка деления на 0)
 dx = x % 5;:

 Здесь происходит взятие остатка от деления 10 % 5. Остаток от деления 10 на 5 равен 0, поэтому dx = 0.
 dy = y / dx;:

 Попытка деления 20 / 0 вызывает ArithmeticException, так как делить на ноль нельзя. Исключение будет поймано в блоке catch.
 Блок catch:
 java
 Copy code
 System.out.println("Caught AE");
 dx = 2;
 dy = y / dx;  // dy = 20 / 2 => dy = 10
 В блоке catch:
 Выводится сообщение Caught AE, так как ошибка деления на ноль была поймана.
 Переменной dx присваивается значение 2.
 Переменной dy присваивается результат деления y / dx, то есть 20 / 2 = 10.
 После блока try-catch:
 java
 Copy code
 System.out.println(dx + " " + dy);  // dx = 2, dy = 10
 x = x / dx;  // x = 10 / 2 => x = 5
 y = y / dy;  // y = 20 / 10 => y = 2
 System.out.println(x + " " + y);    // x = 5, y = 2
 System.out.println(dx + " " + dy);:

 Печатается текущее значение переменных dx и dy. Теперь dx = 2 и dy = 10, поэтому выводится 2 10.
 x = x / dx;:

 Происходит деление 10 / 2, то есть x = 5.
 y = y / dy;:

 Происходит деление 20 / 10, то есть y = 2.
 System.out.println(x + " " + y);:

 Печатаются новые значения переменных x и y. Теперь x = 5 и y = 2, поэтому выводится 5 2.
 Итоговый вывод:
 Программа напечатает:

 Copy code
 Caught AE
 2 10
 5 2
 Ответ:
 Программа сначала ловит исключение деления на ноль и корректно продолжает выполнение. Все шаги после обработки исключения выполняются корректно, и выводятся следующие значения: 2 10 и 5 2.


 */