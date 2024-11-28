package com.just.Lesson6.hw;

/**
 * Измените клаас Student  так , что бы он имел 3 конструктора.
 * 1-й принимает все параметры.
 * 2-й только id, name, surname, course .
 * 3-й не принимает значений .
 * Создайте в классе StudentTest с помощью разных конструкторов
 */
public class Student {


    Student(int studentId2, String name2, String surname2, int course2, double mathAverageGrade2, double economicAverageGrade2,
                   double foreignLanguageAverageGrade2) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicAverageGrade = economicAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0, 0, 0);
    }

    Student() {

    }

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


        Student st2 = new Student(2, "Bill","Black",2);
        st2.mathAverageGrade = 6.3;
        st2.economicAverageGrade = 7;
        st2.foreignLanguageAverageGrade = 8.5;


        Student st3 = new Student(3,"Rick","Wrap",1,9.1,9,10);


        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }

}