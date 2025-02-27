package Enthuware.Standart.test2;

public class test21 {
}
/**Consider that you are writing a set of classes related to a new Data Transmission Protocol and have created your own exception hierarchy derived from java.lang.Exception as follows:
 enthu.trans.ChannelException
 +-- enthu.trans.DataFloodingException,
 enthu.trans.FrameCollisionException


 You have a TransSocket class that has the following method:
 long connect(String ipAddr) throws ChannelException
 Now, you also want to write another "AdvancedTransSocket" class, derived from "TransSocket" which overrides the above mentioned method.
 Which of the following are valid declaration of the overriding method?*/


//long connect(String ipAddr) throws FrameCollisionException


//long connect(String str)

/**There are 2 important concepts involved here:
 1. The overriding method must have same return type in case of primitives (a subclass is allowed in case of classes)  (Therefore, the choices returning int are not valid.) and the parameter list must be the same (The name of the parameter does not matter, just the Type is important).

 2. The overriding method can throw a subset of the exception or subclass of the exceptions thrown by the overridden class. Having no throws clause is also valid since an empty set is a valid subset. */