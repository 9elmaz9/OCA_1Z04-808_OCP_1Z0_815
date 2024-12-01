package com.just.Lesson13;

public class Employee {

    public static void main(String[] args) {
        switch ("monday") {

            case "monday":
                System.out.println(" Work ours are until 18:00!");
                 break;
            case "tuesday":
                System.out.println(" Work ours are until 18:00!!");
                break;
            case "wednesday":
                System.out.println(" Work ours areuntil 18:00!!!");
                break;
            case "thursday":
                System.out.println(" Work ours are until 18:00!!!!");
                break;
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
