package Enthuware.Standart.test7;

public class test15 {
}
/**You are writing a class named Bandwidth for an internet service provider
 * that keeps track of number of bytes consumed by a user.
 * The following code illustrates the expected usage of this class -
 *
 * class User{
 * Bandwidth bw = new Bandwidth();
 * public void consume(int bytesUsed){
 * bw.addUsage(bytesUsed);
 * }    ... other irrelevant code
 * }
 * class Bandwidth{
 * private int totalUsage;
 * private double totalBill;
 * private double costPerByte;
 * //add your code here
 * ...other irrelevant code }
 * Your goal is to implement a method addUsage (and other methods, if required) in Bandwidth class such that all the bandwidth used by a User is reflected by the totalUsage field and totalBill is always equal to totalUsage*costPerByte. Further, that a User should not be able to tamper with the totalBill value and is also not able to reduce it.
 *  Which of the following implementation(s) accomplishes the above?*/

/**
 public void addUsage(int bytesUsed){
 if(bytesUsed>0){
 totalUsage = totalUsage + bytesUsed;
 totalBill = totalBill + bytesUsed*costPerByte;
 }
 }*/