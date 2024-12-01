package com.just.Lesson13;

public class Test1 {
}

class Student {

    // for IF ok
    double grade;

    // for switch INT
    int grade1;

    Student(double grade) {
        this.grade = grade;
    }

    Student(int grade1) {
        this.grade1 = grade1;
    }

    public static void main(String[] args) {
        Student st = new Student(3);
        Student st1 = new Student(7);

        // if with double
        if (st.grade == 2) {
            System.out.println("Student is bad");
        } else if (st.grade == 3) {
            System.out.println("Student is mid");
        } else if (st.grade == 4) {
            System.out.println("Student is ok");
        } else if (st.grade == 5) {
            System.out.println("Student is goog");
        } else {
            System.out.println("grade is wrong");
        }

        // with int
        // тож можно  switch (3) начнется с тройки
        switch (st1.grade1) {  // switch означет что вы будете что то с чем то сравнивать  в скобках то сто сравнивает дальше идет код само сравнение
            case 2:
                System.out.println("Student is  bad");
                break; // тормозит после верного , что бы в нужное время выйти из тела switch
            case 3:
                System.out.println("Student is mid");
                break;
            case 4:
                System.out.println("Student ok");
                System.out.println("  ");
                break;
            case 5:
                System.out.println("Student good");
                break;
            case 5+2:
                System.out.println("7");
                break;
            default: // может быть где угодно но с break; , но будет ипспользоватсья если не найдет нужного значения в последню очередь , и только 1 бывает
                System.out.println("grade is wrong");
           // break; можно с ним а можно и без

        }
    }
}