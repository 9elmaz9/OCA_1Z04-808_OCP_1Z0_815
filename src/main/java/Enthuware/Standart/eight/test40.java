package Enthuware.Standart.eight;

public class test40 {
}
/**What will the following class print when run?
 public class Sample{
 public static void main(String[] args)  {
 String s1 = new String("java");
 StringBuilder s2 = new StringBuilder("java");
 replaceString(s1);
 replaceStringBuilder(s2);
 System.out.println(s1 + s2);
 }
 static void replaceString(String s) {
 s = s.replace('j', 'l');
 }
 static void replaceStringBuilder(StringBuilder s) {
 s.append("c");
 }
 }*/



//javajavac

/**String is immutable while StringBuilder is not. So no matter what you do in replaceString() method,
 * the original String that was passed to it will not change. On the other hand, StringBuilder methods,
 * such as replace or append, change the StringBuilder itself.
 *  So, 'c' is appended to java in replaceStringBuilder() method.*/