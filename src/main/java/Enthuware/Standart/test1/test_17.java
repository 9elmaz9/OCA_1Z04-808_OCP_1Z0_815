package Enthuware.Standart.test1;

public class test_17 {
}
/**Consider the following method...  public int setVar(int a, int b, float c) { ...}  Which of the following methods correctly overload the above method?*
 *
 *
 *
 */
/*
public int setVar(int a, float b, int c){ return (int)(a + b + c); }*/

/*
public float setVar(int a){ return a; }*/


/*A method is said to be overloaded when the other method's name is same and parameters ( either the number or their order) are different. Option 2 is not valid Because of the line: return this(a, c, b); This is the syntax of calling a constructor and not a method. It should have been: return this.setVar(a, c, b);*/