package com.just.Lesson13;


public class Employee3 {

    public static void main(String[] args) {

        //ONLY !!!!!!
        int denNedeli = 3;
        // byte
        // short
        //char
        //String

        //OK
        //& 1 , -3/14, "hey" , 5*10


        //NO , not final cant work correct
        //int a=1;


        final int a = 10;
        final int b = 5;

        // NOT
        // final  int b;
        // b=10;

        switch (denNedeli * 3) {  //9

            case 1:

            case -2:

            case a * b:

            case 4:

            case 5:
                System.out.println(" Work ours are until 18:00!!!!!");
                break;
            case 6:
                System.out.println(" Work ours are  until 14:00");
                break;
            case 7:
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("That kind of day is doesn't exist !");
        }


        switch ("privet") {

            case " hey":
                // case null  так нельзя
            default:
                System.out.println();

        }
    }
}