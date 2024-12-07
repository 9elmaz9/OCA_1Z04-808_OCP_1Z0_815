package com.just.Lesson16;

public class Test9 {

    // мы сравниваем два объекта , они ссылаются на разные объекты

    public static void main(String[] args) {

        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2); // false
        // таким образом, как выше мы можем сравнить только адреса объектов, а не их содержимое

        System.out.println(s1.equals(s2)); // true


        // next
        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4); //true

        //   System.out.println(true);// само предложило
        System.out.println(s3.equals(s4));

        // !=
        System.out.println(s1 != s4); // true  s1 НЕ РАВЕН s4

        // Method equalsIgnoreCase
        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equals(s11)); // false cause not same
        System.out.println(s10.equalsIgnoreCase(s11)); // true , игнору нет разницы сравнивае только текст

    }
}
