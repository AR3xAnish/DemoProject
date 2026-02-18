package com.qwerty.demo.Service;

public class GPayService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println(" google pay processing");
    }
}
