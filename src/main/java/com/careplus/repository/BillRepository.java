package com.careplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}