package Enthuware.Standart.test3;

public class test42 {
}
/**Given the following definition of class, which member variables are accessible from OUTSIDE the package com.enthu.qb?
 *  package com.enthu.qb; public class TestClass{
 *  int i;
 *  public int j;
 *  protected int k;
 *  private int l;
 *  }*/


//Member variable j.
//public things (classes, methods and fields) are accessible from anywhere.

//Member variable k, but only for subclasses.
//protected things (methods and fields) can be accessed from within the package and from subclasses

/**public > protected > package (i.e. no modifier) > private where public is least restrictive and private is most restrictive.
 *  Remember: protected is less restrictive than package access. So a method(or field) declared as protected will be accessible
 *  from a subclass even if the subclass is not in the same package. The same is not true for package access.
 *  A top level class can only have either public or no access modifier but a method or field can have all the four.
 *  Note that static, final, native and synchronized are not considered as access modifiers.*/

