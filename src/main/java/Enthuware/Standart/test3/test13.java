package Enthuware.Standart.test3;

public class test13 {
}
/**Consider the following program:

 class Game {
 public void play() throws Exception   {
 System.out.println("Playing...");
 }
 }

 class Soccer extends Game {
 public void play(String ball)    {
 System.out.println("Playing Soccer with "+ball);
 }
 }

 public class TestClass {
 public static void main(String[] args) throws Exception  {
 Game g = new Soccer();
 // 1
 Soccer s = (Soccer) g;
 // 2
 }
 }
 Which of the given options can be inserted at //1 and //2?*/


//g.play(); at //1 and s.play("cosco"); at //2
/*This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which has defined play(String ) method.*/



//g.play(); at //1 and s.play(); at //2

//This is valid because g is of type Game, which has the no-args play method and s is of type Soccer, which inherits that method.

