package com.just.Lesson6;

public class RunRimeError {

    public static void main(String[] args) {

        int a = 50 / 0;
        // if int a = 50/ " s"   it highlights in red
        System.out.println();
    }
}

// "C:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\bin\java.exe" -Xmx1024m "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.3.5\lib\idea_rt.jar=50676:C:\Program Files\JetBrains\IntelliJ IDEA 2023.3.5\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ELMAZ\OCA-1Z04-808\target\classes com.just.Lesson6.RunRimeError
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.just.Lesson6.RunRimeError.main(RunRimeError.java:7)
//
//Process finished with exit code 1