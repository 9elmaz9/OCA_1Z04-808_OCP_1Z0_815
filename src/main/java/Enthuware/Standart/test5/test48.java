package Enthuware.Standart.test5;

public class test48 {
}
/**Given the following class definition:

 class A{
 protected int i;
 A(int i) {    this.i = i;    }

 }
 // 1 : Insert code here
 Which of the following would be a valid class that can be inserted at //1 ?*/


//class B {}


//class B { B() {} }

/**Notice that class A does not define a no-argument constructor. Also note that the class B does not define a constructor. Thus, class B relies on the default constructor B(). Class B's default constructor looks like this:
 B() {} //It is not public because class B is not public
 However, Constructors implicitly (if an explicit call to the superclass's constructor is not present) call their superclass's constructor super(). So, class B's default constructor actually looks like this:
 B(){
 super();
 }
 Now, since class A does not define a no-argument constructor the above code will not compile. However, class B would be correct if changed to:
 class B extends A{
 B(){
 super(1); // pass it any integer
 }
 // or
 B(int number){
 super(number);
 }
 }
 You could also add a no-argument constructor to class A and leave class B as is.*/
