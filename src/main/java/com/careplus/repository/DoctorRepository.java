package com.careplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findByActiveTrue();
}