package Enthuware.Standart;

public class Test23 {
}/**
 Which of the following are benefits of an array over an ArrayList?
 что из предложенного является преимущество массива перед ArrayList

 Explanation:
 1,"It consumes less memory."
 True.
 Arrays in Java are more memory-efficient because they do not store additional metadata like ArrayList, which manages capacity and stores objects with extra overhead.


 2,"Accessing an element in an array is faster than in ArrayList."
 True.
 Arrays provide direct indexed access, whereas ArrayList involves a method call (get(index)) to retrieve an element, which adds slight overhead.

 3,"You do not have to worry about thread safety."
 False.
 Arrays and ArrayList are both not thread-safe by default. You would still need synchronization in multithreaded environments.

 4,"It implements Collection interface and can thus be passed wherever a Collection is required."
 False.
 Arrays are not part of the Collection framework. ArrayList implements List and Collection, making it compatible with APIs requiring a Collection.


 Correct Answers:
 "It consumes less memory."
 "Accessing an element in an array is faster than in ArrayList."*/
