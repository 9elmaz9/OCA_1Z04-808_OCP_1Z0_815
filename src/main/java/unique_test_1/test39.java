package unique_test_1;

public class test39 {
}
/**Consider the following code appearing in Eagle.java
 class Bird {
 private Bird(){     }
 }
 class Eagle extends Bird {
 public String name;
 public Eagle(String name){
 this.name = name;
 }

 public static void main(String[] args) {
 System.out.println(new Eagle("Bald Eagle").name);
 }
 }
 What can be done to make this code compile?*/

/**Make Bird constructor
 * public: public Bird() { ... }
 *
 */

/**Since the constructor of Bird is private, the subclass cannot access it and therefore, it needs to be made public. protected or default access is also valid.*/