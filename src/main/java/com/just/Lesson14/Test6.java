 package com.just.Lesson14;

//выводим на экран каждую минуту времени
// 00:00
// 00:01
// 1:00 итд
public class Test6 {
    public void time() {

        //outer loop
        for (int hour = 0; hour <= 23; hour++) {      // 24 это уже будет 0
            System.out.println("Start outer loop");
            //inner loop
            for (int minut = 0; minut <= 59; minut++) {
                for (int sec =0 ; sec<=59;sec++){
                    System.out.println(hour + ":" + minut+" :"+ sec);
                }

              // закоментила ибо добавила секунды   System.out.println(hour + " : " + minut);  // 0 0  и идет дальше в inner loop до 58  и плюс 59 а после него 60 не равен FALSE
                // и больше не срабатывает внутренний лум и  потом идет в outer loop и так продолжается до конца
            }
            System.out.println("End outer loop ");
        } // метод заканчивается тут
        //ограничений по loop нет
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }

}
