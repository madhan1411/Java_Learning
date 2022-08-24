package com.example.hospital_crud.controllers;

import com.example.hospital_crud.models.Patient;
import com.example.hospital_crud.repositories.PatientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {
    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping
    @RequestMapping("patients")
    public List<Patient> get() {
        return this.patientRepository.findAll();
    }

    @PostMapping
    public Patient create(@RequestBody final Patient patient) {
        return patientRepository.save(patient);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.patientRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Patient update(@PathVariable Long id, @RequestBody Patient patient) {
        Patient existingPatient = patientRepository.findById(id).get();
        BeanUtils.copyProperties(patient, existingPatient, "id");
        return patientRepository.saveAndFlush(existingPatient);
    }
}
