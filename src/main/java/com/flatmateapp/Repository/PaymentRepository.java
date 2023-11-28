package com.flatmateapp.Repository;

import com.flatmateapp.Entity.PackagePayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <PackagePayment, Long> {
}
