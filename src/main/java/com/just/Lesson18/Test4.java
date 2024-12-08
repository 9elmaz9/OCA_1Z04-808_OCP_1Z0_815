package com.just.Lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};


        // Method sort(array)
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");   // 1 9 3 -8 0 5 4 1
        }

        System.out.println();

        // теперь давайте его отсортируем и выведем на экран с помощью класса Arrays
        // сортирует от меньшего значения к большему
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " "); //-8 0 1 1 3 4 5 9
        }

        System.out.println();

        // Method binarySearch (array, value)
        // выполняет поиск определенного value в определенном array , НО КОРРЕКТНО БУДЕТ РАБОТАТЬ В УЖЕ ОТСОРТИРОВАННОМ МАССИВЕ
        int index1 = Arrays.binarySearch(array1, -8); // назначили переменную index1 индекс элемента -8 в array1
        System.out.println(index1); //0

        int index = Arrays.binarySearch(array1, 5); // назначили переменную index индекс элемента 5 в array1
        System.out.println(index); //6

        //если элемент не будет найден он будет возвращать нам отрицательный индекс 7
        int index3 = Arrays.binarySearch(array1, 10); // у нас нет такого элемента
        System.out.println(index3); //-9
        // каа же это вычислить  то по идее если бы у нас была десятка тут в отсортированном  массиве, на последнем месте
        // index  0 1 2 3 4 5 6 7 8     у нашей 10 был бы index 8 , ставим минус перед этим индексом и получается у нас -8 и отнимаем еще единицу  и получаем -9 , собственно это наш ответ
        //       -8 0 1 1 3 4 5 9 10

        //еще такой рассмотрим
        int index4 = Arrays.binarySearch(array1, 2); // у нас нет такого элемента
        System.out.println(index); // -5
        // наша двойка была бы межу 1 и 3 , то есть индекс ее был бы 4 , ставим минус перед, получает -4  и отнимаем еще единицу, и получается -5
        // index  0 1 2 3 4 5 6 7 8
        //       -8 0 1 1 2 3 4 5 9 10


        System.out.println();
        System.out.println(array1); // [I@27f674d
        //что б такого не было то надо писать так
        // у массива метод toString не перезаписан
        System.out.println(Arrays.toString(array1)); // [-8, 0, 1, 1, 3, 4, 5, 9]
        System.out.println();

        //ВЫВОД НА ЭКРАН

        //Для одномерного массива:

        int[] array11 = {-8, 0, 1, 2, 3, 4, 5, 9, 10};
        System.out.println(Arrays.toString(array11)); // Выведет содержимое массива: [-8, 0, 1, 2, 3, 4, 5, 9, 10]

        //Для многомерного массива
        int[][] array12 = {{-8, 0, 1}, {2, 3, 4}, {5, 9, 10}};
        System.out.println(Arrays.deepToString(array12)); // Выведет содержимое многомерного массива
        //[[-8, 0, 1], [2, 3, 4], [5, 9, 10]]


        //Для одномерного массива:

        int[] array15 = {-8, 0, 1, 2, 3, 4, 5, 9, 10};
        for (int i = 0; i < array15.length; i++) {
            System.out.print(array15[i] + " "); // Выводим элементы массива через пробел
            //-8 0 1 2 3 4 5 9 10
        }

        System.out.println();

        //Для многомерного массива:
        int[][] array16 = {{-8, 0, 1}, {2, 3, 4}, {5, 9, 10}};

        for (int i = 0; i < array16.length; i++) {
            for (int j = 0; j < array16[i].length; j++) {
                System.out.print(array16[i][j] + " "); // Выводим элементы массива через пробел
            }
            System.out.println(); // Переход на новую строку для каждого вложенного массива
            // -8 0 1
            // 2 3 4
            // 5 9 10

            System.out.println(array16[1][1]); //3
        }


    }
}
