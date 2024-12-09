package com.just.Lesson18.HW;

public class Exercise1_4 {
   // 4. Сортировка слиянием (Merge Sort)
  //  Это более сложный алгоритм, который использует метод "разделяй и властвуй". Массив делится на две части, каждая из которых сортируется рекурсивно, а затем они сливаются в один отсортированный массив.
        public static void mergeSort(int[] array) {
            if (array.length <= 1) {
                return;
            }

            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }

        public static void merge(int[] array, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }

            while (i < left.length) {
                array[k++] = left[i++];
            }

            while (j < right.length) {
                array[k++] = right[j++];
            }
        }

        public static void main(String[] args) {
            int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
            mergeSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
 //   Алгоритм сортировки слиянием работает следующим образом:

  //  Массив делится на две половины.
  //  Каждая из половин сортируется рекурсивно.
  //  Затем отсортированные части сливаются в новый отсортированный массив.

/**
 * Сравнение методов:
 *
 * Arrays.sort(): Очень эффективен и использует более сложные алгоритмы, такие как сортировка слиянием или триасортировка.
 *
 * Bubble Sort и Selection Sort: Эти методы просты в реализации, но медленные для больших массивов (O(n²)).
 *
 * Insertion Sort: Эффективен для небольших массивов или массивов, которые уже частично отсортированы.
 *
 * Merge Sort: Эффективен для больших массивов (O(n log n)) и гарантированно работает за время O(n log n), но использует дополнительную память для разделения массива.
 *
 * Выбор алгоритма зависит от размера массива и требований к производительности.*/