package com.just.Lesson20;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        System.out.println(list1 == list2);// false
        System.out.println();
        System.out.println(list1.get(0) == list1.get(0)); //true


        list1.get(0).append("!!!!");
        list1.set(0, new StringBuilder("D"));
        System.out.println(list1.get(0)); // D  ссылается на новый обьект
        System.out.println(list2.get(0)); // A!!!!    а тут не поменялся , потому что он ссылается на тот обьект что и раньше


/*
        //for same
        ArrayList<StringBuilder> list3 = list1;
        System.out.println(list3);  // [A, B, C]
*/

    }
}
