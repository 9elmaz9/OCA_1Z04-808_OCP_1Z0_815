package com.just.Lesson13;

public class Employee2 {

    public static void main(String[] args) {
        switch ("monday") {

            case "monday":  // напечатается то что пт

            case "tuesday":

            case "wednesday":

            case "thursday":

            case "friday":
                System.out.println(" Work ours are until 18:00!!!!!");
                break;
            case "saturday":
                System.out.println(" Work ours are  until 14:00");
                break;
            case "sunday":
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("That kind of day is doesn't exist !");
        }
    }
}
