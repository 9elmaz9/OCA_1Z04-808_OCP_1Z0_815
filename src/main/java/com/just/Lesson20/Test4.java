package com.just.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for (StringBuilder sb : list) {
            System.out.println(sb + " ");
        }

        // ищем по индексу
        System.out.println(list.indexOf(new StringBuilder("poka"))); // equald будет сравнивать с 4 обьектами и не найдет , ибо этот новый, и результат будет -1

    }
}
