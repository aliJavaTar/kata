package com.low_of_demeter.old;

public class PaymentService {

    public Account process(User user, double amount) {
        if (user.account().balance() >= amount) {
          return  user.account().deposit(amount);
        } else {
            throw new IllegalArgumentException("");
        }

    }
}
