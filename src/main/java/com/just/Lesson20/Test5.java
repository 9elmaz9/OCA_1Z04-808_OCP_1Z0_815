package com.just.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));  // index 0
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));  // index ,
        list.add(new String("hello"));
        for (String s : list) {
            System.out.println(s + " ");
        }

        // ищем по индексу
        System.out.println(list.indexOf(new String("poka"))); //0 выдается индект первого совпадения, третий не бачить
        System.out.println(list.lastIndexOf(new String("poka"))); //3 выдается индект  с последнего  совпадения
    // если обьект не  найдет вообще будет писать -1  минус один
    }
}
