package com.just.Lesson1_3;

public class test7 {
    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;

        System.out.println(!a); //
        System.out.println(!true);


        int aa = 10;
        int bb = 5;

        // boolean c = aa > bb;  classic
        boolean c = !(aa > bb);  // if its true then result gonna be false
        System.out.println(c);

        int h = 10;
        int j = 50;
        int k = 0;
        int l = 100;
        //  boolean m = h > j && k == l;  // true && false = false
        boolean m = h < j && k++ == l;  // true && false = false = same result
        //boolean m = h>j && k++==l;  // false   doesnt check what next  and k++ doesnt change

        System.out.println(m);
        System.out.println(k);

        System.out.println(k);

        int h1 = 10;
        int j1 = 50;
        int k1 = 99;
        int l1 = 100;
        // false ||  true = true
        //  true in or = true
        boolean m1 = h > j || ++k1 == l; // false || true ( ++k ==l  -> ++k = 1+99 = 100 ==100  soooo true )
        //if
        // boolean m = a<b || ++c==d; ig in first case its true tnen it dosnt check  next ++c==d  , so ++c= still 99 but if you want
        // if you want to check it so use
        // boolean m = a<b | ++c==d;  | +cc in ran now , same false but second part is  also run
        // boolean m = h<j & k++==l;

        System.out.println(m1);
        System.out.println(k1);


        int x = 10;
        int y = 5;
        System.out.println(x | y);



        boolean b2= true;
        boolean b3= true;
        boolean b4= true;
        boolean b5= true;
        System.out.println(b2^b3^b4^b5); // false

        //all false is false

        boolean bb2= true;
        boolean bb3= true;
        boolean bb4= false;
        boolean bb5= true;
        System.out.println(bb2^bb3^bb4^bb5); // false
        //b2^b3 - true true = false ^ b4   - fasle  and false = false ^b5 - b5 true and with false result is TRUE
        //true ^ true ->false ( 2true=false)
        //false ^ false -> false
        //felse ^ true -> true
        // overall result is FALSE - cause  ^ go from th left to right
        //and we look at if its like that :
        //odd num or true values ->result is true
        //even num or false values result is false

        //if & exclusive ^ tneh true - goood
        boolean bbb2= false;
        boolean bbb3= false;
        boolean bbb4= true;
        boolean bbb5= false;
        System.out.println(bbb2^bbb3^bbb4^bbb5); // true



    }
}
