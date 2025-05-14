package Enthuware.Standart.test7;

public class test7 {
}
/**Which of the following code fragments compile without any error?

 Assume that Math.random() returns a double between 0.0 and 1.0 (not including 1.0).*/

/*
for(;Math.random()<0.5;){
System.out.println("true"); }*/

//The second expression in a for loop must return a boolean, which is happening here. So this is valid.

/**

 for(;;Math.random()){
 System.out.println("true"); }*/

//This is a valid never ending loop that will keep printing true.

/**
 for(;;){
 if(Math.random()<.05) break; }*/

//The three parts of a for loop are independent of each other.
// However, there are certain rules for each part. Please go through section 14.14.1 of JLS to understand it fully.