package com.example.hospital_crud.repositories;

import com.example.hospital_crud.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
