package Enthuware.Standart.test1;

public class test_34 {
}
/**Which of the following is a legal return type of a method overriding the given method:
 *  public Object  myMethod() {...}
 *  (Select the best option.)*/

//Return type can be any class since all objects can be cast to Object.

/*Version 1.5 onwards, Java allows covariant return types, which means that an overriding method can have its return type as any subclass of the return type of the overridden method.

Here, since the return type of the original method is Object, the overriding method can return any object type because all classes in Java ultimately extend from Object.
Note that covariant return types is not applicable to primitives. So for example, if the overridden method returns int, the overriding method's return type must also be int. It cannot be short or long. It cannot even be Integer.*/