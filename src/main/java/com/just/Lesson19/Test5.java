package com.just.Lesson19;

public class Test5 {
    public static void main(String[] args) {

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        //outer loop
        for (String s1 : students) {
            //inner loop
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);

            }
        }
    }
}
