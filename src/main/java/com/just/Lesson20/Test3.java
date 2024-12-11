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
        // но можем удалить так
        System.out.println();
        //REMOVE METHOD
        list.remove(sb1);  // удаление по Обьекту
        list.remove("ok");  // удаление по Обьекту
        list.add(1, new StringBuilder("wow"));
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");   //
        }


        // addAll method
        //типы данных должны совпадать
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("hello");
        list5.add("ok");
        list5.add("privet");
        for (String s : list5) {
            System.out.print(s + " ");   //
        }
        System.out.println();

        ArrayList<String> list6 = new ArrayList<>();
        list6.add("Petrov");
        list6.add("Ivannoc");

        list5.addAll(1,list6);
        for (String ss : list5) {
            System.out.print(ss + " ");   // hello Petrov Ivannoc ok privet

        }

        // clear method - just remove everything
       // list5.clear();





// у StringBuilder не перезаписан equals method , и значит то же самое что и ==  , а == возвращает true только когда 2 объекта ссылаются на один объект

    }
}
