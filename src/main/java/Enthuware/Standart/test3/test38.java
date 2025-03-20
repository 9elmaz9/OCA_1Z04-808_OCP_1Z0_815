package Enthuware.Standart.test3;

public class test38 {
}
//    Following options show the complete code listings of a file. Which of these will compile?

/**
 * In file B.java import java.io.*;
 * class A{ public static void main() throws IOException{ } }*/
/*There is nothing wrong with this code.
1. You can have a non-public class in a file with a different name.
2. You can have a main method that doesn't take String[] as an argument. It will not make the class executable from the command line though.*/


/**In file A.java
 * public class A{
 * public static void main(String[] args){
 * System.out.println(new A().main);
 * int main;
 * }*/
//There is nothing wrong with this code. You can have a method and a field with the same name in a class.
