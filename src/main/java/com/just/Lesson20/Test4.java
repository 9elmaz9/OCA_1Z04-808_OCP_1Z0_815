package com.just.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb=new StringBuilder("poka");
        list.add(sb);

        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for (StringBuilder sb1 : list) {
            System.out.println(sb1 + " ");
        }

        // ищем по индексу
        System.out.println(list.indexOf(new StringBuilder("poka"))); // equald будет сравнивать с 4 обьектами и не найдет , ибо этот новый, и результат будет -1


        //contains
        System.out.println(list.contains(new StringBuilder("poka"))); //false  CAUSE new
        System.out.println(list.contains(sb)); //true  CAUSE  it is the same object
        // like ==   contains

        System.out.println(list.toString()); //[poka, poka, privet, ok, hello]

    }
}
