package com.just.Lesson20;

import com.just.Lesson10.Homework.Lesson10.p1.p2.p3.C;
import com.just.Lesson7.A;

import java.util.ArrayList;
import java.util.List;

// you can add everything in ArrayList(beside primitive data type) cause  in fundament ArrayList sit Object . Object is absolut class
public class Test1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        StringBuilder st = new StringBuilder("ok");
        list.add(st);


        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list9 = new ArrayList<>(list2); // создается новый обьект такой же как list2
        list2.add("HELOO");
        // can't do+ another type + not String  list2.add(s);
        System.out.println(list2==list9); // false  , ссылаются на разные обьекты

        //also can do like
        ArrayList<String> list3 = new ArrayList();

        //example
        ArrayList<StringBuilder> list4 = new ArrayList();
        //Extra , cause   ArrayList is  the List
        List<StringBuilder> list5 = new ArrayList();
        list5.add(new StringBuilder("HELOoO"));



    }
}

class Car {
}

class Student {
}