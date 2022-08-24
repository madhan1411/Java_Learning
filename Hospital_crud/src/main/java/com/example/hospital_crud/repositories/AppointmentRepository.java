package com.example.hospital_crud.repositories;

import com.example.hospital_crud.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
