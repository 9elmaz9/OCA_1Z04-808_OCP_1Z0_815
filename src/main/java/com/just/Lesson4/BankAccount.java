package com.just.Lesson4;

public class BankAccount {

    int id ;
    String name;

    //String name = "Petr";
   // String name = new String("Petr");
    double balance;




}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Elmaz";
        MyAccount.balance=12.35;

        YourAccount.id=2;
        YourAccount.name="Bill";
        YourAccount.balance=1.35;

        HisAccount.id=3;
        HisAccount.name="Rick";
        HisAccount.balance=15.35;

        System.out.println(MyAccount.id);

       // if  without   System.out.println(HisAccount.balance);  //0,0 default double without .balance
    }
}