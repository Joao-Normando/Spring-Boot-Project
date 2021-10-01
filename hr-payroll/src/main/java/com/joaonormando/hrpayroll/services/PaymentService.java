package com.joaonormando.hrpayroll.services;

import com.joaonormando.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment (long workerId, int days) {
        return new Payment("Joao", 100.0, days);
    }
}
