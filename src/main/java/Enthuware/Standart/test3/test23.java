package Enthuware.Standart.test3;

public class test23 {
}
/**Which statements about the output of the following programs are true?

 public class TestClass{
 public static void main(String args[ ] ){
 int i = 0 ;
 boolean bool1 = true;
 boolean bool2 = false;
 boolean bool  = false;
 bool = (bool2 &  method1("1"));  //1
 bool = (bool2 && method1("2"));  //2
 bool = (bool1 |  method1("3"));  //3
 bool = (bool1 || method1("4"));  //4
 }
 public static boolean method1(String str){
 System.out.println(str);
 return true;
 }
 }*/

//1 will be the part of the output.

/*& (unlike &&), when used as a logical operator, does not short circuit the expression, which means it
always evaluates both the operands even if the result of the whole expression can be known by just evaluating the left operand.*/


//3 will be the part of the output.

/*& and | (unlike && and ||), when used as logical operators, do not short circuit the expression,
which means they always evaluate both the operands even if the result of the whole expression can be known by just evaluating the left operand.*/


