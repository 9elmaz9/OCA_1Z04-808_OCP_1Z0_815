package com.just.Lesson13.HW;

// В классе Month создайте метод, у которого 1 параметр тирп данных int=
// Этот параметр будет указывать порядковый номер месяца.
// Используя функуионал switch , выведете на экран колличество дней этого месяца 2015 год
// Проверьте работу данного меотда в main
public class Lesson13 {
}

class Month {

    //static  потому что обьект не нужен
    public static void dayQuantity(int n) {
        switch (n) {
            case 2:
                System.out.println("Колличество дней в месяце : 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Колличество дней в месяце : 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Колличество дней в месяце : 31");
                break;
            default:
                System.out.println("Месяца с таким порядковым номером не существует");
        }
    }

    public static void main(String[] args) {
        Month.dayQuantity(0);
        dayQuantity(1);
        Month.dayQuantity(2);
        dayQuantity(4);
        Month.dayQuantity(5);

    }
}