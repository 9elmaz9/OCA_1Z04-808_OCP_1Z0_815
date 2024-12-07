package com.just.Lesson16_EXTRA_STRING;


// isBlank
//isEmpty
//strip , stripLeading , stripTrailing
public class Test1 {
    public static void main(String[] args) {


/**
 BUT IT'S FOR JAVA 11

 // isBlank

 isBlank возвращает boolean , true если Стринг соситоит из пробелов, таб , а если из других символов то  false
 String s1="privet";
 // System.out.println(s1.isBlank());  //false

 String s2="   ";
 System.out.println(s2.isBlank()); true
 String s3="  g ";
 System.out.println(s2.isBlank()); false
 */

        //isEmpty

        // чекает пустой ли стринг
        String s = " ";
        System.out.println(s.isEmpty());  //false , не пустой в нем есть пробел

        String s1 = " ";
        System.out.println(s1.isEmpty());  //true , пустой в нем ничего нет в нашем стринге

        String s2 = null;
        System.out.println(s2.isEmpty());  //NullPointerException



/**
 *  BUT IT'S FOR JAVA 11

        //strip , stripLeading , stripTrailing

        String s3 = "   privet   ";
        //   System.out.println(s3.strip());  // это как  trip удаление пробелов но для Java11
       //  System.out.println(s3.stripLeading());  // это удалит пробелы в начале нашего String
       //  System.out.println(s3.stripTrailing());  // это удалит пробелы в конце нашего String , а в начале нет


String s5="poka";
 //то есть если нечего удалять там , то String возвращает тот же обьект
String s6 = s5.strip();  новые обьект не создает так как ничего не изменилось с пршлого обьекта, и они так же ссылаются на один и тот же обеькт в пуле
 System.out.println(s5==s6);  true
 */
    }
}
