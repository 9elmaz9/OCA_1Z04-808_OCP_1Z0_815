package com.just.Lesson13.EXTRA;

public class Switch {
    public static void main(String[] args) {

        //1 - понедельник ... 7 - воскресенье
        int numberDay = 1;


        // var 1
        if (numberDay == 1) {
            System.out.println("Понедельник");
        } else if (numberDay == 2) {
            System.out.println("Вторник");  // ит.д
        } else {
            System.out.println("Данного дня не существует");
        }

        //var2
        switch (numberDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 7:
                System.out.println("Воскресенье");
            default:
                System.out.println("Данного дня не существует");
                break;
        }

  /**      //java 17
        switch (numberDay) {
            case -> System.out.println("Понедельник");
            case -> System.out.println("Вторник");
            case -> System.out.println("Воскресенье");
            default -> System.out.println("Данного дня не существует");

        }
   */

    }
}
