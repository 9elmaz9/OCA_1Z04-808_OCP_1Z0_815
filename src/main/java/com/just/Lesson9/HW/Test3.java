package com.just.Lesson9.HW;

public class Test3 {

    int a =1;
    static int b=2;

    // а это параметр   t.adc(4);
    void adc(int a){

        System.out.println(b); //2
        System.out.println(a); //4
        System.out.println(this.a);//1  обращен имеено к обьекту  int a
        System.out.println(Test3.b); //2
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.adc(4);
    }
}
