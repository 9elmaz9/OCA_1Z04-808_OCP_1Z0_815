package com.just.Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        //extra  creating String
        String s = new String(array);
        System.out.println(s); // privet

        System.out.println();

        //extra creating StringBuilder
        //метод append добавить
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array, 2, 3); // 2 говорит с какой позиции массива добавляем и сколько элементов мы добавляем , за это отвечает 3 тройка
        System.out.println(sb); //Hello Worldive


        // Метод insert
        StringBuilder sb1 = new StringBuilder("Hello World");
        char[] array2 = {'p', 'r', 'i', 'v', 'e', 't'};
        sb1.insert(2, array2, 1, 3); // 2я позиция вместо буковли l ,отодвигаем ее и будет инсертить туда массив  перед l  с позиции 1 первой   'r', 'i', 'v'
        System.out.println(sb1);  // Herivllo World




    }
}
