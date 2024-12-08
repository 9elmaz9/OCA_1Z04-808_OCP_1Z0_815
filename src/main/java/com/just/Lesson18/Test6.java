package com.just.Lesson18;

public class Test6 {
    // Наша задача написать метод который принимает в параметры  массив и выводит на экран его наибольший и наименьший элемент

    public static void maxMin(double[] array) {
        double max = array[0]; // самый первый элемент с индексом 0
        double min = array[0];

        for (int i = 0; i < array.length; i++) { // тут проверяем каждый последующий элемент  с первого до конца

            // если какой то элемент будет больше максимума то он теперь максимум
            if (array[i] > max) { // и сравниваем его с максимумом  , если первый элемент больше максимума
                max = array[i];  // тогда максимум будет это первый элемент array
                //далее проверяется вторым элементов , если нет то ничего не делаю, то максимум теперь будет 2й элемент array
            }
            // то же самое делаем для минимума
            if (array[i] < min) {
                min = array[i];
            }
        }
        //после этого
        System.out.println("Minimalniy element massiva :" + min + " .Maximalniy element massiva :" + max);

    }

    public static void main(String[] args) {
        double array1[] = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array1);
        System.out.println();
        /// так нельзя делать  maxMin({2.5,3});
        //но
        maxMin(new double[]{2.5, -1.3});
    }
}
