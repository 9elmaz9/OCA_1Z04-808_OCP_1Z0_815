package com.just.Lesson6;

public class MethodOverloading {
    //  void showInt(int i1) {
    //      System.out.println(i1);
    //  }
    //  void showBoolena(boolean b1) {
    //      System.out.println(b1);

    //  }
    //  void showString (String s1) {
    //      System.out.println(s1);
    //  }
    // перегружаем эти методы

    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is Boolean");

    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");

    }


    // above 2 same methods but in different arg order
    void show(String s1, int a) {
        System.out.println("String "+ s1 +" ,Int "+a);
    }

    void show( int a,String s1) {
        System.out.println( "What a nice day !");
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        // mO.showInt(100);
        // mO.showInt(a); before overloading

        boolean b = true;
        // mO.showBoolena(b); before overloading

        String s = "Hey ";
        //mO.showString(s); before overloading

        //after overloading
        mO.show(a);   //ищет метод по имени и типу данных a=int
        mO.show(b);
        mO.show(s);

        mO.show("hey you",10); // String hey you ,Int 10


        mO.show(10,"boo");    // What a nice day !

    }
}