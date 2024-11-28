package com.just.Lesson5;

public class Test20 {

    // public static void main(String[] args) { our code }
    // public - Access modifier
    // static - Non-access modifier(s)
    // void - Return type
    // main - Name
    // (String [] args) - Parameter(s)
    // { our code } - Body


    int summa (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sredneeArif(int a1 , int b1 , int c1 ){
       int result2= summa(a1,b1,c1)/3;
       return result2;
    }




}

class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrexChisel =  t.summa(1,2,30); //  obrabotka i prisvaivaetcua summaTrexChisel
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(1,2,3));


        System.out.println(t.sredneeArif(20,40,60));



    }

        }
