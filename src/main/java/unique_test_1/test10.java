package unique_test_1;

public class test10 {
}
/**Identify the correct statements about ArrayList?*/

/*An ArrayList cannot store primitives.*/
/**This is true because only objects can be stored in it.
 *  Note that the following is valid though:
 *  List l = new ArrayList(); l.add(1);
 *  Although 1 is a primitive, it is valid because it will be wrapped into
 *  an Integer object before being passed to the list.*/

/*It allows constant time access to all its elements.*/
/**This is true because it implements java.util.RandomAccess interface,
 *  which is a marker interface that signifies that you can directly access
 *  any element of this collection. This also implies that it takes the same
 *  amount of time to access any element.  (Compare that with a LinkedList,
 *  which takes more time to access the last element than the first element.)*/

/*An ArrayList is backed by an array.*/
/**This is true. The elements are actually stored in an array and that is why is it called an ArrayList.
 *  (The expression "backed by an array" means that the implementation of ArrayList actually uses an array
 *  to store elements.)*/


/*ArrayList is a subclass of AbstractList.
 java.lang.Object
  -java.util.AbstractCollection<E>
  -java.util.AbstractList<E>-
 java.util.ArrayList<E>
   All Implemented Interfaces: Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
    Direct Known Subclasses: AttributeList, RoleList, RoleUnresolvedList*/