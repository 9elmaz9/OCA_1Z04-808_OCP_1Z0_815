package com.just.Lesson5.homework5;

public class BankAccount {

    int id = 10;
    String name = "Mark";
    double balance = 100;

    void accountReplenishment(double ReplenishmentAmount) {
        System.out.println("Balance before replenishment :" + balance);
        System.out.println("Replenishment balance on :" + ReplenishmentAmount);
        balance += ReplenishmentAmount;
        System.out.println("Balance after replenishment :" + balance);
        System.out.println();
    }

    void withdrawalFromAccount(double WithdrawalAmount) {
        System.out.println("Balance before Withdrawal :" + balance);
        System.out.println("Replenishment balance on :" + WithdrawalAmount);
        balance -= WithdrawalAmount;
        System.out.println("Balance after withdrawal :" + balance);
        System.out.println();
    }


}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();

        MyAccount.accountReplenishment(30.5);
        MyAccount.withdrawalFromAccount(20.5);


    }
}