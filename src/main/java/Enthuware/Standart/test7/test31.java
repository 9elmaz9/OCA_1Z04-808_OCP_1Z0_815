package Enthuware.Standart.test7;

public class test31 {
}
/**Consider that str is a local variable of class java.lang.String. Which of the following
 *  lines of code may throw a NullPointerException in certain situations?
 * Or a tougher version of the question could be : Which of the following lines of code are not an example of robust design ?*/

//
//if ( (str != null) | ( i == str.length() ) )
//(i == str.length()) will always be executed so if 'str' is null, then str.length() will throw a NullPointerException.


//if ( (str == null) | ( i == str.length() ) )
//(i == str.length()) will always be executed so if 'str' is null, then str.length() will throw a NullPointerException.


//if ( (str != null) || (i == str.length() ) )
//(i == str.length()) will only be evaluated if (str != null) is false, and (str != null) will be false if 'str' is null. So it will also throw a NullPointerException.

    /**The concept is : || and && are short circuiting operation i.e. if the value of the expression can be known by just seeing
    the first part then the remaining part is not evaluated while | and & will always let all the parts evaluates.
     Let's break this down in two cases:
     1. Say str = null;

     for a, the first part is false and str.length() throws NullPointerException because str is null.
     for b, the first part of it is true but it will still evaluate the second part and as str is null, str.length() throws NullPointerException.
     Had it been || instead of |, the second part would not have been evaluated and no exception would have been thrown.
     for c, the first part of it is false and it will also evaluate the second part which will throw a NullPointerException as str is null.
     for d, the first part is true, so the second part is not evaluated.
     2. Say,str = "somestring"; //i.e. str is not null.
     for a, the first part is true, so is the second part.
     No exception is thrown. Note that second part will still be evaluated although by looking at the first
     part itself we can tell that the whole expression will return true.
     for b, the first part is false, and the second part is also true. No exception is thrown.
     for c, first part is true, so second part is not evaluated at all. No exception is thrown.
     for d, first part is false, so it will evaluate second part. No exception is thrown as str is not null.
     It would be nice if you try to run the following program to understand the concept :
     (Uncomment only one of the commented lines one by one).
     public class TestClass {
     public static void main(String[] args) {
     int i = 0;
     String s = "";
     //s = null;
     if ((s != null) | ( i==s.length())) {}
     System.out.println("A");
     //s = null; if ((s == null) | ( i==s.length())) {}
     System.out.println("B");
     //s = null; if ((s != null) || (i==s.length())) {}
     System.out.println("C");  s = null; if ((s == null) || (i==s.length())) {} System.out.println("D"); } }*/