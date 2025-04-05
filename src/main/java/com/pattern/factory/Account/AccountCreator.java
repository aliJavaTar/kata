package com.pattern.factory.Account;

import com.s.User;

public abstract class AccountCreator {

    public AccountEntity registerAccount(User user, int balanceDefinition) {
        Account account = this.getAccount();
        if (balanceDefinition < account.minimumBalanceDefinition()) {
            throw new IllegalArgumentException("");
        }
        var accountEntity = new AccountEntity(account.interestingRate());
//        save(accountEntity);
        return accountEntity;
    }

    protected abstract Account getAccount();

}
