package com.careplus.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.Appointment;
import com.careplus.entity.Doctor;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	boolean existsByDoctorAndAppointmentDateTime(Doctor doctor, LocalDateTime appointmentDateTime);
}