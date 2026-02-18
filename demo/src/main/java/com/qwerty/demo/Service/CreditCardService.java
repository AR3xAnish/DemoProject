package com.qwerty.demo.Service;


public class CreditCardService implements PaymentService{
    @Override
    public void processPayment(double amount) {
         System.out.println("credit card processing");
    }
}
