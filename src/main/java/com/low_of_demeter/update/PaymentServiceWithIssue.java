package com.low_of_demeter.update;

public class PaymentServiceWithIssue {

    public void processPayment(UserUpdated user, double amount) {
        // ❌ Breaks because getBalance() no longer exists
//        if (user.getBankAccount().getBalance() >= amount) {  // Compilation Error!
            user.getBankAccount().debit(amount);
            System.out.println("Payment of " + amount + " processed.");
//        } else {
            System.out.println("Payment failed: Insufficient funds.");
//        }
    }
}
