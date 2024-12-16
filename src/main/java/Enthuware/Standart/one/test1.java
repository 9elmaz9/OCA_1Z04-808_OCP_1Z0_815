package Enthuware.Standart.one;

public class test1 {
}
/**
What will be the output when the following program is run?
        package exceptions;
public class TestClass{
    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException me){
            System.out.println(me);
        }
    }

    static void hello() throws MyException{
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException{
        throw new MyException("Exception from foo");
    }
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
(Assume that line numbers printed in the messages given below are correct.) */

/*
*
exceptions.MyException: Exception from foo*/
