/**package com.just.Lesson19.HW;
Домашнее задание:

Создайте метод abc, инпут параметр которого – N-ое количество массивов типа String. В методе создайте новый массив, который будет состоять из элементов массивов-параметров и будет выводом данного метода. В методе main вызовите метод abc и его элементы, которые равны значением command line параметров, присвойте значение null. Выведите элементы обновлённого массива на экран. Везде, где возможно, используйте foreach loop. Запустите приложение с командной строки,
public class Lesson19_HW {

    public static String[] abc(String[] ... array1) {
        int length = 0;
        for (String[] array2 : array1) {
            length += array2.length; //  сумма длин
        }

        String[] target = new String[length];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] =s;
                count++;
            }
            return target;
        }
        public static void main (String[]args){

            String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});

            for (String s : args) {
                for (int i = 0; i < target.length; i++) {
                    if (s.equals(target[i])) {   // если написать гаоборот то будет NullPointerException
                        target[i] = null;

                    }
                }

                for (String s : target) {
                    System.out.println(s + " ");
                }

            }
        }
    }
}
*/