package com.pattern.factory.Account;

public class VIPAccountFactory extends AccountCreator {
    @Override
    protected Account getAccount() {
        return new VIPAccount();
    }
}
