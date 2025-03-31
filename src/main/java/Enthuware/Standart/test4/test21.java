package Enthuware.Standart.test4;

public class test21 {
}
/**Which statements about the following code contained in BankAccount.java are correct?
 * interface Account{   public default String getId(){
 * return "0000";
 * } }  interface PremiumAccount extends Account{
 * public String getId();
 * }
 * public class BankAccount implements PremiumAccount{
 *  public static void main(String[] args) {
 *
 *  Account acct = new BankAccount();
 *  System.out.println(acct.getId());
 *  }  }*/


//It will compile if class BankAccount provides an implementation for getId method.

/*Since interface PremiumAccount redeclares getId method as abstract, the BankAccount class must either provide an implementation
 for this method or be marked as abstract. In this case, making the class abstract will not help because of the statement - Account acct = new BankAccount();*/

