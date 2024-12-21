package Enthuware.Standart.one;

public class test3 {
}

//What will the following program print?
 class InitTest{
    public InitTest(){
        s1 = sM1("1");
    }
    static String s1 = sM1("a");
    String s3 = sM1("2");{
        s1 = sM1("3");
    }
    static{
        s1 = sM1("b");
    }
    static String s2 = sM1("c");
    String s4 = sM1("4");
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
}

//
//It will print : a b c 2 3 4 1

/*
* First, static statements/blocks are called IN THE ORDER they are defined.
* Next, instance initializer statements/blocks are called IN THE ORDER they are defined.
* Finally, the constructor is called. So, it prints a b c 2 3 4 1.*/