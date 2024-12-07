package Enthuware.Standart;

public class Test16 {
}

/**
Consider the following classes...
class Teacher{
    void teach(String student){
        * lots of code *
    }
}
class Prof extends Teacher{
    //1
}
Which of the following methods can be inserted at line //1 ?
*/

/**   Option Analysis:
 public void teach() throws Exception

 This does not match the signature of the teach(String) method in Teacher (different parameters).
 Valid as an overloaded method, not as an override.
 Can be inserted.
 private void teach(int i) throws Exception

 This is a new method (overloading, not overriding) because it has a different parameter type.
 The private modifier is valid for new methods in the subclass.
 Can be inserted.
 protected void teach(String s)

 Matches the parent class method signature and is protected, which is less restrictive than default (package-private) in the parent class.
 Valid as an override.
 Can be inserted.
 public final void teach(String s)

 Matches the signature of the parent class method, with a valid public modifier (more permissive than default in the parent class).
 Adding final is valid for overriding but prevents further overriding in subclasses.
 Can be inserted.
 public abstract void teach(String s)

 The abstract keyword is not allowed in a non-abstract class like Prof.
 Cannot be inserted.
 Correct Options:
 The methods that can be inserted are:

 public void teach() throws Exception
 private void teach(int i) throws Exception
 protected void teach(String s)
 public final void teach(String s)
 * */