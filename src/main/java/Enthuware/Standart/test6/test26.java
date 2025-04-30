package Enthuware.Standart.test6;

public class test26 {
}
/**
 Given the following class, which of these are valid ways of referring to the class from outside of the package com.enthu?


 package com.enthu;
 public class Base{
 // lot of code...
 }

 */


//By importing com.enthu.* and referring to the class as Base.


//By referring to the class as com.enthu.Base.

/**A class or interface can be referred to by using its fully qualified name or its simple name. Using the fully qualified name will always work,
 *  but to use the simple name either the class must be in the same package or it has to be imported. By importing com.enthu.* all the classes
 *  from the package will be imported and can be referred to using simple names. Importing com.* will not import the subpackage enthu.
 *  It will only import the classes in package com.*/