package com.just.Lesson15;

public class Test3 {
    public static void main(String[] args) {

        boolean b = true;

        int a = 1;
        while (b) {
            System.out.println(a);
            // если это число будет нацело делится на 3 и нацело делить на 7 тогда я смогу изменить переменнуж б на false
            if (a % 3 == 0 && a % 7 == 0) {  // когда станет 21 то  b = false;
                b = false;  // можно и   brake;
            }
            a++;  // выодится а и увеличивается на 1 пока не наткнется на условие выше и не проигарет его и остановится
        }
    }
}
