package Enthuware.Standart.one;

public class test70 {
}
//Where, in a constructor, can you place a call to a super class's constructor ?

//As the first statement in the constructor.


/**
 * A constructor of a class is meant to initialize the instance of that class. It is an opportunity for the programmer to make the instance ready for use by others. Therefore, when you create an object of a class using the new keyword, the JVM invokes that class's constructor as per the supplied arguments. It is so important that if you don't have any thing that you want to do to the instance and decide to not write a constructor, the compiler automatically creates one constructor for that class.
 *
 * Remember that an instance of a class is also an instance of its super class. Therefore, the fields of its super class need to be initialized as well. Now, observe that a sub class is always aware of its super class and so it can make use of the fields of its super class (depending on accessibility) but a super class has no knowledge of its subclasses. Therefore, the fields defined by the super class must be initialized before the fields of the subclass can be initialized because a subclass constructor may utilize the fields of the super class. This means that a super class constructor must execute before a sub class constructor. This logic applies to all the super classes in the chain right up to java.lang.Object class, since Object class is the root class of all objects. Obviously then, the Object class's constructor must be the first one to execute.
 *
 * The compiler ensures this order of execution of constructors by checking that each constructor of a class first calls either a constructor of its super class or another constructor of the same class. If a constructor of a class doesn't explicitly do that (i.e. it neither calls super class's constructor nor calls another one of its own constructors as the first thing), the compiler automatically inserts a call to the default no-args constructor of the super class. This is same as writing super(); as the first statement in the constructor of the class.
 *
 * Now, what if the super class doesn't have a no-args constructor? Obviously, the automatic call to super(); inserted by the compiler will fail and therefore, the sub class code will fail to*/


/*На этом скриншоте правильный ответ:

As the first statement in the constructor.

        Объяснение: Вызов конструктора суперкласса (super()) должен быть первым оператором в теле конструктора подкласса. Это обязательное правило языка Java. Если вы его не укажете явно, компилятор автоматически добавит super() (если есть конструктор по умолчанию).*/