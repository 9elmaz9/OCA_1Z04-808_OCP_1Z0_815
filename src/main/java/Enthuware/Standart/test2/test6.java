package Enthuware.Standart.test2;

public class test6 {
}
/**Given: //in file Movable.java package p1;
 * public interface Movable {
 *  int location = 0;
 *  void move(int by);
 *  public void moveBack(int by); }
 *  //in file Donkey.java package p2;
 *  import p1.Movable; public class Donkey implements Movable{
 *  int location = 200;
 *  public void move(int by) {
 *  location = location+by;
 *  }
 *  public void moveBack(int by) {
 *  location = location-by;
 *  }
 *  }
 *  //in file TestClass.java package px;
 *
 *  import p1.Movable; import p2.Donkey; public class TestClass {
 *  public static void main(String[] args) {
 *  Movable m = new Donkey();
 *  m.move(10);
 *  m.moveBack(20);
 *  System.out.println(m.location);
 *  } }
 *  Identify the correct statement(s).*/
//It will print 0 when TestClass is run.

/**There is no problem with the code. All variables in an interface are implicitly public, static, and final.
 * All methods in an interface are public. There is no need to define them so explicitly.
 * Therefore, the location variable in Movable is public and static and the move() method is public.
 * Now, when you call m.move(10) and m.moveBack(20), the instance member location of Donkey
 * is updated to 190 becausethe reference m refers to a Donkey at run time and so move and moveBack methods of Donkey are invoked at runtime.
 * However, when you print m.location, it is the Movable's location (which is never updated) that is printed.*/

/*Let's analyze the code:

Key Details:
Interface Movable:

Declares a field int location = 0; which is implicitly:
public, static, and final (as all fields in interfaces are).
Declares two methods: move(int by) and moveBack(int by).
Class Donkey:

Implements Movable.
Defines its own int location field initialized to 200.
Implements the methods move(int by) and moveBack(int by), modifying the location field of the Donkey object.
Class TestClass:

Creates a Movable reference m pointing to a Donkey object.
Invokes move(10) and moveBack(20) on m.
Attempts to print m.location.
Key Observations:
Field Access in Interfaces:

m.location refers to the location field declared in the Movable interface, which is static and final with the value 0.
This is because fields in interfaces are not overridden by implementing classes; the location field in the Donkey class is unrelated to the location field in the Movable interface.
Runtime Behavior:

m.move(10) and m.moveBack(20) modify the location field of the Donkey object. However, when printing m.location, the location field from the Movable interface is accessed, which is always 0 and does not change.
Correct Statements:
The code compiles successfully because there are no errors in the declarations or implementations.
The output of the program will be 0, as m.location refers to the location field in the Movable interface, which is a static final constant with the value 0.
Final Answer:
The code compiles successfully.
The output is 0.
*/




/*Да, именно так. В интерфейсе все поля автоматически считаются public, static и final, даже если это явно не указано.

В случае вашего примера:

java
Copy code
int location = 0;
это эквивалентно следующей записи:

java
Copy code
public static final int location = 0;
Особенности:
static: Поле принадлежит самому интерфейсу, а не объектам его реализаций.
final: Значение этого поля неизменно. После инициализации его нельзя изменить.
public: Поле доступно отовсюду, где доступен интерфейс.
Следствия:
Поле location из интерфейса Movable всегда будет равно 0, и его нельзя изменить ни в интерфейсе, ни в классах, которые этот интерфейс реализуют.
Переменная location в классе Donkey является совершенно другой переменной. Она не имеет отношения к location из интерфейса, хотя и называется так же.
Вывод:
Поле int location = 0; в интерфейсе Movable всегда неизменно и будет иметь значение 0.*/