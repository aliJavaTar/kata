package com.low_of_demeter.old;

public record Account(String accountNumber, double balance) {

    public Account deposit(double amount) {
        if (balance >= amount) {
            double newBalance = amount - balance;
            return new Account(accountNumber, newBalance);
        }
        throw new ArithmeticException("Insufficient balance");
    }

}
