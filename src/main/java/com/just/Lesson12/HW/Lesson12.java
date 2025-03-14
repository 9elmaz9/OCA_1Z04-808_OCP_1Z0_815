package com.just.Lesson12.HW;
/**
 * In the StudentTest class, write two methods that take two input parameters – two objects of the Student class and an object of the Lesson11 class.
 * <p>
 * First Method:
 * This method compares the two students using a single if statement and logical operators inside it. It outputs information about whether the students are equal.
 * <p>
 * Second Method:
 * This method uses a nested if statement to compare all attributes of the students individually. It outputs information about whether the students are equal, and if they are not, it specifies the first discrepancy that was found.
 */

import com.just.Lesson11.Student;

public class Lesson12 {
}

class StudentTest {

    public static void method1(Student st1, Student st2) {

        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {  // если это правда TRUE
            System.out.println("The students are the same");  // то  будет это
        } else {
            System.out.println("The students are not the same"); // если логическое выражение false  то будет это
        }
    }

    public static void method2(Student st1, Student st2) {

        if (st1.name.equals(st2.name)) {  // 1 первое if самый большой  сравниваем по именам , если Да то идем дальше на след if

            if (st1.course == st2.course) {  // 2 если верхний if да переходим сюда 

                if (st1.grade == st2.grade) { // 3 
                    System.out.println("The student's name, courses and grades are the same !");
                } else {
                    // 3 
                    System.out.println("The student's name, courses are the same but the grades are different !");
                }
            } else {
                //2
                System.out.println("The student's name are the same , but the courses are different ! ");
            }
        } else {
            // 1 
            System.out.println("The students' names are different! ");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ivan", 2, 5.5);
        Student s2 = new Student("Ivan2", 2, 6.5);
        method1(s1, s2);
        method2(s1, s2);
    }


}

/**В классе StudentTest  написать 2 метода, которые принимают 2 input параметра -2 обьекта класса Student  и Lesson11.
* Первый метод сравнивает 2-х студентов , используя 1 ifstatement и логические операторы внутри него и выводит на экран информацию о том,
* равны ли студенты
* Второй метода использует nested if statement , сравнивает все атрибуты студента по отдельности , выводит на экран информацию о том ,
* равны ли студенты , а если не равны , то в чем именно было обнаруженно первое неравенство .*/