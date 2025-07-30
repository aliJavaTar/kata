package com.pattern.factory.Account;

import com.s.User;

public abstract class AccountCreator {

    public AccountEntity registerAccount(User user, int balanceDefinition) {
        Account account = this.getAccount();
        if (balanceDefinition < account.minimumBalanceDefinition()) {
            throw new IllegalArgumentException("");
        }
        //        save(accountEntity);
        return new AccountEntity(account.interestingRate());
    }

    protected abstract Account getAccount();

}
