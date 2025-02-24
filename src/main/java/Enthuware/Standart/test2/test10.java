package Enthuware.Standart.test2;

public class test10 {
}
/**Consider the following code:
 import java.util.ArrayList;

 public class Student{

 ArrayList<Integer> scores;
 private double average;

 public ArrayList<Integer> getScores(){ return scores; }

 public double getAverage(){ return average; }

 private void computeAverage(){
 //valid code to compute average
 average =//update average value
 }

 public Student(){
 computeAverage();
 }

 //other code irrelavant to this question not shown

 }
 What can be done to improve the encapsulation of this class?*/



//Make the scores instance field private.
/*An important aspect of encapsulation is that other classes should not be able to modify the state fields of a class directly.
Therefore, the data members should be private (or protected if you want to allow subclasses to inherit the field)
and if the class wants to allow access to these fields, it should provide appropriate setters and getters with public access.*/

/**Change getScores to return a copy of the scores list:
 *  public ArrayList<Integer> getScores(){ return new ArrayList(scores); }*/
/*If you return the same scores list, the caller would be able to add or remove elements from it, thereby rendering the average incorrect.
This can be prevented by returning a copy of the list.*/
