package com.just.Lesson18.HW;

public class Exercise1_2 {

   // 2. Сортировка пузырьком (Bubble Sort)
  //  Сортировка пузырьком — это ещё один простой способ сортировки массива. Она работает путём многократного прохода по массиву, сравнения соседних элементов и обмена их местами, если они находятся в неправильном порядке.

        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Меняем местами элементы
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
            bubbleSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
 //   Алгоритм работает следующим образом:

 //   Он сравнивает два соседних элемента массива и меняет их местами, если они в неправильном порядке.
 //   Каждый проход сокращает количество элементов, которые нужно проверить, так как самый большой элемент "всплывает" на своё место.
