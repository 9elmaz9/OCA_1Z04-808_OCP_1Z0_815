package com.just.Lesson9.HW;
// нет оутпута
public class Test1 {
    int a =1;
  //  static int a =2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1  t = new Test1();
        t.abc(3);
    }
}
