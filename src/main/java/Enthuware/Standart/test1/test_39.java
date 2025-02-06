package Enthuware.Standart.test1;

public class test_39 {
}
/**Consider the following two classes defined in two .java files.

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
 //1  <== INSERT STATEMENT(s) HERE
 public class Y{
 public static void main(String[] args){
 System.out.println(X.LOGICID);
 }
 }
 What should be inserted at //1 so that Y.java can compile without any error?*/


//import com.foo.*;

/*
import com.foo.*;
This is required because Y is accessing class X. static import of LOGICID is NOT required because Y is accessing LOGICID through X ( X.LOGICID). Had it been just System.out.println(LOGICID), only one import statement: import static com.foo.X.*; would have worked. */