package Enthuware.Standart.eight;

public class Test24 {
}

/*
Given the following contents of two java source files:

package util.log4j;
public class Logger  {
  public void log(String msg){
      System.out.println(msg);
  }
}

and

package util;
public class TestClass {
    public static void main(String[] args) throws Exception {
        Logger logger = new Logger();
        logger.log("hello");
    }
}

What changes, when made independently, will enable the code to compile and run?
*
* */


/**
 *Problem Recap:
 * The Logger class is in the package util.log4j.
 * The TestClass is in the package util but does not import or fully qualify Logger.
 * This causes a compilation error.
 * Option Analysis:
 * Replace Logger logger = new Logger(); with log4j.Logger logger = new log4j.Logger();
 *
 * This change uses the fully qualified name for the Logger class.
 * It avoids the need for an import and resolves the ambiguity.
 * Valid solution.
 * Replace package util.log4j with package util;
 *
 * This moves the Logger class into the same package as TestClass (util), removing the need for an import.
 * Valid solution.
 * Replace Logger logger = new Logger(); with util.log4j.Logger logger = new util.log4j.Logger();
 *
 * This also uses the fully qualified name for Logger.
 * Similar to option 1, it avoids the need for an import and resolves the issue.
 * Valid solution.
 * Remove package util.log4j from Logger.
 *
 * This removes the Logger class from the util.log4j package, leaving it in the default package.
 * However, this is not a good practice, and it does not align with the problem structure, as the class should remain in util.log4j.
 * Not valid.
 * Add import log4j; to TestClass.
 *
 * This is incorrect because the correct import would need to be import util.log4j.Logger;.
 * The provided import statement (log4j;) is invalid syntax in Java.
 * Not valid.
 * Correct Answers:
 * Replace Logger logger = new Logger(); with log4j.Logger logger = new log4j.Logger();
 * Replace package util.log4j with package util;
 * */