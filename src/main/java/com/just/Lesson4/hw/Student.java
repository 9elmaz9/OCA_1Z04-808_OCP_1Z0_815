package com.just.Lesson4.hw;

public class Student {
    int id;
    String name = "student";

    int year;

    double mid_assessmentEnglishLesson;
    double mid_assessmentMathLesson;
    double mid_assessmentEconomyLesson;

    double result;


}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.id = 1;
        student1.name = "Lisa";
        student1.year = 2024;
        student1.mid_assessmentEconomyLesson = 99.6;
        student1.mid_assessmentMathLesson = 96.5;
        student1.mid_assessmentEnglishLesson = 74.1;
        student1.result = (student1.mid_assessmentEconomyLesson + student1.mid_assessmentEnglishLesson + student1.mid_assessmentMathLesson) / 3;


        student2.id = 2;
        student2.name = "Kek";
        student2.year = 2024;
        student2.mid_assessmentEconomyLesson = 100;
        student2.mid_assessmentMathLesson = 88;
        student2.mid_assessmentEnglishLesson = 96.7;
        student2.result = (student2.mid_assessmentEconomyLesson + student2.mid_assessmentEnglishLesson + student2.mid_assessmentMathLesson) / 3;


        System.out.println();

        student3.id = 3;
        student3.name = "Rita";
        student3.year = 2023;
        student3.mid_assessmentEconomyLesson = 78.5;
        student3.mid_assessmentMathLesson = 99;
        student3.mid_assessmentEnglishLesson = 85.5;
        student3.result = (student3.mid_assessmentEconomyLesson + student3.mid_assessmentEnglishLesson + student3.mid_assessmentMathLesson) / 3;


        System.out.println(student1.name + " ,course " + student1.year + " - has an average grade  : " + student1.result);
        System.out.println(student2.name + " ,course " + student3.year + " - has an average grade  : " + student2.result);
        System.out.println(student3.name + " ,course "+ student3.year +  " - has an average grade  : " + student3.result);


    }
}