package Enthuware.Standart.test8;

public class test3 {
}
//    Which of the following options will yield a Boolean wrapper object containing the value true?


//Boolean.valueOf(true)


//Boolean.valueOf("trUE")


//Boolean.TRUE

/**You need to remember the following points about Boolean:  1. Boolean class has two constructors - Boolean(String) and Boolean(boolean)
 * The String constructor allocates a Boolean object representing the value true if the string argument is not null and is equal, ignoring case,
 * to the string "true". Otherwise, allocate a Boolean object representing the value false. Examples: new Boolean("True") produces a Boolean
 * object that represents true. new Boolean("yes") produces a Boolean object that represents false.  The boolean constructor is self explanatory.
 * 2. Boolean class has two static helper methods for creating booleans - parseBoolean and valueOf. Boolean.parseBoolean(String ) method returns
 * a primitive boolean and not a Boolean object (Note - Same is with the case with other parseXXX methods such as Integer.parseInt - they return
 * primitives and not objects). The boolean returned represents the value true if the string argument is not null and is equal, ignoring case,
 * to the string "true".  Boolean.valueOf(String ) and its overloaded Boolean.valueOf(boolean ) version, on the other hand, work similarly but
 * return a reference to either Boolean.TRUE or Boolean.FALSE wrapper objects. Observe that they dont create a new Boolean object but just return
 * the static constants TRUE or FALSE defined in Boolean class.  3. When you use the equality operator ( == ) with booleans, if exactly one of
 * the operands is a Boolean wrapper, it is first unboxed into a boolean primitive and then the two are compared (JLS 15.21.2). If both are Boolean wrappers,
 * then their references are compared just like in the case of other objects. Thus, new Boolean("true") == new Boolean("true") is false,
 * but new Boolean("true") == Boolean.parseBoolean("true") is true. */


//not correct


//Boolean.parseBoolean(" true ")
//This will return false because of the extra spaces at the ends. Remember that case of the argment is ignored but spaces are not.


//Boolean.parseBoolean("true")
//Although this will return true but it is still not a valid answer because parseBoolean returns a primitive and not a Boolean wrapper object.


