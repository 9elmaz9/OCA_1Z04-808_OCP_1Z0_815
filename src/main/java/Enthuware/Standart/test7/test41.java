package Enthuware.Standart.test7;

public class test41 {
}
/**What will be the output of the following class:

 public class TestClass{
 public void testRefs(String str, StringBuilder sb){
 str = str + sb.toString();
 sb.append(str);
 str = null;
 sb = null;
 }
 public static void main(String[] args){
 String s = "aaa";
 StringBuilder sb = new StringBuilder("bbb");
 new TestClass().testRefs(s, sb);
 System.out.println("s="+s+" sb="+sb);
 }
 }*/


//s=aaa sb=bbbaaabbb

/**Always remember that Strings are immutable, you cannot change them. In this case, s refers to "aaa",
 *  and no matter what testRefs() method does, the variable s of main() will keep pointing to the same string "aaa".*/