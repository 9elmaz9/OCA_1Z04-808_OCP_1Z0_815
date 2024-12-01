package com.just.Lesson1_3;

//бит Bit (кусочек) самый маленький кусок информации для машин
public class Primitives {

    public static void main(String[] args) {
        // Логические значение  ( булевые значение )
        // ИСТИНА -> true -> да
        boolean answerBobbi = true; //1
        // ЛОЖЬ -> false ->  нет
        boolean answerPetr = false; //0


        //Целые числа
        // Byte  байт  последовательность из 8  bit битов   100100
        byte maxByte = 127;
        byte minByte = -128;

        //short - короткое чисто, состоит из двух байт  или  из 16 битов-кусочков -> (последовательность из 16 цифр )
        //вес резервирует память в системе программы
        short maxShort = 32_767;
        short minShort = -32_768;


        //Integer целое число , которое состоит из 4 байт или ил 32 битов
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;


        // Long  целое число , которое состот из 8 байт или 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;


        //Double число с плавающей точкой , которая имеет 64 bit
        double myBottle = 1.5;
        //Float число с плавающей точнок, 32 bit
        float cola = 0.33F;


        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;

        // разница в том что разный уровень точности данных чисел double float !
        System.out.println(doubleNumber);  //1.1234567890123457  округлило последнюю

        System.out.println(floatNumber); //1.1234568  тут округлило раньше

    }
}





//Какие типы данных вы бы использовали , для ответов на вопросы :
//Сколько людей на планете ? long
//Сколько рук у челвоек?  byte - int
//Есть сигнал или нет? boolean
//Колличество стран в мире? short / byte - int
//Сколько жителей в Монако ? integer