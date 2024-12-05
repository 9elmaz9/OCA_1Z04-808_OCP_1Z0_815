package Extra;

public class ForI {
    public static void main(String[] args) {
                       //0   1  2  3
        int[] numbers = {1, 2, 3, 4,};

        // 0 1 2
        for (int i = 0; i < 3; i++) {  // 1 создается переменная = 0 , дальше условие true или false в случае выполнения которого код в скобках дальше будет выполнен
            System.out.println("Значение  i : " + i);  // 0 1 2
            //Здесь цикл начинается с индекса 3 (последний элемент массива).
            System.out.println(numbers[i]);   // i++ начинает отсчет от нуля 1 2 3
            System.out.println(" ");
        }

        // Вывод в перевернутом порядке
        for (int i = 3; i >= 0; i--) {
            System.out.println("Вывод в перевернутом порядке " + numbers[i]);  // 4 3 2 1
            System.out.println(" ");
        }

        // Все элементы массива , кроме последниз двух
        for (int i = 0; i < numbers.length - 2; i++) {
            System.out.println("Все элементы массива , кроме последниз двух " + numbers[i]);  // 1 2
            System.out.println(" ");
        }

        // Практическое задание
        //Распечатать все четные числа из массива numbers2
        int[] numbers2 = {3, 2, 10, 5, 8};
        for (int number :numbers2){
            if (number%2==0){  //  четное число делится на 2 без остатка, 2/2=0 /   3/2= остаток 1
                System.out.println(number);  // 2 10 8
            }
        }

    }
}
