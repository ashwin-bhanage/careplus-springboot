package com.careplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}