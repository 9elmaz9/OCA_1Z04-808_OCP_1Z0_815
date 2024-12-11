package com.just.Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test7_1 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        //ЭТО ПОВТОРИТЕЛЬ  Iterator
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {  // смотрит есть дальше след элемент или нет,  после последнего false  закончилось

            System.out.println(it.next());  //next выдает
        }
        //эти два работают одинаково
        //ЭТО ПОВТОРИТЕЛЬ  Iterator
        ListIterator<String> it2 = list1.listIterator();
        while (it2.hasNext()) {  // смотрит есть дальше след элемент или нет,  после последнего false  закончилось

            System.out.println(it2.next());  //next выдает
        }
        // с помощью ListIterator  можно удалить элемент  ArrayList , а с помощью for each NOT  , с обычным for можно
        //вот пример удаления
        ListIterator<String> it3 = list1.listIterator();
        while (it3.hasNext()) {  // смотрит есть дальше след элемент или нет,  после последнего false  закончилось
            it.next(); // чекает есть послед элемент ? да , remove
            it.remove();
        }
    }
}
