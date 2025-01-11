package com.low_of_demeter.fix;

import com.low_of_demeter.update.Account;

public record UserFixed(Account account) {

    public boolean processPayment(double amount) {
        if (account.canWithdraw(amount)) {
            account.debit(amount);
            return true;
        }
        return false;
    }
}
