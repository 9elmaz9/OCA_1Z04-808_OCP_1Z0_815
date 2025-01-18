package Enthuware.Standart.one;

public class test60 {
}
//Which of the following are true about the "default" constructor?

//It is provided by the compiler only if the class does not define any constructor.

//It calls the no-args constructor of the super class.

/**
 * The default constructor is provided by the compiler only when a class does not define ANY constructor explicitly. For example,
 * public class A{
 *   public A()  //This constructor is automatically inserted by the compiler
 * //because there is no other constructor defined by the programmer explicitly.
 *   {
 *     super();  //Note that it calls the super class' default no-args constructor.
 *   }
 * }
 * public class A{
 *   //Compiler will not generate any constructor
 * //because the programmer has defined a constructor.
 *   public A(int i){
 *      //do something
 *   }
 * }*/


/**Вопрос касается "конструктора по умолчанию" в Java, также известного как default constructor.

 Что такое "конструктор по умолчанию"?
 Конструктор по умолчанию:

 Создаётся компилятором только если вы не определили никаких конструкторов в классе.
 Не принимает аргументов.
 Инициализирует поля экземпляра класса их значениями по умолчанию:
 0 для чисел,
 false для логических значений,
 null для ссылочных типов.
 Вызывает конструктор без аргументов суперкласса (например, super()).
 Объяснение вариантов:
 "It is provided by the compiler only if the class does not define any constructor."

 Верно. Конструктор по умолчанию создаётся только в том случае, если в классе вообще нет других конструкторов.
 "It initializes the instance members of the class."

 Верно. Он инициализирует все поля экземпляра значениями по умолчанию (или теми значениями, которые вы явно задали).
 "It calls the no-args constructor of the super class."

 Верно. Конструктор по умолчанию вызывает super(), если суперкласс имеет конструктор без аргументов. Если такого конструктора нет, код не скомпилируется.
 "It initializes instance as well as class fields of the class."

 Неверно. Конструктор по умолчанию не инициализирует статические поля (class fields), так как они инициализируются отдельно, при загрузке класса.
 "It is provided by the compiler if the class does not define a 'no-args' constructor."

 Неверно. Это утверждение не точное. Конструктор по умолчанию предоставляется только если нет вообще никаких конструкторов в классе, а не только конструктора без аргументов.
 Правильные ответы:
 It is provided by the compiler only if the class does not define any constructor.
 It initializes the instance members of the class.
 */