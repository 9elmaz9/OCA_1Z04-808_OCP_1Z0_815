package Enthuware.Standart.test5;

public class test1 {
}
//    Identify correct option(s)

//    Multiple inheritance of state includes ability to inherit instance fields from multiple classes.

//    Multiple inheritance of type includes ability to implement multiple interfaces and/or ability to extend from multiple classes.

/**Interfaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces. In this way, Java supports multiple inheritance of types.
 "State", on the other hand, is represented by instance fields. Only a class can have instance fields and therefore, only a class can have a state. (Fields defined in an interface are always implicitly static, even if you don't specify the keyword static explicitly. Therefore, an interface does not have any state.) Since a class is allowed to extend only from one class at the most, it can inherit only one state. Thus, Java does not support multiple inheritance of state.

 This is an important concept and is explained in more detail here: https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html*/


//not correct
//Multiple inheritance of state includes ability to inherit instance methods from multiple classes.
/*Methods do not have state. Ability to inherit instance methods from multiple classes is called multiple inheritance of implementation.
Default methods introduce one form of multiple inheritance of implementation. A class can implement more than one interface,
which can contain default methods that have the same name. However, such a class cannot be compiled. In this case, the implementing class
is required to provide its own implementation of the common method to avoid ambiguity.*/

//Multiple inheritance of type includes ability to inherit instance fields as well as instance methods from multiple classes.

//Multiple inheritance of type includes ability to implement multiple interfaces and ability to inherit static or instance fields from interfaces and/or classes.
