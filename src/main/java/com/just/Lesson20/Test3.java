package com.just.Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        //SET METHOD 
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            //get по очереди вызываем элемент и подставляем как i
            list.get(i).append("!!!");  // все в конце !!!
        }
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");  //hello!!! ok!!! privet!!!
        }

        System.out.println();
        //REMOVE METHOD
        list.remove(2);  // удаление по индексу
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");   //hello!!! ok!!!
        }
        System.out.println();
        //REMOVE METHOD
        list.remove(new StringBuilder("hello"));  // удаление по Обьекту не происходит , потому что тут создается new  , на ничего ничего не ссылается но
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");   // ничего не удалилось
        }

// у StringBuilder не перезаписан equals method , и значит то же самое что и ==  , а == возвращает true только когда 2 объекта ссылаются на один объект

    }
}
