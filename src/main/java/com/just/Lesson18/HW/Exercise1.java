package com.just.Lesson18.HW;

/* Создайте класс, в котором создайте метод sortirovka. Инпут параметром данного метода будет одномерный массив типа int.
 * Метод должен возвращать уже отсортированный по возростанию массив.
 * Продемонстрирйте данный метод*/
public class Exercise1 {
    public static int[] sortirovka(int[] array) {  // принимает параметр типа int[] и возвращаем тоже int[]
// этот цикл  for нашел минимальный  элемент нашего array  и поставил его на первую позицию

        // пример был такой массив {0,5,-3,2}   и стал такой  {}
        //                         {-3,5,0,2}  тут мы поставили на первый -3 и пошли дальше то есть первый занят
        //                         {-3,0,5,2} и потом дальше , первые два уже заняты идем дальше
        //                         {-3,0,2,5}
        int a; // создаем переменную
        for (int i = 0; i < array.length; i++) {
            int min = array[i]; // наш минимум нулевой элемент = 0 ; -3
            int index = i; // назначаем i = 0 ;2
            for (int j = i + 1; j < array.length; j++) { // заходим в цикл ,j который всегда будет больше i на 1 , то есть j = 1
                if (array[j] < min) {
                    min = array[j]; // чекаем элемент меньше ли он минимума
                    index = j;
                }

            }
            //тут именно обмен элементов надо ли
            // тут смотрим если индек поменялся от начала то есть смысл заходить в луп, если нет то зачем
            if (i != index) { // это условие true  потому что   min=0; -3  a index=0;2   то есть  -3 и 2 не равны !=
                a = array[i]; // c помощью а будем менять местами
                array[i] = min; // -3
                array[index] = a; // 0
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
/**Этот пример демонстрирует, как можно отсортировать массив с помощью метода сортировки выбором (Selection Sort). Давайте разберём код шаг за шагом:

 1. Метод sortirovka(int[] array)
 Этот метод принимает одномерный массив целых чисел array и возвращает отсортированный массив.

 Основной цикл:

 java
 Copy code
 for (int i = 0; i < array.length; i++) {
 Этот цикл проходит по всем элементам массива, начиная с первого. Он будет искать минимальный элемент в оставшейся части массива.

 Нахождение минимального элемента: Внутри основного цикла находится второй цикл:

 java
 Copy code
 for (int j = i + 1; j < array.length; j++) {
 Этот цикл начинается с элемента, который находится сразу после текущего элемента, и продолжает проверять все остальные элементы массива.

 Сравнение элементов:
 java
 Copy code
 if (array[j] < min) {
 min = array[j];
 index = j;
 }
 Если текущий элемент массива меньше найденного минимального, то мы обновляем переменную min и сохраняем индекс этого минимального элемента в переменную index.
 Обмен элементов: После того как минимальный элемент найден, мы проверяем, нужно ли менять текущий элемент на найденный минимальный:

 java
 Copy code
 if (i != index) {
 a = array[i];
 array[i] = min;
 array[index] = a;
 }
 Если индекс текущего элемента (i) отличается от индекса минимального элемента (index), то мы меняем их местами, используя временную переменную a.

 2. Метод main
 В методе main создаётся массив, который мы хотим отсортировать:

 java
 Copy code
 int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
 Затем вызывается метод sortirovka(array), который сортирует этот массив. После этого выводятся все элементы отсортированного массива:

 java
 Copy code
 for (int i = 0; i < array.length; i++) {
 System.out.println(array[i]);
 }
 Пример работы алгоритма
 Предположим, что у нас есть массив:

 java
 Copy code
 {5, 8, 1, -3, 0, 8, 2, 2}
 Алгоритм будет работать так:

 В первый проход он найдёт минимальный элемент (-3) и поставит его на первое место. Массив станет: {-3, 8, 1, 5, 0, 8, 2, 2}.
 Во втором проходе он найдёт минимальный элемент среди оставшихся (0) и поставит его на второе место. Массив станет: {-3, 0, 1, 5, 8, 8, 2, 2}.
 Далее он будет продолжать этот процесс до тех пор, пока весь массив не будет отсортирован.
 Результат:
 После выполнения метода сортировки, вывод в консоль будет:

 diff
 Copy code
 -3
 0
 1
 2
 2
 5
 8
 8
 Пояснения:
 Алгоритм сортировки выбором работает путём нахождения минимального элемента в оставшейся части массива и его обмена с текущим элементом. Это простой, но не самый эффективный способ сортировки, особенно для больших массивов, так как его время работы — O(n²).*/