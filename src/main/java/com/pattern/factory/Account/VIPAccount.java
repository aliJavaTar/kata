package com.pattern.factory.Account;

public class VIPAccount implements Account {
    @Override
    public double interestingRate() {
        return 0;
    }

    @Override
    public int minimumBalanceDefinition() {
        return 0;
    }
}
