package Enthuware.Standart.one;

public class test {
}
/***
 *What will be the contents of s1 and s2 at the time of the println statement in the main method of the following program?
 *
 * import java.util.*;
 * public class TestClass{
 *    public static void main(String args[]){
 *       Stack s1 = new Stack ();
 *       Stack s2 = new Stack ();
 *       processStacks (s1,s2);
 *       System.out.println (s1 + "    "+ s2);
 *    }
 *    public static void processStacks(Stack x1, Stack x2){
 * //assume that the method push adds the passed object to the stack.
 *       x1.push (new Integer ("100"));
 *       x2 = x1;
 *    }
 *  }
 * Note:[] is used in the options below to denote each element of the Stack.
 */
//[100] []

/**
 * Theoretically, java supports Pass by Value for everything ( i.e. primitives as well as Objects).  Remember that: 1. Primitives are always passed by value. 2. Object "references" are passed by value. So it looks like the object is passed by reference but actually it is the value of the reference that is passed.          An  example:       Object o1 = new Object();  Let us say, this object is stored at memory location 15000.  Since o1 actually stores just the address of the memory location where the object is stored, it contains 15000.  Now, when you call someMethod(o1); the value 15000 is passed to the method.  Therefore, this is what happens inside the method someMethod():          someMethod( Object localVar) {  localVar now contains 15000, which means localVar also points to the same memory location where the object is stored. Therefore, when you call a method on localVar, it will be executed on the same object.  However, when you change the value of localVar itself, for example, if you do localVar=null,  then localVar starts pointing to a different memory location. But the original variable o1 still  contains 15000 so it still points to the same object.         }  If you need even more detailed explanation, please check http://www.javaranch.com/campfire/StoryPassBy.jsp    This is what happens in this question.  You created two objects in main method: s1 ------------> [ EMPTY ] STACK 1 OBJECT s1 actually contains 15000 (say) s2 ------------> [ EMPTY ] STACK 2 OBJECT s2 actually contains 25000 (say)  inside the method processStacks() :  Step 1: s1 ----> [ EMPTY ] STACK 1 OBJECT <----x1 Local variable s1 and x1 both contain 15000 (say) s2 ----> [ EMPTY ] STACK 2 OBJECT <----x2 Local variable s2 and x2 both contain 25000 (say)  Step 2; s1 -----> [ 100 ] STACK 1 OBJECT <----x1 Local variable Because x1 is referring to the same memory location. s2 -----> [ EMPTY ] STACK 2 OBJECT <---x2 Local variable  Step 3: After doing x2 = x1 s1 ---> [ 100 ] STACK 1 OBJECT <---- x1 and x2 Local variables s1 and x1 both contain 15000 (say) and x2 now also contains 15000. s2 ------------> [ EMPTY ] STACK 2 OBJECT  But s2 still contains 25000.  Note that it is the local variable x2 that is pointing to the same object as x1, which is s1 stack object. The original s2 (of the main method) is still pointing to the same object which is empty.  So when you come back to the main method, you print s1 (which has now 100) and s2 (which is still empty).
 * */