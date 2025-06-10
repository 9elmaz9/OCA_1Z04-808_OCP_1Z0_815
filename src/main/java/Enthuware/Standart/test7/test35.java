package Enthuware.Standart.test7;

public class test35 {
}
/**You are asked to develop an application for a car rental company.
 * As a part of that, you are given the following requirements - 1. Implement three classes -  Car, SUV, and MiniVan,
 * where the Car class is the super class of SUV as well as MiniVan. 2. Implement method int getDailyRate()
 * that returns the daily price of the car. 3. Implement method void printDetails() that prints the details of the car.
 *  Which of the following definition of Car class adds a valid layer of abstraction to the class hierachy?*/

/*

public abstract class Car{
 public abstract int getDailyRate();
public abstract void printDetails();
 }*/

/**As per the given information, Car could be an abstract class with two methods. You need to make
 *  these two methods abstract so that concrete classes such as SUV and MiniVan will be forced
 *  to provide appropriate implementations of these methods.*/