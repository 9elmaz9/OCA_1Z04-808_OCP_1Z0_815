package Enthuware.Standart.test4;

public class test22 {
}
/**What two changes can you do, independent of each other, to make the following code compile:
 *  //assume appropriate imports class PortConnector {
 *  public PortConnector(int port) {
 *  if (Math.random() > 0.5) {
 *  throw new IOException();
 *  }
 *  throw new RuntimeException();
 *  } }   public class TestClass {
 *  public static void main(String[] args) {
 *  try {
 *  PortConnector pc = new PortConnector(10);
 *  } catch (RuntimeException re) {
 *  re.printStackTrace();
 *  }
 *  } }*/

//add throws IOException to the main method as well as to PortConnector constructor.


//add throws Exception to PortConnector constructor and change catch(RuntimeException re) to catch(Exception re) in the main method.

/**IOException is a checked exception and since the PortConnector constructor throws IOException, this exception (or its superclass)
 *  must be present in the throws clause of the constructor.  Now, the main method has two options, either catch IOException
 *  (or whatever exception PortConnector throws) in its catch block (i.e. option 5) or put that exception in its throws clause (i.e. option 3).*/

