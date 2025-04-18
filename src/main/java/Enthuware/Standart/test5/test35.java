package Enthuware.Standart.test5;

public class test35 {
}
/**Consider the following two classes defined in two java source files.

 //in file /root/com/foo/X.java
 package com.foo;
 public class X{
 public static int LOGICID = 10;
 public void apply(int i){
 System.out.println("applied");
 }
 }

 //in file /root/com/bar/Y.java
 package com.bar;
 //1 <== INSERT STATEMENT(s) HERE
 public class Y{
 public static void main(String[] args){
 X x = new X();
 x.apply(LOGICID);
 }
 }
 What should be inserted at //1 so that Y.java can compile without any error?*/

// import static com.foo.X.*;
// This static import is required because of Y is accessing LOGICID directly without its class name ( i.e. X.LOGICID).


// import com.foo.*;
// This is required because Y also accesses the class X : X x = new X(); If Y had only one statement, System.out.println(LOGICID); import static com.foo.X.* would suffice.
