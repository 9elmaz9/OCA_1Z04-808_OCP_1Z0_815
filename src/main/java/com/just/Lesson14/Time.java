package com.just.Lesson14;

public class Time {

    public void time() {

        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Start outer loop");
            

            INNER:
            for (int minut = 0; minut <= 59; minut++) {
                if (minut == 20) {
                    continue OUTER;
                }
                System.out.println(hour + " : " + minut);

                if (minut==15){break ;} // выбил меня ток из внутртеннего лупа

                if (minut == 30) {
                    break OUTER;       // выбил меня из  внешнего полностью
                }
            }
            System.out.println("End outer loop ");
        } // метод заканчивается тут
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.time();
    }
}
