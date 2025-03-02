package Enthuware.Standart.test2;

public class test40 {
}
/**Consider the following lines of code:
 *  Integer i = new Integer(42);
 *  Long ln = new Long(42);
 *  Double d = new Double(42.0);
 *  Which of the following options are valid code fragments?*/


//i.equals(d);


//d.equals(ln);



//
//ln.equals(42);

/**The concept to understand here is as follows -
 If the compiler can figure out that something can NEVER happen, then it flags an error. In this question, the compiler knows that ln, i or d can never point to the same object in any case because they are references to different classes of objects that have no relation ( superclass/subclass ) between themselves.*/