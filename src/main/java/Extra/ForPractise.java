package Extra;

public class ForPractise {
    public static void main(String[] args) {

        //Практическое задание 1
        //Распечатать все четные числа из массива  numbers2

        int[] numbers2 = {3, 2, 10, 5, 8};

        //цикл вывода четных чисел
        for (int number : numbers2) {
            if (number % 2 == 0) {
                System.out.println("Четных чисела =  " + number);
            }
        }

        System.out.println("____________");


        // Практическое задание 2
        //Распечатать все элементы под четными индексами из массива numbers2

        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0) {
                System.out.println("все элементы под четными индексом  " + numbers2[i]);   //3 10 8
            }

        }
    }
}
