package Enthuware.Standart.test2;

public class test23 {
}
//Which of the following are benefits of an array over an ArrayList ?

//It consumes less memory.
/*This is an ambiguous option because in certain situation an ArrayList may consume a little bit more memory than an array
(because of additional internal data structure and pointers),
while in some other situation it may consume less (when your array is only half full).*/



//Accessing an element in an array is faster than in ArrayList.
//Although very little, but a direct array access using an index is faster than calling a method on ArrayList.

/**An ArrayList resized dynamically at run time as per the situation. An array cannot be resized once created.
 *  This reduces the amount of boiler plate code that is required to do the same task using an array.
 *  Some candidates have reported getting a similar question with ambiguous options such as "An ArrayList implements Collection API".
 *  It is anybody's guess as to what is the correct answer.*/

/*Question:
Which of the following are benefits of an array over an ArrayList?

Explanation:
"It consumes less memory."

True.
Arrays in Java are more memory-efficient because they do not store additional metadata like ArrayList, which manages capacity and stores objects with extra overhead.
"Accessing an element in an array is faster than in ArrayList."

True.
Arrays provide direct indexed access, whereas ArrayList involves a method call (get(index)) to retrieve an element, which adds slight overhead.
"You do not have to worry about thread safety."

False.
Arrays and ArrayList are both not thread-safe by default. You would still need synchronization in multithreaded environments.
"It implements Collection interface and can thus be passed wherever a Collection is required."

False.
Arrays are not part of the Collection framework. ArrayList implements List and Collection, making it compatible with APIs requiring a Collection.
Correct Answers:
"It consumes less memory."
"Accessing an element in an array is faster than in ArrayList."**/