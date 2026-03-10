package com.careplus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	Optional<Patient> findByPhone(String phone);
}