package com.low_of_demeter.fix;

public class PaymentServiceFixed {
    public void processPayment(UserFixed user, double amount) {
        // ✅ Follows Law of Demeter
        if (user.processPayment(amount)) {
            System.out.println("Payment of " + amount + " processed.");
        } else {
            System.out.println("Payment failed: Insufficient funds or account is frozen.");
        }
    }
}
