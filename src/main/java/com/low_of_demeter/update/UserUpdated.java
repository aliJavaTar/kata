package com.low_of_demeter.update;

public class UserUpdated {

    private Account bankAccount;

    public UserUpdated(Account bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Account getBankAccount() {
        return bankAccount;
    }
}
