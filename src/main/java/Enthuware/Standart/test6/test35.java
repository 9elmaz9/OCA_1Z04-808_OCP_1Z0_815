package Enthuware.Standart.test6;

public class test35 {
}
/**What will the following code print?
 *  List s1 = new ArrayList( );
 *  s1.add("a"); s1.add("b");
 *  s1.add("c"); s1.add("a");
 *  if(s1.remove("a")){
 *  if(s1.remove("a")){
 *  s1.remove("b");
 *  }else{
 *  s1.remove("c");
 *  } }
 *  System.out.println(s1);*/


//[c]

/**ArrayList's remove(Object ) method removes the first occurence of the given element and returns true if found.
 * It does not remove all occurences of the element. In this case, the first call to s1.remove("a");
 * will remove only the first "a" and return true, the second call to remove("a") will remove the second "a" and return true.
 * Finally, the call to remove("b") will remove "b". Therefore, only "c" will be left in the list.
 * The JavaDoc API description of this method is important for the exam -  public boolean remove(Object o)
 * Removes the first occurrence of the specified element from this list, if it is present (optional operation).
 * If this list does not contain the element, it is unchanged. More formally,
 * removes the element with the lowest index i such that (o==null?get(i)==null:o.equals(get(i))) (if such an element exists).
 * Returns true if this list contained the specified element (or equivalently, if this list changed as a result of the call).*/