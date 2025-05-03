package Enthuware.Standart.test6;

public class test36 {
}
/**You have been given an array of objects and you need to process this array as follows -
 1. Call a method on each object from first to last one by one.
 2. Call a method on each object from last to first one by one.
 3. Call a method on only those objects at even index (0, 2, 4, 6, etc.)

 Which of the following are correct?*/

//Enhanced for loop can be used for only the first task. For the rest, standard for loops can be used.

/**The enhanced for loop is tailor made for processing each element of a collection (or an array) in order.
 * Most importantly, it does not give you an iterating variable that you can manipulate and that makes it
 * impossible to change the order or to skip an element. Therefore, tasks 2 and 3 cannot be done by an enhanced for loop.
 * The standard for loop is very flexible.
 * It can do pretty much anything. Here is how you can do task 2 and 3 using a standard for loop -
 * //processing in reverse for(int i=arr.length-1; i>=0; i--){ arr[i].m1(); }
 * //processing alternate for(int i=0; i<arr.length; i=i+2){ arr[i].m1(); }*/