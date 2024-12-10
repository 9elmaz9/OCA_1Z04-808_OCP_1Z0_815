package com.just.Lesson19;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("privet");
        StringBuilder sb2 =new StringBuilder("poka");
        StringBuilder sb3 =new StringBuilder("ok");
        StringBuilder [] array2 = {sb1,sb2,sb3};
        for (StringBuilder sb:array2){
            sb.append(" HO HO"); //к концу добавляет , вне этого фора sb не суще, но поменяли значение обьекта , но сам обьект не меняли
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " "); // элементы не поменяли свои значения
        }
        System.out.println();
    }
}
