package Enthuware.Standart.test5;

public class test43 {
}
/**What can be inserted at //1 and //2 in the code below so that it can compile without errors:

 class Doll{
 String name;
 Doll(String nm){
 this.name = nm;
 }
 }

 class Barbie extends Doll{
 Barbie(){
 //1
 }
 Barbie(String nm){
 //2
 }
 }
 public class TestClass {
 public static void main(String[] args) {
 Barbie b = new Barbie("mydoll");
 }
 }*/


//this("unknown"); at 1 and super(nm); at 2


//super("unknown"); at 1 and super(nm); at 2

/**Since the super class Doll explicitly defines a constructor, compiler will not provide the default no-args constructor.
 * Therefore, each of Barbie's constructors must directly or indirectly call Doll's string argument constructor,
 * otherwise it will not compile. Although not relevant for this question, it is interesting to know that super(name);
 * at //1 or //2, would not be valid because name is defined in the superclass and so it cannot be used by a subclass
 * until super class's constructor has executed. For the same reason, this(name); cannot be used either.*/

