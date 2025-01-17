package Enthuware.Standart.one;

public class test52 {
}
/**Given:
 *  //In file AccessTest.java
 *  package a;
 *  public class AccessTest {
 *  int a;
 *  private int b;
 *  protected void c(){ }
 *  public int d(){  return 0; } }
 *
 *  //In file AccessTester.java
 *  package b; import a.AccessTest;
 *  public class AccessTester extends AccessTest{
 *  public static void main(String[] args) {
 *  AccessTest ref = new AccessTest();      } }
 *  Idenfity the correct statements -*/

/*
Only d() can be accessed by ref.*/

/**
 * The wording of this question is a bit vague because it is not clear what is meant by "can be accessed by".
 * Expect such wording in the real exam as well. Our guess is that it means what variables of class AccessTest can be accessed using the reference named ref.
 * Since a public member is always accessible to every one, ref.d() is definitely correct. private is only accessible within that class, therefore,
 * b cannot be accessed from anywhere outside of class AccessTest. A default (aka package protected) member is accessible only from members of the same package.
 * Since AccessTester is in a different package a cannot be accessed from AccessTester either.  Now, the question is only about the method c().
 * A protected member is inherited by a subclass and it is therefore accessible in the subclass. However, In the words of Java Language Specification,
 * protected members of a class are accessible outside the package only in subclasses of that class, and only when they are fields of objects
 * that are being implemented by the code that is accessing them. Basically, it implies that a protected member is accessible in the subclass
 * only using a reference whose declared type is of the same subclass (or its subclass.).  In this case, the declared type of ref is AccessTest,
 * which is not of the same type as the class from which you are trying to access c(). Therefore, you cannot do ref.c() in AccessTester.
 * If you had AccessTester ref = new AccessTester(); you could do ref.c() because now the declared type of ref (i.e. AcessTester)
 * is the same subclass from which you are trying to access c(). It will work even if the declared type of the reference is a child of the subclass.
 * For example, the following would be valid as well. SubAccessTester ref = new SubAccessTester(); ref.c(); //this is valid Where SubAccessTester
 * is a subclass of AccessTester - class SubAccessTester extends AccessTester{ }*/

/*В данном примере мы анализируем доступ к членам класса AccessTest из класса AccessTester, который находится в другом пакете, но наследует AccessTest. Вот как это работает:

Разбор:
int a:

Поле a имеет package-private доступ (без модификатора). Это значит, что оно доступно только внутри одного и того же пакета. Класс AccessTester находится в другом пакете (package b), поэтому доступ к этому полю невозможен.
private int b:

Поле b является private. Это значит, что оно доступно только внутри класса AccessTest и недоступно даже для наследников, включая AccessTester.
protected void c():

Метод c() имеет protected доступ. Это означает, что он доступен для наследников, даже если они находятся в другом пакете. Так как AccessTester наследует AccessTest, то метод c() доступен.
public int d():

Метод d() является public. Это значит, что он доступен из любого места, в том числе из класса AccessTester.
Итог:
c() и d() доступны, так как:
c() — protected и доступен через наследование.
d() — public и доступен из любого места.
Правильный ответ:
Only c() and d() can be accessed by ref.*/