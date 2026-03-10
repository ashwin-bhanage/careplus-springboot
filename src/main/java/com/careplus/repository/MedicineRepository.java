package com.careplus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

	Optional<Medicine> findByMedicineCode(String medicineCode);
}