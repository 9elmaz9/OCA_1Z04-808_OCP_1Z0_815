package com.just.Lesson15;

public class Test7 {

    public static void main(String[] args) {

        int money = 100;
        // int money = 0; 1 раз все равно  напечатается , а это не логично , ка ты можешь начать игру в казино если у тебя 0?

        do {

            System.out.println("Delayte stavky");
            System.out.println("Vi proigrali");
            money = money - 10;  // Дойдет до 0 и все

        } while (money > 50);   // аутпут 5 раз
    }
}
