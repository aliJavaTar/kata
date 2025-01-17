package com.s.good;

public class SentEmail implements SentEmailInter {

    @Override
    public void sentEmail(int id) {
        System.out.println("Email sent" + id);
    }
}
