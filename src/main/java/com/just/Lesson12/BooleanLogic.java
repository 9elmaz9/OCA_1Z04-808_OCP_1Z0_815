package com.just.Lesson12;

public class BooleanLogic {
    public static void main(String[] args) {
        //сынок купил хлеба
        boolean isBoughtBread = true;
        // сынок купил молоко
        boolean isBoughtMilk = true;

        //AND - Логическое И , если два значения true , то тогда true  , иначе false
        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;
        // boolean isBoughtMilkAndBread = true && true;
        // boolean isBoughtMilkAndBread = true ;

        // for instance
        // boolean isBoughtMilkAndBread = false && true;  задание не выполненно
        // boolean isBoughtMilkAndBread = false ;


        //persand &&


        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Well done son , you bought bread and milk!");
        } else if (isBoughtMilk) {
            System.out.println("Well done son ,at least  you bought some milk!");
        } else if (isBoughtBread) {
            System.out.println("Well done son ,at least  you bought some bread!");

        } else {
            System.out.println("Son , you are not a good boy, there is no bread and milk!");
        }


        // or - Логическое ИЛИ , если хотя бы одно значение true ,то тогда true , и только если все значения   false
        // то тогда false

        //sit1
        boolean isBoughtMilkOrBread = true || true;
        // result : boolean isBoughtMilkOrBread= true ;

        //sit2
        //  boolean isBoughtMilkOrBread= true || false;
        //  result : boolean isBoughtMilkOrBread= true ;

        //sit3
        //  boolean isBoughtMilkOrBread= false || false;
        //  result : boolean isBoughtMilkOrBread= false ;


        //NEW LES

        // NOT - Логическое  НЕ , которое переворачивает значение  true на false  и наоборот
        // Купил сладости или нет
        boolean isBoughtCande = true;

        if (!isBoughtCande) {    // c ! false
            System.out.println("Мама хвалит сына");

        }
    }

}
