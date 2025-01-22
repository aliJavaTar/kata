package com.tdd.Stub;

class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean processOrder(double amount) {
        return paymentService.processPayment(amount);
    }
}