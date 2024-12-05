package Extra;

import java.util.Arrays;

//многомерные массивы
public class MultiArray {

    public static void main(String[] args) {

        // Ограбили магазин. Вор был ростом 178
        //Следователь нашел две группы людей около магазина. Задача найти вора по росту

        //Вот у меня есть две группы подозреваемых , и я хочу теперь перебрать их и найти 178 кто
        int group[] = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        // мне надо создать массив, который храни другие массивы, что бы пройтись по нему
        int[][] multiArray = {group, group2};

        // for ( тип переменной имя  : массив )  не нужно указывать инедексы вручную ,это плюс

        //что бы закончить этот основной for, нужно дать лейбу
        //OUTER:
        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) { // break; Закончит только этоо for
                //  System.out.println(Arrays.toString(array)); // так выводим
                //  System.out.print(number +" "); //180 178 190 165 195 193
                //но мы идем дальше ибо ищем 178
                if (number == 178) {
                    System.out.println("HAH!! The thief has been found. His heigh is " + number);
                    //1    break;  // не остановит , потмоу что это же  вложенный
                    break upperFor; // остановит весь for
                } else {
                    System.out.println("The man was not the right height." + number);
                }
            }

        }
    }
}
