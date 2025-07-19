package Enthuware.Standart.eight;

public class test36 {
}
/**What will the following code print ?
 *  class Test{
 *  public static void main(String[] args){
 *  int k = 1;
 *  int[] a = { 1 };
 *  k += (k = 4) * (k + 2);
 *  a[0] += (a[0] = 4) * (a[0] + 2);
 *  System.out.println( k + " , " + a[0]);
 *  } }*/

//25 , 25


/**The value 1 of k is saved by the compound assignment operator += before its right-hand
 *  operand (k = 4) * (k + 2) is evaluated.
 *  Evaluation of this right-hand operand then assigns 4 to k, calculates the value 6 for k + 2,
 *  and then multiplies 4 by 6 to get 24. This is added to the saved value 1 to get 25,
 *  which is then stored into k by the += operator. An identical analysis applies to the case that uses a[0].
 *  k += (k = 4) * (k + 2);
 *  a[0] += (a[0] = 4) * (a[0] + 2);
 * k = k + (k = 4) * (k + 2);
 * a[0] = a[0] + (a[0] = 4) * (a[0] + 2);*/


/**Let's break down the given code and understand what will be printed when it runs:

 Code:
 java
 Copy code
 class Test {
 public static void main(String[] args) {
 int k = 1;
 int[] a = { 1 };
 k += (k = 4) * (k + 2);
 a[0] += (a[0] = 4) * (a[0] + 2);
 System.out.println(k + ", " + a[0]);
 }
 }
 Explanation of each step:
 Initialization:

 k = 1
 a = {1} (this is an array with one element, a[0] = 1)
 First line: k += (k = 4) * (k + 2);

 Step 1: The expression (k = 4) assigns 4 to k. Now, k is 4.
 Step 2: (k + 2) is evaluated with the new value of k. So, k + 2 becomes 6.
 Step 3: The multiplication 4 * 6 equals 24.
 Step 4: The original value of k (which was 1) is updated with k += 24. So, k = 1 + 24 = 25.
 Second line: a[0] += (a[0] = 4) * (a[0] + 2);

 Step 1: The expression (a[0] = 4) assigns 4 to a[0]. Now, a[0] is 4.
 Step 2: (a[0] + 2) is evaluated with the new value of a[0]. So, a[0] + 2 becomes 6.
 Step 3: The multiplication 4 * 6 equals 24.
 Step 4: The original value of a[0] (which was 1) is updated with a[0] += 24. So, a[0] = 1 + 24 = 25.
 Output:

 After these operations, k = 25 and a[0] = 25.
 The System.out.println(k + ", " + a[0]); statement prints: 25, 25.
 Conclusion:
 The correct answer is:

 25, 25*/