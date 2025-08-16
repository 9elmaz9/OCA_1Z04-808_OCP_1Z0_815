package unique_test_1;

public class test29 {
}
/**Consider the following class:
 *  public class PortConnector{
 *  public PortConnector(int port) throws IOException{
 *  ...lot of valid code.    }
 *  ...other valid code. }
 *
 *  You want to write another class CleanConnector that extends from PortConnector.
 * Which of the following statements should hold true for CleanConnector class?*/

//None of these.
/**As PortConnector has only one constructor, there is only one way to instantiate it.
 *  Now, to instantiate any subclass of PortConnector, the subclass's constructor should call super(int).
 *  But that throws IOException. And so this exception (or its super class) must be defined in the
 *  throws clause of subclass's constructor. Note that you cannot do something like:
 *  public CleanConnector(){
 *  //WRONG : the call to super must be first statement in constructor
 *  try{ super(); }catch(Exception e){} }
 *  Remember: Constructor must declare all the checked exceptions declared
 *  in the base constructor (or the super classes of the checked exceptions).
 *  They may add other exceptions as well. This behavior is exactly opposite from that of methods.
 *  The overriding method cannot throw any checked exception other than what the overridden method throws.
 *  It may throw subclasses of those exceptions as well.*/
