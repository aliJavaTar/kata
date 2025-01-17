package com.s;

import com.s.good.SentEmailInter;

public class UserManagement {

    private final SentEmailInter sentEmail;

    public UserManagement(SentEmailInter sentEmail) {
        this.sentEmail = sentEmail;
    }


    // cqs
    public User addUser(User user) {
        sentEmail.sentEmail(user.getId());
        sentSmsCode(user.getId());
        return user;
    }

//    private void sentEmail(int id) {
//        System.out.println("Email sent" + id);
//    }

    private void sentSmsCode(int id) {
        System.out.println("SMS code sent" + id);
    }
}
