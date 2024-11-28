package com.just.Lesson8;

public class Student {

    String name;
    int course;

    // static переменная принадлежит всему классу  для все
    static int count;  // if not static -> then   count doesnt work!

    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #  " + count + " was created ");
        //Student #  1 was created
        //Student #  2 was created
        //Student #  3 was created  only if int count STATIC
    }

    public static void showCount() {
        System.out.println("The count of students were created : " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        //  a++;  нестатичн нельзя в статичном потому что принаджнеитт  обьекту
        //но  если создать тут обьект то ок
        Student st2 = new Student("Marly", 1);
        st2.a++;

    }
}


class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student("Lilla", 1);
        Student st2 = new Student("Rick", 2);
        Student st3 = new Student("Martin", 2);

        Student.showCount();

        // i can call it without obj - STATIC METHOD
        Student.abcd();

        // non static =  cals only with obj
        Student st4 = new Student("Ora", 1);
        st4.abc();



    }
}