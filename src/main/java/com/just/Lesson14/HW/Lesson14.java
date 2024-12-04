package com.just.Lesson14.HW;

//Создать класс.
// В классе создать статичный метод , который будет выводить на экран время в формате " час : минута : секунда "
// в интервале от 0 до 6 часов. Если час больше единицы и минута кратна 10-ти , то метод нужно закончить.
// Если же 5 ( секундв умноженная на час ) больше минуты , то пора переходить на другую минуту. Продемонстрировать данный метод в действии
public class Lesson14 {
    static void time() {

        OUTER:
        for (int hour = 0; hour < 6; hour++) {

            MIDDLE:
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) {  // тут должно быть true and true   тут час не больше 1 то есть false
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }

}
