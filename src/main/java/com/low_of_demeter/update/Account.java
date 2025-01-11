package com.low_of_demeter.update;

public class Account {

    private String accountNumber;
    private double balance;
    private boolean isFrozen;

    public Account(String accountNumber, double balance, boolean isFrozen) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isFrozen = isFrozen;
    }

    public boolean canWithdraw(double amount) {
        return !isFrozen && balance >= amount;
    }

    public void debit(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            System.out.println("Debited " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Cannot debit: Account is frozen or insufficient funds.");
        }
    }

}
