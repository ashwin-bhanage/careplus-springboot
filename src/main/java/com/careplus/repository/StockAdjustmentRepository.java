package com.careplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.StockAdjustment;

public interface StockAdjustmentRepository extends JpaRepository<StockAdjustment, Long> {
}