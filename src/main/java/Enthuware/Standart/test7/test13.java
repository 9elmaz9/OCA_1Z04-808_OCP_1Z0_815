package Enthuware.Standart.test7;

public class test13 {
}
/**Given the following code:
 * interface Movable{
 *  int offset = 100;
 *  public void move(int dx);
 *  } interface Growable{
 *  public void grow(int dy);
 *  }
 * class Animal implements Movable, Growable{
 * public void move(int dx){ }
 * public void grow(int dy){ }
 * }*/

//Animal class illustrates Java's support for multiple inheritance of type.

/**Interfaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces. In this way, Java supports multiple inheritance of types.
 "State", on the other hand, is represented by instance fields. Only a class can have instance fields and therefore, only a class can have a state. (Fields defined in an interface are always implicitly static, even if you don't specify the keyword static explicitly. Therefore, an interface does not have any state.) Since a class is allowed to extend only from one class at the most, it can inherit only one state. Thus, Java does not support multiple inheritance of state.

 This is an important concept and is explained in more detail here: https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html*/