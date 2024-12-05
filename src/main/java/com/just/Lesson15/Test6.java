package com.just.Lesson15;

public class Test6 {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i); //1
            i++; //2  ,,,, 10
            //10<=10 ok
            // 11<= 10 - NO then  loop was  ended
        } while (i <= 10);
    }

    // выполнится 1 раз несмотря на то что condition FALSE
 //  do{
 //      System.out.println(i);
 //      i++;
 //  }while( i==10)  FALSE
}
