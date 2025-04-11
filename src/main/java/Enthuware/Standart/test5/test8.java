package Enthuware.Standart.test5;

public class test8 {
}
/*What will the following code print when run without any arguments ...

public class TestClass {

    public static int m1(int i){
        return ++i;
    }

    public static void main(String[] args) {

        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);
    }

}*/

//6


/*When the program is run without any arguments, args gets assigned a string array of size 0. So NullPointerException or ArrayIndexOutOfBoundsException are out of question.
Thus, the first call becomes : int k = m1(0);  Follow through the code like this:
1. Method m1() uses pre-increment operation. Therefore, first i is incremented and then the new value of i is returned.
2. Thus, k gets the value of 1.
 3. Expand the += operator as: k = k + 3 + ++k;
 This becomes (remember that k = 1 at this point):
 k = 1 + 3 + (++k) i.e.
 k = 1 + 3 + 2; (at this point value of k is 2 because of ++k). But the value of Right Hand Side has not yet been assigned to k.
  k = 6; 6 is assigned to k thereby overwriting the value of 2.

   Therefore, the final value of k is 6.**/

