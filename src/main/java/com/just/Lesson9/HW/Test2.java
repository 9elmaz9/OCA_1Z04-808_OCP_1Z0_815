package com.just.Lesson9.HW;

public class Test2 {
    int a =1;
    static  int b =2;

    // берется параметр а , не  инт который выше . а наш параметр это 5 который в мейн методе   abc(5); он и есть наша а параметр тут
    static  void abc( final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
