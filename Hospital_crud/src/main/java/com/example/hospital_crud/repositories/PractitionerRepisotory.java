package com.example.hospital_crud.repositories;

import com.example.hospital_crud.models.Practitioner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PractitionerRepisotory extends JpaRepository<Practitioner,Long> {
}
