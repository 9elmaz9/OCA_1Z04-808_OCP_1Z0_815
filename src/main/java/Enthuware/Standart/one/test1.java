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

//Note that there are a few questions in the exam that test your knowledge about how exception messages are printed.  When you use System.out.println(exception), a stack trace is not printed. Just the name of the exception class and the message is printed. When you use exception.printStackTrace(), a complete chain of the names of the methods called, along with the line numbers, is printed. It contains the names of the methods in the chain of method calls that led to the place where the exception was created going back up to the point where the thread, in which the exception was created, was started.