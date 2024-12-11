package com.just.Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test6_1 {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        // toArray() -> Object[]  создает новый массив , его элементы ссылаются на те же объекты что и  list1
        Object[] array1 = list1.toArray();
        for (Object o : array1) {
            System.out.print(o);
        }

        System.out.println();


        // toArray(Data Type [] array ) -> Data Type[]
        StringBuilder[] array2 = list1.toArray(list1.toArray(new StringBuilder[10])); // 10  мест ,
        for (StringBuilder sbb : array2) {
            System.out.print(sbb + " ");  //A B C null null null null null null null

        }


        System.out.println();


        //Arrays.asList(array)
        //длинна его изменится не может, он полностью связан с массивом, если что то поменят ьв масииве, то сразу отразится жто в этом
        StringBuilder array [] ={sb2,sb3,sb3,sb3};
        List<StringBuilder> list8= Arrays.asList(array);
        System.out.println(list8); // [B, C, C, C]
        // изменяем
        array[0].append("!!!");
        System.out.println(list8);  //[B!!!, C, C, C]

        //заменяем
        array[0]=new StringBuilder("!!!");
        System.out.println(list8);  //[!!!, C, C, C]  / clone toArray  так не сделало бы


    }
}