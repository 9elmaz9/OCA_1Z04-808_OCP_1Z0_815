package Enthuware.Standart.test5;

public class test54 {
}
/**What will be the output of the following program ?
 class CorbaComponent{
 String ior;
 CorbaComponent(){ startUp("IOR"); }
 void startUp(String s){ ior  =  s; }
 void print(){ System.out.println(ior); }
 }

 class OrderManager extends CorbaComponent{
 OrderManager(){  }
 void startUp(String s){  ior = getIORFromURL(s);   }
 String getIORFromURL(String s){  return "URL://"+s; }
 }

 public class Application{
 public static void main(String args[]){ start(new OrderManager()); }
 static void start(CorbaComponent cc){ cc.print(); }
 }*/


//It will print URL://IOR

/**Observer that method startUp(String s) of CorbaComponent is overridden by the subclass OrderManager.
 * When an object of class OrderManager is constructed, the default no args constructor of CorbaComponent is called.
 * This constructor calls the startUp(String s) with "IOR" as parameter. Now, there are two eligible methods which can be called -
 * CorbaComponent's startUp and OrderManager's startUp.  The method selection is done on the basis of the actual class of the object
 * (which is OrderManager here). So OrderManager's startUp is called, which sets the ior variable to URL://IOR.
 * Unlike instance method selection, variable (and static method) selection is done on the basis of declared class
 * of the variable and not on the actual class of object that it is referring to.*/
