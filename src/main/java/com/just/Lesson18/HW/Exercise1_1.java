package com.just.Lesson18.HW;

import java.util.Arrays;

public class Exercise1_1 {

    // 1. Сортировка с использованием встроенной функции Arrays.sort()
    //  Java предоставляет встроенный метод для сортировки массивов, который использует более эффективный алгоритм сортировки (обычно это триасортировка или сортировка слиянием).


    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        Arrays.sort(array); // Встроенная сортировка массива

        // Вывод отсортированного массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
//В этом случае не нужно вручную писать алгоритм сортировки, Java позаботится о том, чтобы отсортировать массив. Этот метод обычно работает быстрее, чем алгоритм сортировки выбором.


