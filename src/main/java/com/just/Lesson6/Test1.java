package com.just.Lesson6;

public class Test1 {
    int sum(int a, int b, int c) {
        return a + b + c;

    }

    /**
     * int sredArifm(int a, int b, int c) {
     * //  return (a+b+c)/3;  above better 7
     * return sum(a, b, c) / 3;
     * <p>
     * //if my parameters have another name we put them in sum ( int x, int y, int z) = sase as ( int a,int,b, int c ) i mean work  the same
     * }
     **/
    int sredArifm(int x, int y, int z) {
        return sum(x, y, z) / 3;

    }
}