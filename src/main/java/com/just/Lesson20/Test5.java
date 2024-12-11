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

        //ищем по индексу
        //  indexOf
        System.out.println(list.indexOf(new String("poka"))); //0 выдается индект первого совпадения, третий не бачить

        //lastIndexOf
        System.out.println(list.lastIndexOf(new String("poka"))); //3 выдается индект  с последнего  совпадения
        // если обьект не  найдет вообще будет писать -1  минус один
        System.out.println();
        System.out.println();


        //SIZE
        System.out.println(list.size());//5


        // isEmpty
        System.out.println(list.isEmpty());//false

        //list.clear()
       // System.out.println(list.isEmpty());//true

        //contains
        System.out.println(list.contains("poka")); //true
        System.out.println(list.toString()); //[poka, privet, ok, poka, hello]



    }
}
