package Enthuware.Standart.test3;

public class test27 {
}
/**What will the following class print when compiled and run?

 class Holder{
 int value = 1;
 Holder link;
 public Holder(int val){ this.value = val; }
 public static void main(String[] args){
 final Holder a = new Holder(5);
 Holder b = new Holder(10);
 a.link = b;
 b.link = setIt(a, b);
 System.out.println(a.link.value+" "+b.link.value);
 }

 public static Holder setIt(final Holder x, final Holder y){
 x.link = y.link;
 return x;
 }

 }*/

//It will throw an exception when run.
//When method setIt() executes, x.link = y.link, x.link becomes null because y.link is null so a.link.value throws NullPointerException.
