package com.just.Lesson20;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//создаем  ArrayList
        ArrayList<String> student = new ArrayList<>();// размер листа равен нулю , то каким образом на индекс номер 1 мы можем ставить обьект
        //НЕ МОЖЕМ  , если размер 0 , то позиции с индексом 1 еще не существует
 //    student.add(1, "Ivanov"); //   at com.just.Lesson20.Test.main(Test.java:10)

 //    student.add(2, "Petrov");
 //    student.add(3, "Sidorov");
 //    student.remove(2);
        for (String s : student) {
            System.out.println(s + " ");  //IndexOutOfBoundsException
        }
    }
}
