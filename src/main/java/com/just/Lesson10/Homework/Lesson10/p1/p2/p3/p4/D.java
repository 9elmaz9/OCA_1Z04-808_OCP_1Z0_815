package com.just.Lesson10.Homework.Lesson10.p1.p2.p3.p4;


/**
 * Создайте пакет p1, в нём класс A. В пакете p1 создайте подпакет p2,
 * в нём класс B со static элементами. В подпакете p2 создайте подпакет p3,
 * в нём класс C. Создайте новый пакет p4, в нём класс D. В пакете p4 создайте подпакет p5,
 * в нём класс E. Внутри класса D напишите код, который будет задействовать любые элементы классов A, C, E,
 * а также static элементы класса B. Используя выражения import и import static, работайте с неполными именами классов.
 */

import com.just.Lesson10.Homework.Lesson10.p1.A;
import com.just.Lesson10.Homework.Lesson10.p1.p2.B;

import static com.just.Lesson10.Homework.Lesson10.p1.p2.B.*;

import com.just.Lesson10.Homework.Lesson10.p1.p2.p3.C;
//import com.just.Lesson10.Homework.Lesson10.p1.p2.p3.p4.p5.E;   ниже тоже самое
import com.just.Lesson10.Homework.Lesson10.p1.p2.p3.p4.p5.*;


public class D {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.str1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showMessage();

        E e = new E();
        System.out.println(e.xyz);

        System.out.println(b1);
    }
}


/**
 * Create package p1 with class A. In package p1, create a subpackage p2 with class B containing static elements.
 * In subpackage p2, create another subpackage p3 with class C. Create a new package p4 with class D. In package p4,
 * create a subpackage p5 with class E. Inside class D, write code that will use any elements from classes A, C, E,
 * as well as static elements from class B. Use the import and import static statements to work with incomplete class names.*/