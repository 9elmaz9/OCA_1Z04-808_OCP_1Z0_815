package com.just.Lesson16;

public class Test1 {

    public static void main(String[] args) {


        String s1 = new String("privet"); //  0 1 2 3 4 5

        // length()  длинна
        int a = s1.length(); // длинна стринга
        System.out.println(a); //6  or i can do
        System.out.println(s1.length());  // the same as above

        //  charAt(int index)  с помощью этого метода может определить какой char на каком index

        char c = s1.charAt(3);
        System.out.println(c); // v

        // это пример если введу несущ индекс , то будет вызван Exception in thread "main" java.lang.StringIndexOutOfBoundsException
        // char c = s1.charAt(10;
        // System.out.println(c); // v


        // 4 overloaded methods  с разными параметрами , что б узнать на каком индексе находится определенный char или String
        //  indexOf(char c ) -> int
        //  indexOf(String s) -> int
        //  indexOf(char c, int fromIndex) -> int
        //  indexOf(String s,int fromIndex) -> int
        //"privet" p0 r1 i2 v3 e4 t5
        int i1 = s1.indexOf('t');  // "t"
        System.out.println(i1);  // 5

        //"privet" p0 r1 i2 v3 e4 t5
        int i2 = s1.indexOf("vet");
        System.out.println(i2); //3  с какого начинается


        //"privet" p0 r1 i2 v3 e4 t5
        int i3 = s1.indexOf("Z");
        System.out.println(i3); // -1  если нет того чего нам нужно , такого индекса не сущ


        String s2 = new String("abcdefgabcd"); //  0a 1b 2c 3d 4e 5f 6g 7a 8b 9c 10d
        int i4 = s2.indexOf("a");
        System.out.println(i4);  // 0    потому что он первый, но как же вывести ту а которая в середине
        int i5 = s1.indexOf("a", 5);  // просто пишу с какого индекса начать искать  'a'
        System.out.println(i5);  // 7


        //startWith(String prefix)->boolean
        //startWith(String prefix, int form)->boolean

        boolean b1 = s2.startsWith("abc");  // задается вопрос String s2  начинается с  abc ?
        System.out.println(b1);  // true
        boolean b2 = s2.startsWith("abd");  // задается вопрос String s2  начинается с  abd ?
        System.out.println(b1);  // false
        //  так же можно указать с какого конкретно индекса я начинаю рассматрвиать
        boolean b3 = s2.startsWith("abc", 5);
        System.out.println(b3);//false


        // endsWith ( String suffix) ->boolean
        // задается вопрос String s2  заканчивается с  abc ?
        boolean b4= s2.endsWith("abc");
        System.out.println(b4);  // false





    }
}