package com.just.Lesson6;

public class MethodOverloading2 {

 public    int sum(int i1, int i2) {
        return i1 + i2;
    }

  protected   String sum(String s1, String s2) {
        return s1 + s2;
    }



 // protected  void sum (int a ,int b){          // cant do
 //     System.out.println("HEYYYY");
 // }

    protected  void sum (int a ,String b){
        System.out.println("HEYYYY");
    }
}

class MethodOverloading2Test {

    public static void main(String[] args) {
        MethodOverloading2 oM2 = new MethodOverloading2();

        int a = oM2.sum(5,7);
        System.out.println(a);

        String s = oM2.sum("Hi"," dear");
        System.out.println(s);
    }
}