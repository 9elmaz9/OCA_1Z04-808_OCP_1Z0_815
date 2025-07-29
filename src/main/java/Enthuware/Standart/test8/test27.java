package Enthuware.Standart.test8;

public class test27 {
}

//    Which of the following are benefits of ArrayList over an array?

//You do not have to worry about the size of the ArrayList while appending elements.
/**An ArrayList resized dynamically at run time as per the situation. An array cannot be resized once created.
 * This reduces the amount of boiler plate code that is required to do the same task using an array.*/

/*Some candidates have reported getting a similar question with ambiguous options such as "An ArrayList implements Collection API".
 It is anybody's guess as to what is the correct answer.*/

/**Let's analyze the benefits of ArrayList over a regular array in Java.

 The Options:
 "You do not have to worry about the size of the ArrayList while appending elements."

 Correct: One of the primary advantages of using an ArrayList is that it is dynamically resizable. Unlike arrays, whose size is fixed once defined, an ArrayList grows automatically as elements are added, so you don't need to manually manage the size.
 "It consumes less memory space."

 Incorrect: ArrayList typically consumes more memory than a regular array because it needs to maintain the size of the list and dynamically allocate more space when the list grows. Arrays, on the other hand, are contiguous blocks of memory, so they might be more memory-efficient for simple cases where the size is fixed.
 "You do not have to worry about thread safety."

 Incorrect: ArrayList is not thread-safe. If multiple threads access an ArrayList concurrently, it can lead to inconsistent behavior unless proper synchronization is used. Java provides other collections like CopyOnWriteArrayList for thread-safe operations.
 "It allows you to write type-safe code."

 Incorrect: While ArrayList does provide a way to write type-safe code with generics, this is not exclusive to ArrayList. Regular arrays also allow type safety through their element types. So, this is not a unique benefit over arrays.
 Correct Answer:
 "You do not have to worry about the size of the ArrayList while appending elements."*/