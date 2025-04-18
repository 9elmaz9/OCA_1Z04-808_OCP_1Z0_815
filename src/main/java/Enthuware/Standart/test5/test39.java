package Enthuware.Standart.test5;

public class test39 {
}
/**What should be placed in the two blanks so that the following code will compile without errors:
 *  class XXX{
 *  public void m() {
 *  throw new RuntimeException();
 *  } } class YYY extends XXX{
 *  public void m() throws Exception{
 *  throw new Exception();
 *  } } public class TestClass {
 *  public static void main(String[] args) {
 *  ______ obj = new ______();
 *  obj.m();
 *  } }*/

//None of the options will make the code compile.

/**
 None of the options will make the code compile.
 Remember that an overriding method can only throw a subset of checked exceptions declared in the throws clause of the overridden method.
 Here, method m in XXX does not declare any checked exception in its throws clause, therefore, method m in YYY cannot declare any checked
 exception in its throws clause either. Class YYY will, therefore, not compile.*/

