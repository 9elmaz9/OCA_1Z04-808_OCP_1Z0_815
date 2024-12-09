package com.just.Lesson18.HW;

public class Exercise1_3 {

    // 3. Сортировка вставками (Insertion Sort)
    // Сортировка вставками работает путём прохода по массиву и вставки каждого элемента в уже отсортированную часть массива.


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // Перемещаем элементы массива, которые больше текущего элемента, на одну позицию вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            // Вставляем текущий элемент на правильную позицию
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
//   Алгоритм работает следующим образом:

//  Начинаем с элемента, который находится сразу после первого.
//  Сравниваем его с элементами слева, пока не находим его правильное место в отсортированной части массива.
//  Этот процесс повторяется для каждого элемента массива.

