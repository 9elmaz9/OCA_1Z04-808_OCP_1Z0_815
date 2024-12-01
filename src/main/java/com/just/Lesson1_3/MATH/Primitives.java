package com.just.Lesson1_3.MATH;

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


        //Char - character -  символ , 16 bit
        char letter = 'I' + 1;   // можно прибавлять к ним J
        char letter2 = 70;   // F
        System.out.println(letter);
        System.out.println(letter2);

        //Спец символы
        char newLine = '\n';  // перенос на новую строку / перевод строки
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");

        char tab = '\t';  // табуляция 4 пробела
        char escape = '\\';  // экранирование символов  например  слеш /
        System.out.println(escape);


    }
}


//Какие типы данных вы бы использовали , для ответов на вопросы :
//Сколько людей на планете ? long
//Сколько рук у челвоек?  byte - int
//Есть сигнал или нет? boolean
//Колличество стран в мире? short / byte - int
//Сколько жителей в Монако ? integer