package com.careplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.BillItem;

public interface BillItemRepository extends JpaRepository<BillItem, Long> {
}