package com.just.Lesson5.homework5;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;

    double mathAverageGrade;
    double economicAverageGrade;
    double foreignLanguageAverageGrade;


}

class StudentTest {
        double sredArifmOcenka(Student st){
            double sredOcenka = (st.mathAverageGrade +st.economicAverageGrade +st.foreignLanguageAverageGrade )/3;
            System.out.println(" Average arithmetic grade of  student " + st.name +" "+ st.surname + "  is : " + sredOcenka);
            return sredOcenka;
        }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nicolay";
        st1.surname = "Red";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicAverageGrade = 9.2;
        st1.foreignLanguageAverageGrade = 8.8;


        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Bill";
        st2.surname = "Black";
        st2.course = 2;
        st2.mathAverageGrade = 6.3;
        st2.economicAverageGrade = 7;
        st2.foreignLanguageAverageGrade = 8.5;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Rick ";
        st3.surname = "White";
        st3.course = 1;
        st3.mathAverageGrade = 9.1;
        st3.economicAverageGrade = 9;
        st3.foreignLanguageAverageGrade = 10;


       StudentTest sTest = new StudentTest();
       sTest.sredArifmOcenka(st1);
       sTest.sredArifmOcenka(st2);
       sTest.sredArifmOcenka(st3);

    }

}