package com.just.Lesson12;

public class Test12 {
    public static void main(String[] args) {
        int a = 10;
        if (a < 20) {
            System.out.println(" a smaller than 20");
        }


        // проверяем несколько условий
        int salary = 300;
        if (salary < 200) {
            System.out.println("salary is to small");
        } else if (salary < 400) { // становится тут
            System.out.println("Salary is mid");
        } else if (salary < 600) {
            System.out.println("Salary is big");
        } else {
            System.out.println("Salary is  super");
        }

        // проверяем несколько условий
        int salary2 = 300;
        boolean b = true;
        if (2 < 200) {
            System.out.println("salary is to small");
        } else if (salary2 < 400 && b == false || true) { //  если TRUE тормозит тут
            System.out.println("Salary is mid");
        } else if (b == true) { //  перезодит сюда если это выше все FALSE
        } else {
            System.out.println("Salary is  super");
        }
    }
}
