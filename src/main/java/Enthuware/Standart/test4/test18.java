package Enthuware.Standart.test4;

public class test18 {
}
//    Identify the correct statements about ArrayList?


//ArrayList extends java.util.AbstractList.
/**ArrayList is a subclass of AbstractList.
 java.lang.Object
 -  java.util.AbstractCollection<E>
 -    java.util.AbstractList<E>
 -      java.util.ArrayList<E>
 All Implemented Interfaces:
 Serializable, Cloneable, Iterable<E>, Collection<E>,
 List<E>, RandomAccess*/



//It allows you to access its elements in random order.
/**This is true because you can directly access any element using get(index) method. (This is unlike a LinkedList,
 * in which you have to go through all the elements occuring before Nth element before you can access the Nth element.)*/


//You can sort its elements using Collections.sort() method.
//An ArrayList is a List so you can use it where ever a List is required. This include Collections methods such as sort, reverse, and shuffle.