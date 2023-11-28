package com.flatmateapp.Service.Impl;

import com.flatmateapp.Entity.PackagePayment;
import com.flatmateapp.Repository.PaymentRepository;
import com.flatmateapp.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public PackagePayment savePayment(PackagePayment payment) {
        return paymentRepository.save(payment);
    }
}
