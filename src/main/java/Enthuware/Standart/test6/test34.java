package Enthuware.Standart.test6;

public class test34 {
}
//    Assume that a, b, and c refer to instances of primitive wrapper classes. Which of the following statements are correct?

//a.equals(a) will always return true.

//a.equals(b) returns false if they refer to instances of different classes.

/**Equals method of a primitive wrapper class ( e.g. java.lang.Integer, Double, Float etc) are 1. symmetric => a.equals(b) returns same as b.equals(a) 2. transitive => if a.equals(b) and b.equals(c) return true, then a.equals(c) returns true. 3. reflexive => a.equals(a) return true.  For example, the following code for the equals method on Integer explains how it works:
 * public boolean equals(Object obj) {
 * if (obj instanceof Integer)
 * {
 * return value == ((Integer)obj).intValue();
 * }
 * return false;
 * }*/