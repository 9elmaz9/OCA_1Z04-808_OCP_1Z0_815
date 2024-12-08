package com.just.Lesson18;

public class Test5 {
    static public  void main(String[] args) {
        //можно что б метод main был такой
  //public static void main(String[] array3) {
        // static public  void main(String[] args)

            int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[] = array2; //  array3 будет ссылатся на тот же обьект что и array2

        System.out.println(array1 == array2); //false  эти переменные ссылаются на разные объекты
        System.out.println(array3 == array2); //true  эти переменные ссылаются на один объект

        //выведем на экран сравнение этих array при помощи equals

        System.out.println(array1.equals(array2)); // false   следовательно метод  equals в  array не перезаписан , как например у String
        System.out.println(array3.equals(array2)); // true    потому что equals тут работает как ==

        array1[1]=0;
        array2[5-3]=3;  // эквивалентно  array2[2]=3; потому что происходит обычное вычитание 5-3
        System.out.println(array2[2]); //3       origin : int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};

        // еще раз напоминалка вывести весь массив, ЭТОТ ЦИКЛ БУДЕТ ВЫВОДИТЬ ВСЕ ЭЛЕМЕНТЫ МАССИВА array2. ОДИН ЗА ЖРУГИМ
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
        System.out.println(array2.length); //8

       // array1[array1.length]=10; // компилятор пропустит, но будет ArrayIndexOutOfBoundsException   + у нас просто нет такого


    }
}
