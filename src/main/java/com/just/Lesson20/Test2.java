package com.just.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        // ADD METHOD

        ArrayList<String> list = new ArrayList<>();
        list.add("poka"); // index 0
        list.add("privet"); // index 2
        list.add("ok"); // index 3
        //list.add("hello"); // index 4  = что бы поставить его на позицию определенную то так
        list.add(1, "hello"); // теперь он идекс 1
        list.add("ok");
        list.add(5, "okк");

        list.add(6, "okк"); //  IndexOutOfBoundsException

        for (String s : list) {
            System.out.println(s + " ");
        }
        //can't do + cause need to use OBJECT
        // int 3,5,-8 + it's not an object, it's an integer
        //  ArrayList<int> list = new ArrayList<>();
        //but all primitive data type has WRAPPER CLASS
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(3);
        System.out.print(list5);
        System.out.println("------ ");
        //GET METHOD
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("poka"); // index 0
        list2.add("privet"); // index 2
        list2.add("ok"); // index 3
        list2.add(1, "hello"); // теперь он идекс 1

        for (String s : list2) {         // 0    1     2      3
            System.out.print(s + " ");  // poka hello privet ok

        }
        System.out.println("---");
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.print(list2.get(3)); //  выводит элемент , у нас это  "ok"
        // System.out.println(list2.get(4)); // IndexOutOfBoundsException


        //SET METHOD
        System.out.println();
        list.set(1, "!!!");
        for (String s : list)
            System.out.print(s + " "); // poka !!! privet ok ok okк okк



    }
}
