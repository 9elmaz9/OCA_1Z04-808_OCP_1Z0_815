package com.just.Lesson12.Conditions;

public class Condition {

    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        if (x > y) {
            System.out.println("X  больше чем У"); //true
        } else if (x == y) {
            System.out.println("X равен Y");
        } else {
            System.out.println("Y больше или равен X");
        }
    }
}
